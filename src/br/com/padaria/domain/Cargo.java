package br.com.padaria.domain;

/**
 *
 * @author luisp
 */  
public enum Cargo {
   
    SELECIONE(0, "Selecione"),
    VENDEDOR(1, "Vendedor"),
    PADEIRO(2, "Padeiro"),
    GERENTE(3, "Gerente");

    private Cargo(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    private Integer id;
    
    private String nome;
}
