package br.com.padaria.model;

import br.com.padaria.domain.TipoCartaoFidelidade;

/**
 *
 * @author ltavares
 */
public class Cliente extends Pessoa {

    private TipoCartaoFidelidade tipoCartaoFidelidade;

    public Cliente() {
    }

    public Cliente(TipoCartaoFidelidade tipoCartaoFidelidade, String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone, endereco);
        this.tipoCartaoFidelidade = tipoCartaoFidelidade;
    }

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone, endereco);
    }

    public TipoCartaoFidelidade getTipoCartaoFidelidade() {
        return tipoCartaoFidelidade;
    }

    public void setTipoCartaoFidelidade(TipoCartaoFidelidade tipoCartaoFidelidade) {
        this.tipoCartaoFidelidade = tipoCartaoFidelidade;
    }   
}
