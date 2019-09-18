package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public Cliente update(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
