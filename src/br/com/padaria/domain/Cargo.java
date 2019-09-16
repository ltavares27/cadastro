package br.com.padaria.domain;

/**
 *
 * @author luisp
 */
public enum Cargo {
   
    VENDEDOR(0, "Vendedor"),
    PADEIRO(1, "Padeiro"),
    GERENTE(2, "Gerente");

    private Cargo(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    private Integer id;
    
    private String nome;
}
