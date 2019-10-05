package br.com.padaria.model;

import br.com.padaria.domain.Cargo;

/**
 *
 * @author ltavares
 */
public class Funcionario extends Pessoa{
    
    private double salario;
    
    private double bonificacao;
    
    private Integer cargoId;

    public Funcionario() {
    }   

    public Funcionario(double salario, double bonificacao, String nome, String cpf, String telefone, String endereco, Integer cargoId) {
        super(nome, cpf, telefone, endereco);
        this.salario = salario;
        this.bonificacao = bonificacao;
        this.cargoId = cargoId;
    }   
  
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Integer getCargo() {
        return cargoId;
    }

    public void setCargo(Integer cargoId) {
        this.cargoId = cargoId;
    }
    
    
   
    
}
