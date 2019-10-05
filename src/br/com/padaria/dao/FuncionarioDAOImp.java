package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.domain.Cargo;
import br.com.padaria.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ltavares
 */
public class FuncionarioDAOImp implements IBaseDAO<Funcionario> {
    
    private Connection con = null;

    public FuncionarioDAOImp() {
        con = ConnectionFactory.getConnetion();
    }
  
    @Override
    public Funcionario save(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario (nome, cpf, telefone, endereco, cargo, salario, bonificacao) VALUES (?, ?, ?, ?, ?,?,?)";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);  
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getEndereco());
            
            
            stmt.setInt(5, funcionario.getCargo());
            stmt.setDouble(6, funcionario.getSalario());
            stmt.setDouble(7, funcionario.getBonificacao());           
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco"+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return funcionario;
    }

    @Override
    public Funcionario update(Funcionario funcionario) {
        Connection con = ConnectionFactory.getConnetion();
        String sql = "UPDATE funcionario SET nome = ?, cpf = ? , telefone = ?, endereco = ?, cargo = ?, salario = ?, bonificacao = ? "
                   + "WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);     
           stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getEndereco());
            stmt.setInt(5, funcionario.getCargo());
            stmt.setDouble(6, funcionario.getSalario());
            stmt.setDouble(7, funcionario.getBonificacao());        
            stmt.setInt(8, funcionario.getId());        
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco "+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return funcionario;
    }

    @Override
    public List<Funcionario> findAll() {
       List<Funcionario> funcionarios =  new ArrayList<>();
       String sql = "SELECT * FROM  funcionario";
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          stmt = con.prepareStatement(sql);
          result = stmt.executeQuery();
          
            while(result.next()){
               Funcionario funcionario = new Funcionario();
               funcionario.setId(result.getInt("id"));
               funcionario.setNome(result.getString("nome"));
               funcionario.setCpf(result.getString("cpf"));
               funcionario.setEndereco(result.getString("endereco"));
               funcionario.setTelefone(result.getString("telefone"));
               
               Integer tipoId = result.getObject("cargo", Integer.class);
               if(tipoId != null){
                   funcionario.setCargo(tipoId);          
               }          
               funcionarios.add(funcionario);
            }  
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return funcionarios;
    }

    @Override
    public boolean delete(Funcionario funcionario) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, funcionario.getId());
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
    public Funcionario findById(Integer id) {
       Funcionario funcionario =  new Funcionario();
       String sql = "SELECT * FROM  cliente WHERE id = ?";
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          if(id != null) {  
          stmt = con.prepareStatement(sql);
          stmt.setInt(1, id);
          result = stmt.executeQuery();   
          
            while(result.next()){           
                funcionario.setId(result.getInt("id"));
                funcionario.setNome(result.getString("nome"));
                funcionario.setCpf(result.getString("cpf"));
                funcionario.setEndereco(result.getString("endereco"));
                funcionario.setTelefone(result.getString("telefone"));

                Integer tipoId = result.getObject("tipoCartaoFidelidade", Integer.class);
                if(tipoId != null){
                    funcionario.setCargo(tipoId);          
                 }
               }            
            }  
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return funcionario;
    }   
}
