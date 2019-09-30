package br.com.padaria.model;

import br.com.padaria.domain.FormaPagamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luisp
 * 
 *      `cliente_id` INT(11) NULL DEFAULT NULL,
	`funcionario_id` INT(11) NULL DEFAULT NULL,
	`caixa_id` INT(11) NULL DEFAULT NULL,
        `dataVenda` DATE NULL DEFAULT NULL,
 * 
 * 
 */
public abstract class Venda extends BaseEntity{
     
    private Date dataVenda;  
    
    private Funcionario funcionario;
    
    private Cliente cliente;
    
    double totalVenda;

    public Venda(Date dataVenda, Funcionario funcionario, Cliente cliente, double totalVenda) {
        this.dataVenda = dataVenda;
        this.funcionario = funcionario;
        this.cliente = cliente;
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
}