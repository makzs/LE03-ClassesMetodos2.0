package br.edu.up.Models;

public class Pessoa {
    private String nome;
    private int idade;

    

    public String getNome() {
        return nome;
    }



    public int getIdade() {
        return idade;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }



    public void validacao(String nome, int idade){
        if (idade > 18){
            System.out.println(nome + " É maior de idade!");
        }
        else{
            System.out.println(nome + " É menor de idade!");
        }
    }
}
