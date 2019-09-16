package br.com.padaria.domain;

/**
 *
 * @author luisp
 */
public enum TipoAlimento {
    
    PERICIVEL(0, "Pericivel"),
    NAOPERICIVEL(1, "Não Pericivel");

    private TipoAlimento(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    private Integer id;
    
    private String nome;
    
}
