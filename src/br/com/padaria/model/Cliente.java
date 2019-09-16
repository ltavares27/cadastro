package br.com.padaria.model;

import br.com.padaria.domain.TipoCartaoFidelidade;

/**
 *
 * @author ltavares
 */
public class Cliente extends Pessoa{

    public Cliente(String nome, String cpf, String telefone, String endereco, TipoCartaoFidelidade tipoCartaoFidelidade) {
        super(nome, cpf, telefone, endereco);
        this.tipoCartaoFidelidade = tipoCartaoFidelidade;
    }
    
    private TipoCartaoFidelidade tipoCartaoFidelidade;

    public TipoCartaoFidelidade getTipoCartaoFidelidade() {
        return tipoCartaoFidelidade;
    }

    public void setTipoCartaoFidelidade(TipoCartaoFidelidade tipoCartaoFidelidade) {
        this.tipoCartaoFidelidade = tipoCartaoFidelidade;
    }   
}
