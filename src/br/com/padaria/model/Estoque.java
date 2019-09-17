package br.com.padaria.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisp
 */
public class Estoque {

    private List<Produto> produtos = new ArrayList<>();
    
    private Integer unidade;
    
    private Integer TipoProduto;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public Integer getTipoProduto() {
        return TipoProduto;
    }

    public void setTipoProduto(Integer TipoProduto) {
        this.TipoProduto = TipoProduto;
    }
}
