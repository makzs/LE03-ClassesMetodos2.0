package br.edu.up.Models;

public class Boletim {
    private double notaLaboratorio;
    private double notaAvaliacao;
    private double notaExame;

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }
    public void setNotaLaboratorio(double notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }
    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }
    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }
    public double getNotaExame() {
        return notaExame;
    }
    public void setNotaExame(double notaExame) {
        this.notaExame = notaExame;
    }

    public static double notaFinal(double nota1, double nota2, double nota3){
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
    }
}
