package br.edu.up.Models;

public class Automovel {
    private int distancia;
    private int combustivel;

    public int getDistancia() {
        return distancia;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setDistancia(int distancia) {
        if (distancia > 0){
            this.distancia = distancia;
        }
    }

    public void setCombustivel(int combustivel) {
        if (combustivel > 0){
            this.combustivel = combustivel;
        }
    }

}
