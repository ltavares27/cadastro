package br.com.padaria.dao;

import br.com.padaria.connection.ConnectionFactory;
import br.com.padaria.model.Caixa;
import br.com.padaria.model.Cliente;
import br.com.padaria.model.Funcionario;
import br.com.padaria.model.Venda;
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
public class VendaDAOImp implements IBaseDAO<Venda> {

    private Connection con = null;

    public VendaDAOImp() {
        con = ConnectionFactory.getConnetion();
    }

    @Override
    public Venda save(Venda venda) {
        String sql = "INSERT INTO venda (cliente_id, funcionario_id, caixa_id, dataVenda) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda.getCliente().getId());
            stmt.setInt(2, venda.getFuncionario().getId());
            stmt.setInt(3, venda.getCaixa().getId());
            stmt.setDate(4, venda.getDataVenda());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return venda;
    }

    @Override
    public Venda update(Venda venda) {
        Connection con = ConnectionFactory.getConnetion();
        String sql = "UPDATE venda SET cliente_id = ?, funcionario_id = ? , caixa_id = ?, dataVenda = ?  "
                + "WHERE id = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda.getCliente().getId());
            stmt.setInt(2, venda.getFuncionario().getId());
            stmt.setInt(3, venda.getCaixa().getId());
            stmt.setDate(4, venda.getDataVenda());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar gravar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt);
        }
        return venda;
    }

    @Override
    public List<Venda> findAll() {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT * FROM  venda";
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            stmt = con.prepareStatement(sql);
            result = stmt.executeQuery();

            while (result.next()) {
                Venda venda = new Venda();
                venda.setId(result.getInt("id"));
                venda.setCliente(buildCliente(result.getObject("cliente_id", Integer.class)));
                venda.setFuncionario(buildFuncionario(result.getObject("funcionario_id", Integer.class)));
                venda.setCaixa(buildCaixa(result.getObject("caixa_id", Integer.class)));
                venda.setDataVenda(result.getDate("dataVenda"));
                vendas.add(venda);
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar buscar dados no banco" + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return vendas;
    }

    @Override
    public boolean delete(Venda venda) {
        String sql = "DELETE FROM venda WHERE id = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda.getId());
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
    public Venda findById(Integer id) {
        Venda venda = new Venda();
        String sql = "SELECT * FROM  venda WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            if (id != null) {
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                while (result.next()) {
                    venda.setId(result.getInt("id"));
                    venda.setCliente(buildCliente(result.getObject("cliente_id", Integer.class)));
                    venda.setFuncionario(buildFuncionario(result.getObject("funcionario_id", Integer.class)));
                    venda.setCaixa(buildCaixa(result.getObject("caixa_id", Integer.class)));
                    venda.setDataVenda(result.getDate("dataVenda"));
                }
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao tentar buscar dados no banco " + ex);
        } finally {
            ConnectionFactory.closeConnetion(con, stmt, result);
        }
        return venda;
    }

    private Cliente buildCliente(Integer idCliente) {
        if (idCliente != null) {
            return new ClienteDAOImp().findById(idCliente);
        }
        return null;
    }

    private Funcionario buildFuncionario(Integer idFuncionario) {
        if (idFuncionario != null) {
            return new FuncionarioDAOImp().findById(idFuncionario);
        }
        return null;
    }

    private Caixa buildCaixa(Integer idCaixa) {
        if (idCaixa != null) {
            return new CaixaDAOImp().findById(idCaixa);
        }
        return null;
    }
}
