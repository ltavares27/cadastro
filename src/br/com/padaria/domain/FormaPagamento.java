package br.com.padaria.domain;

/**
 *
 * @author luisp
 */
public enum FormaPagamento {
    
    AVISTA(0,"Á vista"),
    DEBITO(1, "Débito"),
    CREDITO(2, "Crédito");

    private FormaPagamento(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    private Integer id;
    
    private String nome;
}
