package br.edu.up.Models;

public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;
    private char saude;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSaude() {
        return saude;
    }

    public void setSaude(char saude) {
        this.saude = saude;
    }

    public Pessoa(String nome, char sexo, int idade, char saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApto() {
        return (idade >= 18 && idade <= 25) && (sexo == 'M' || sexo == 'm') && saude == 'B';
    }

}