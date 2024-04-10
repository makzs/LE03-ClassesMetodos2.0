package br.edu.up.Models;

public class Aluno {
    private String Name;
    private double Nota1;
    private double Nota2;
    private double Nota3;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double nota1) {
        Nota1 = nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double nota2) {
        Nota2 = nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double nota3) {
        Nota3 = nota3;
    }

    public double media(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    

}
