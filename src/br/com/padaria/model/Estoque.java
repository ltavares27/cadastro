package br.com.padaria.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisp
 */
public class Estoque extends BaseEntity {

    private Produto produto;
    
    private Integer unidade;
    
    private Integer TipoProduto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
