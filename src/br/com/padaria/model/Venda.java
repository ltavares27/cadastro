package br.com.padaria.model;

import br.com.padaria.domain.FormaPagamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luisp
 */
public abstract class Venda {
  
    private List<Produto> produtos = new ArrayList<>();
    
    private Date dataVenda;
    
    private FormaPagamento formaPagamento;
    
    private Funcionario funcionario;
    
    private Cliente cliente;

    public Venda(Date dataVenda, FormaPagamento formaPagamento, Funcionario funcionario, Cliente cliente) {
        this.dataVenda = dataVenda;
        this.formaPagamento = formaPagamento;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
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
}
