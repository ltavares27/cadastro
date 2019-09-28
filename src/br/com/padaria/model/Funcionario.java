package br.com.padaria.model;

import br.com.padaria.domain.Cargo;

/**
 *
 * @author ltavares
 */
public class Funcionario extends Pessoa{
    
    private double salario;
    
    private double bonificacao;
    
    private Cargo cargo;

    public Funcionario() {
    }   

    public Funcionario(double salario, double bonificacao, String nome, String cpf, String telefone, String endereco, Cargo cargo) {
        super(nome, cpf, telefone, endereco);
        this.salario = salario;
        this.bonificacao = bonificacao;
        this.cargo = cargo;
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    
   
    
}
