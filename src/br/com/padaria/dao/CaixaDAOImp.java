package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.domain.FormaPagamento;
import br.com.padaria.model.Caixa;
import br.com.padaria.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ltavares
 * 
 * CREATE TABLE `caixa` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`produto_id` INT(11) NULL DEFAULT NULL,
	`quantidadeProduto` INT(11) NULL DEFAULT NULL,
        `subTotalPorProduto` FLOAT(11) NULL DEFAULT NULL,
        `subTotalAPagar` FLOAT(11) NULL DEFAULT NULL,
        `totalAPagar` FLOAT(11) NULL DEFAULT NULL,
        `formaPagamento` TINYINT NULL DEFAULT NULL,
        `parcelas` INT(11) NULL DEFAULT NULL,
	 PRIMARY KEY (`id`)
   )

 * 
 * 
 */
public class CaixaDAOImp implements IBaseDAO<Caixa> {
    
    private ProdutoDAOImp produtoDAO = new ProdutoDAOImp();
    
    private Connection con = null;

    public CaixaDAOImp() {
        con = ConnectionFactory.getConnetion();
    }
  
    @Override
    public Caixa save(Caixa caixa) {
        String sql = "INSERT INTO caixa (produto_id, quantidadeProduto, subTotalPorProduto, subTotalAPagar, totalAPagar, formaPagamento, parcelas) "
                +    " VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);  
            stmt.setObject(1, caixa.getProduto());
            stmt.setInt(2, caixa.getQuantidadeProduto());
            stmt.setDouble(3, caixa.getSubTotalPorProduto());
            stmt.setDouble(4, caixa.getSubTotalAPagar());
            stmt.setDouble(5, caixa.getTotalAPagar());
            stmt.setObject(6, caixa.getFormaPagamento());
            stmt.setInt(7, caixa.getParcelas());
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco"+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return caixa;
    }

    @Override
    public Caixa update(Caixa caixa) {
        Connection con = ConnectionFactory.getConnetion();
        String sql = "UPDATE caixa SET produto_id = ?, quantidadeProduto = ?, subTotalPorProduto = ?, subTotalAPagar = ?, totalAPagar = ?,"
                + " formaPagamento = ?, parcelas = ? "
                + " WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);     
            stmt.setObject(1, caixa.getProduto());
            stmt.setInt(2, caixa.getQuantidadeProduto());
            stmt.setDouble(3, caixa.getSubTotalPorProduto());
            stmt.setDouble(4, caixa.getSubTotalAPagar());
            stmt.setDouble(5, caixa.getTotalAPagar());
            stmt.setObject(6, caixa.getFormaPagamento());
            stmt.setInt(7, caixa.getParcelas());
            stmt.setInt(8, caixa.getId());
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco "+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return caixa;
    }

    @Override
    public List<Caixa> findAll() {
       List<Caixa> caixas =  new ArrayList<>();
       Caixa caixa = new Caixa();
       String sql = "SELECT * FROM  caixa";
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          stmt = con.prepareStatement(sql);
          result = stmt.executeQuery();
          
            while(result.next()){
              
               caixa.setId(result.getInt("id"));               
               Integer IdProduto = result.getObject("produto_id", Integer.class);
               if(IdProduto != null && IdProduto != 0){
                   Produto produto = produtoDAO.findById(IdProduto);
                   caixa.setProduto(produto);
               }              
               caixa.setQuantidadeProduto(result.getInt("quantidadeProduto"));
               caixa.setSubTotalPorProduto(result.getDouble("subTotalPorProduto"));
               caixa.setSubTotalAPagar(result.getDouble("subTotalAPagar"));
               caixa.setTotalAPagar(result.getDouble("totalAPagar"));
               caixa.setParcelas(result.getInt("parcelas"));
               
               Integer tipoId = result.getObject("formaPagamento", Integer.class);
               if(tipoId != null && tipoId != 0){
                   caixa.setFormaPagamento(FormaPagamento.values()[tipoId]);          
               }            
               caixas.add(caixa);
            }  
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return caixas;
    }

    @Override
    public boolean delete(Caixa caixa) {
        String sql = "DELETE FROM caixa WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, caixa.getId());
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
    public Caixa findById(Integer id) {
       Caixa caixa =  new Caixa();
       String sql = "SELECT * FROM caixa WHERE id = ?";
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          if(id != null) {  
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            result = stmt.executeQuery(); 
          }          
            while(result.next()){           
                caixa.setId(result.getInt("id"));               
                 Integer IdProduto = result.getObject("produto_id", Integer.class);
                 if(IdProduto != null && IdProduto != 0){
                     Produto produto = produtoDAO.findById(IdProduto);
                 }              
                 caixa.setQuantidadeProduto(result.getInt("quantidadeProduto"));
                 caixa.setSubTotalPorProduto(result.getDouble("subTotalPorProduto"));
                 caixa.setSubTotalAPagar(result.getDouble("subTotalAPagar"));
                 caixa.setTotalAPagar(result.getDouble("totalAPagar"));
                 caixa.setParcelas(result.getInt("parcelas"));

                 Integer tipoId = result.getObject("formaPagamento", Integer.class);
                 if(tipoId != null && tipoId != 0){
                     caixa.setFormaPagamento(FormaPagamento.values()[tipoId]);          
                 }       
            } 
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
         }
         return caixa;
       }   
}
