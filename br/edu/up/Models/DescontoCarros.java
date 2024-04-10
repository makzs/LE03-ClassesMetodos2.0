package br.edu.up.Models;

public class DescontoCarros {
    private double preco;
    private int ano;

    public double getPreco() {
        return preco;
    }
    public int getAno() {
        return ano;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double desconto7(double preco){
        return (preco * 7) / 100;
    }

    public double desconto12(double preco){
        return (preco * 12) / 100;
    }
}
