package br.com.padaria.model;

import br.com.padaria.domain.TipoAlimento;
import java.util.Date;

/**
 *
 * @author luisp
 */
public class Produto extends BaseEntity {
    
    private String nome;
    
    private String codigo;
    
    private String apelido;
    
    private Fornecedor fornecedor;
    
    private double precoCusto;
    
    private double precoFinal;
    
    private TipoAlimento tipoAlimento;
    
    private Date dataValidade;

    public Produto(String nome, String codigo, String apelido, Fornecedor fornecedor, double precoCusto, double precoFinal, TipoAlimento tipoAlimento, Date dataValidade) {
        this.nome = nome;
        this.apelido = apelido;
        this.fornecedor = fornecedor;
        this.precoCusto = precoCusto;
        this.precoFinal = precoFinal;
        this.tipoAlimento = tipoAlimento;
        this.dataValidade = dataValidade;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public TipoAlimento getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(TipoAlimento tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}
