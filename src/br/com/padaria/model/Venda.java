package br.com.padaria.model;

import java.sql.Date;

/**
 *
 * @author ltavares
 */
public class Venda extends BaseEntity{
     
    private Date dataVenda;  
    
    private Funcionario funcionario;
    
    private Cliente cliente;
    
    private Caixa caixa;
    
    double totalVenda;

    public Venda(Date dataVenda, Funcionario funcionario, Cliente cliente, Caixa caixa, double totalVenda) {
        this.dataVenda = dataVenda;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.caixa = caixa;
        this.totalVenda = totalVenda;
    }

    public Venda() {
    }  

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
}