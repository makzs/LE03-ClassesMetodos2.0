package br.edu.up.Models;

public class Vendas {
    private double preco;
    private int taxa;

    public double getPreco() {
        return preco;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public double vender(double preco, int taxa){
        return preco + ((preco * taxa) / 100);
    }
}
