package br.com.padaria.model;

/**
 *
 * @author luisp
 */
public class Fornecedor extends BaseEntity {
    
    private String razaoSocial;
    
    private String endereco;
    
    private String cnpj;
    
    private boolean recorrente;
  

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean getRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }
    
    
}
