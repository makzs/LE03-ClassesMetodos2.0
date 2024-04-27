package br.edu.up.Exercicios;

import br.edu.up.Models.Pessoa;

import java.util.Scanner;

public class Exercicio11 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = leitor.nextLine();

            System.out.println("Informe o sexo da pessoa " + i + " (M para masculino, F para feminino):");
            char sexo = leitor.nextLine().toUpperCase().charAt(0);


            Pessoa pessoa = new Pessoa(nome, sexo);

            if (pessoa.getSexo() == 'M') {
                System.out.println(pessoa.getNome() + " é homem.");
                totalHomens++;
            } else if (pessoa.getSexo() == 'F') {
                System.out.println(pessoa.getNome() + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
                i--;
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        leitor.close();
    }
}
