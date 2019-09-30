package br.com.padaria.model;

import br.com.padaria.domain.FormaPagamento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luisp
 */
public class Caixa extends BaseEntity {
    
    private Integer quantidadeProduto;
    
    private double subTotalPorProduto;
    
    private FormaPagamento formaPagamento;
    
    private Integer parcelas;
    
    private double subTotalAPagar;
    
    private double totalAPagar;    
    
    private List<Produto> produtos = new ArrayList<>();
    
    private Produto produto;

    public Caixa(Integer quantidadeProduto, double subTotalPorProduto, FormaPagamento formaPagamento, Integer parcelas, double subTotalAPagar, double totalAPagar, Produto produto) {
        this.quantidadeProduto = quantidadeProduto;
        this.subTotalPorProduto = subTotalPorProduto;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.subTotalAPagar = subTotalAPagar;
        this.totalAPagar = totalAPagar;
        this.produto = produto;
    }
    
    public Caixa(){}

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getSubTotalPorProduto() {
        return subTotalPorProduto;
    }

    public void setSubTotalPorProduto(double subTotalPorProduto) {
        this.subTotalPorProduto = subTotalPorProduto;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public double getSubTotalAPagar() {
        return subTotalAPagar;
    }

    public void setSubTotalAPagar(double subTotalAPagar) {
        this.subTotalAPagar = subTotalAPagar;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
