package br.edu.up.Models;

public class Vendedor {
    private String Nome;
    private double Salario;
    private double ValorVendas;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getValorVendas() {
        return ValorVendas;
    }

    public void setValorVendas(double valorVendas) {
        ValorVendas = valorVendas;
    }
}
