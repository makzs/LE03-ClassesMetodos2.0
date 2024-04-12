package br.edu.up.Models;

public class Funcionario {
    private String nome;
    private double salario;
    private double salarioMinimo;
    private double reajuste;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
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

}
