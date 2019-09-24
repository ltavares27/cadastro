package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.model.Cliente;
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
public class ClienteDAOImp implements IBaseDAO<Cliente> {
    
    private Connection con = null;

    public ClienteDAOImp() {
        con = ConnectionFactory.getConnetion();
    }
  
    @Override
    public Cliente save(Cliente cliente) {
        String sql = "INSERT INTO cliente (id, nome, cpf, telefone, endereco, tipoCartaoFidelidade) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEndereco());
            stmt.setInt(6, cliente.getTipoCartaoFidelidade().getId());
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco"+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return cliente;
    }

    @Override
    public Cliente update(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, cpf = ? , telefone = ?, endereco = ?, tipoCartaoFidelidade = ?  "
                   + "WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEndereco());
            stmt.setInt(6, cliente.getTipoCartaoFidelidade().getId());
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco"+ ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
       List<Cliente> clientes =  new ArrayList<>();
       String sql = "SELECT * FROM  cliente";
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          stmt = con.prepareStatement(sql);
          result = stmt.executeQuery();
          
            while(result.next()){
               Cliente cliente = new Cliente();
               cliente.setId(result.getInt("id"));
               cliente.setNome(result.getNString("nome"));
               cliente.setCpf(result.getNString("cpf"));
               cliente.setEndereco(result.getNString("endereco"));
               cliente.setTelefone(result.getNString("telefone"));
               clientes.add(cliente);
            }  
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return clientes;
    }

    @Override
    public boolean delete(Cliente cliente) {
        String sql = "DELETE * FROM cliente WHERE id = ?";
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cliente.getId());
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
    public Cliente findById(Integer id) {
       Cliente cliente =  new Cliente();
       String sql = "SELECT * FROM  cliente WHERE id = "+ id;
       PreparedStatement stmt = null;    
       ResultSet result = null ;
        try {
          stmt = con.prepareStatement(sql);
          result = stmt.executeQuery();
           
         cliente.setId(result.getInt("id"));
         cliente.setNome(result.getNString("nome"));
         cliente.setCpf(result.getNString("cpf"));
         cliente.setEndereco(result.getNString("endereco"));
         cliente.setTelefone(result.getNString("telefone"));
         
         } catch (SQLException ex){
             System.err.println("Erro ao tentar buscar dados no banco"+ ex);
         } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return cliente;
    }   
}
