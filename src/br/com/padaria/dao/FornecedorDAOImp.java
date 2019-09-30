package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.model.Fornecedor;
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
public class FornecedorDAOImp implements IBaseDAO<Fornecedor> {

    private Connection con = null;

    public FornecedorDAOImp() {
        con = ConnectionFactory.getConnetion();
    }

    @Override
    public Fornecedor save(Fornecedor fornecedor) {
        String sql = "INSERT INTO fornecedor (razaoSocial, cnpj, endereco, recorrente) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, fornecedor.getRazaoSocial());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setBoolean(4, fornecedor.isRecorrente());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return fornecedor;
    }

    @Override
    public Fornecedor update(Fornecedor fornecedor) {
        Connection con = ConnectionFactory.getConnetion();
        String sql = "UPDATE fornecedor SET razaoSocial = ?, cnpj = ? , endereco = ?, recorrente = ? "
                + "WHERE id = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, fornecedor.getRazaoSocial());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setBoolean(4, fornecedor.isRecorrente());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return fornecedor;
    }

    @Override
    public List<Fornecedor> findAll() {
        List<Fornecedor> fornecedors = new ArrayList<>();
        Fornecedor fornecedor = new Fornecedor();
        String sql = "SELECT * FROM  fornecedor";
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            stmt = con.prepareStatement(sql);
            result = stmt.executeQuery();

            while (result.next()) {
                fornecedor.setId(result.getInt("id"));
                fornecedor.setRazaoSocial(result.getString("razaoSocial"));
                fornecedor.setCnpj(result.getString("cnpj"));
                fornecedor.setEndereco(result.getString("endereco"));
                fornecedor.setRecorrente(result.getBoolean("recorrente"));
                fornecedors.add(fornecedor);
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar buscar dados no banco" + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return fornecedors;
    }

    @Override
    public boolean delete(Fornecedor fornecedor) {
        String sql = "DELETE FROM fornecedor WHERE id = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, fornecedor.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco" + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return false;
    }

    @Override
    public Fornecedor findById(Integer id) {
        Fornecedor fornecedor = new Fornecedor();
        String sql = "SELECT * FROM  fornecedor WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            if (id != null) {
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                while (result.next()) {
                    fornecedor.setId(result.getInt("id"));
                    fornecedor.setRazaoSocial(result.getString("razaoSocial"));
                    fornecedor.setCnpj(result.getString("cnpj"));
                    fornecedor.setEndereco(result.getString("endereco"));
                    fornecedor.setRecorrente(result.getBoolean("recorrente"));
                }
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar buscar dados no banco" + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return fornecedor;
    }
}
