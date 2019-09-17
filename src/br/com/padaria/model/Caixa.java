package br.com.padaria.model;

import br.com.padaria.domain.FormaPagamento;
import java.util.Date;

/**
 *
 * @author luisp
 */
public class Caixa extends Venda{

    public Caixa(Integer quantidadeProduto, double subTotalPorProduto, Integer parcelas, double subTotalAPagar, double totalAPagar, Date dataVenda, FormaPagamento formaPagamento, Funcionario funcionario, Cliente cliente) {
        super(dataVenda, formaPagamento, funcionario, cliente);
        this.quantidadeProduto = quantidadeProduto;
        this.subTotalPorProduto = subTotalPorProduto;
        this.parcelas = parcelas;
        this.subTotalAPagar = subTotalAPagar;
        this.totalAPagar = totalAPagar;
    }

    private Integer quantidadeProduto;
    
    private double subTotalPorProduto;
    
    private Integer parcelas;
    
    private double subTotalAPagar;
    
    private double totalAPagar;

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
}
