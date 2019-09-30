package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.domain.TipoAlimento;
import br.com.padaria.model.Fornecedor;
import br.com.padaria.model.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ltavares
 * 
 * 
 * CREATE TABLE `produto` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
        `codigo` VARCHAR(255) NULL DEFAULT NULL,
        `apelido` VARCHAR(255) NULL DEFAULT NULL,
	`fornecedor_id` INT(11) NULL DEFAULT NULL,
        `precoCusto` FLOAT(11) NULL DEFAULT NULL,
        `precoFinal` FLOAT(11) NULL DEFAULT NULL,
        `tipoAlimento` TINYINT NULL DEFAULT NULL,
        `dataValidade` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
 * 
 * 
 */
public class ProdutoDAOImp implements IBaseDAO<Produto> {
    
    private Connection con = null;

    public ProdutoDAOImp() {
        con = ConnectionFactory.getConnetion();
    }
  
    @Override
    public Produto save(Produto produto) {
        String sql = "INSERT INTO produto (codigo, apelido, fornecedor_id, precoCusto, precoFinal, tipoAlimento, dataValidade)"
                   + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);  
            stmt.setString(1, produto.getCodigo());
            stmt.setString(2, produto.getApelido());
            stmt.setObject(3, produto.getFornecedor());
            stmt.setDouble(4, produto.getPrecoCusto());
            stmt.setDouble(5, produto.getPrecoFinal());
            stmt.setObject(6, produto.getTipoAlimento());           
            stmt.setDate(7, (Date) produto.getDataValidade());           
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco"+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return produto;
    }

    @Override
    public Produto update(Produto produto) {
        Connection con = ConnectionFactory.getConnetion();
        String sql = "UPDATE produto SET codigo = ?, apelido = ?, fornecedor_id = ?, precoCusto = ?,"
                   + "precoFinal = ?, tipoAlimento = ?, dataValidade = ?"
                   + "WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);     
            stmt.setString(1, produto.getCodigo());
            stmt.setString(2, produto.getApelido());
            stmt.setObject(3, produto.getFornecedor());
            stmt.setDouble(4, produto.getPrecoCusto());
            stmt.setDouble(5, produto.getPrecoFinal());
            stmt.setObject(6, produto.getTipoAlimento());           
            stmt.setDate(7, (Date) produto.getDataValidade());
            stmt.setInt(8, produto.getId());
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco "+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return produto;
    }

    @Override
    public List<Produto> findAll() {
       List<Produto> produtos =  new ArrayList<>();
       String sql = "SELECT * FROM  produto";
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          stmt = con.prepareStatement(sql);
          result = stmt.executeQuery();
          
            while(result.next()){
              Produto produto = new Produto();
               produto.setId(result.getInt("id"));
               produto.setCodigo(result.getString("codigo"));
               produto.setApelido(result.getString("appelido"));
               produto.setPrecoCusto(result.getDouble("precoCusto"));
               produto.setPrecoFinal(result.getDouble("precoFinal"));               
  //             produto.setFornecedor(BuildFornecedor(result.getInt("fornecedor_id")));               
               Integer tipoId = result.getObject("tipoAlimento", Integer.class);
               if(tipoId != null && tipoId != 0){
                   produto.setTipoAlimento(TipoAlimento.values()[tipoId]);          
               }          
               
               produtos.add(produto);
            }  
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return produtos;
    }

    @Override
    public boolean delete(Produto produto) {
        String sql = "DELETE FROM produto WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, produto.getId());
            stmt.executeUpdate();     
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco"+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return false;
    }

    @Override
    public Produto findById(Integer id) {
       Produto produto =  new Produto();
       String sql = "SELECT * FROM  cliente WHERE id = ?";
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          if(id != null) {  
          stmt = con.prepareStatement(sql);
          stmt.setInt(1, id);
          result = stmt.executeQuery();   
          
            while(result.next()){           
               produto.setId(result.getInt("id"));
               produto.setCodigo(result.getString("codigo"));
               produto.setApelido(result.getString("appelido"));
               produto.setPrecoCusto(result.getDouble("precoCusto"));
               produto.setPrecoFinal(result.getDouble("precoFinal"));               
               produto.setFornecedor(BuildFornecedor(result.getInt("fornecedor_id")));               
               Integer tipoId = result.getObject("tipoAlimento", Integer.class);
               if(tipoId != null && tipoId != 0){
                   produto.setTipoAlimento(TipoAlimento.values()[tipoId]);          
                 }          
               }            
            }  
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return produto;
    }   

    private Fornecedor BuildFornecedor(Integer idFornecedor) {
       return new FornecedorDAOImp().findById(idFornecedor);
    }
}
