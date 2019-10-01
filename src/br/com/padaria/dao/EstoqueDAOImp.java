package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.model.Estoque;
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
 */
public class EstoqueDAOImp implements IBaseDAO<Estoque> {

    private Connection con = null;

    public EstoqueDAOImp() {
        con = ConnectionFactory.getConnetion();
    }

    @Override
    public Estoque save(Estoque estoque) {
        String sql = "INSERT INTO estoque (produto_id, unidade) VALUES (?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, estoque.getProduto().getId());
            stmt.setInt(2, estoque.getUnidade());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return estoque;
    }

    @Override
    public Estoque update(Estoque estoque) {
        Connection con = ConnectionFactory.getConnetion();
        String sql = "UPDATE estoque SET produto_id = ?, unidade = ? "
                + "WHERE id = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, estoque.getProduto().getId());
            stmt.setInt(2, estoque.getUnidade());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return estoque;
    }

    @Override
    public List<Estoque> findAll() {
        List<Estoque> estoques = new ArrayList<>();
        String sql = "SELECT * FROM  estoque";
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            stmt = con.prepareStatement(sql);
            result = stmt.executeQuery();

            while (result.next()) {
                Estoque estoque = new Estoque();
                estoque.setId(result.getInt("id"));
                estoque.setProduto(buildProduto(result.getObject("produto_id", Integer.class)));
                estoque.setUnidade(result.getInt("unidade"));
                estoques.add(estoque);
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar buscar dados no banco" + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return estoques;
    }

    @Override
    public boolean delete(Estoque estoque) {
        String sql = "DELETE FROM estoque WHERE id = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, estoque.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return false;
    }

    @Override
    public Estoque findById(Integer id) {
        Estoque estoque = new Estoque();
        String sql = "SELECT * FROM  estoque WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            if (id != null) {
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                while (result.next()) {
                    estoque.setId(result.getInt("id"));
                    estoque.setProduto(buildProduto(result.getObject("produto_id", Integer.class)));
                    estoque.setUnidade(result.getInt("unidade"));
                }
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar buscar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return estoque;
    }

    private Produto buildProduto(Integer idProduto) {
         if (idProduto != null) {
            return new ProdutoDAOImp().findById(idProduto);
        }
        return null;
    }
}
