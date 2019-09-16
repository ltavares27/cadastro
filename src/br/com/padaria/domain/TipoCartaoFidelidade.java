package br.com.padaria.domain;
/**
 *
 * @author luisp
 */
public enum TipoCartaoFidelidade {
  
    GOLD(1,"Gold"),
    PLATINUM(2, "Platinum");

    private TipoCartaoFidelidade(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }    
    
    private Integer id;
    
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
