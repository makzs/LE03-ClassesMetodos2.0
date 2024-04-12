package br.edu.up.Models;

public class Funcionario {
    private double salario;
    private String nome;
    private int idade;
    private char sexo;

    public double getSalario() {
        return salario;
    }


    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public char getSexo() {
        return sexo;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void abono(double bonus){
        salario += bonus;
    }
    
}
