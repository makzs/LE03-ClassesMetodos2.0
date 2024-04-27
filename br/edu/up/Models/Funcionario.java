package br.edu.up.Models;

public class Funcionario {
    private double salario;
    private String nome;
    private int idade;
    private char sexo;
    private double salarioMinimo;
    private double reajuste;

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
    

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }

    public Funcionario(){

    }

    public Funcionario(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
        this.reajuste = calcularReajuste();
    }

    private double calcularReajuste() {
        if (salario < salarioMinimo * 3) {
            return salario * 0.5;
        } else if (salario >= salarioMinimo * 3 && salario <= salarioMinimo * 10) {
            return salario * 0.2;
        } else if (salario > salarioMinimo * 10 && salario <= salarioMinimo * 20) {
            return salario * 0.15;
        } else {
            return salario * 0.1;
        }
    }

    public double calcularNovoSalario() {
        return salario + reajuste;
    }

    public double getSalario() {
        return salario;
    }

}
