package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.Nadador;

public class Exercicio21 {
    public void executar() {
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade do nadador:");
        idade = leitor.nextInt();

        var nadador = new Nadador(idade);


        System.out.println("O nadador está na categoria: " + nadador.classificarNadador());

        leitor.close();
    }
}
