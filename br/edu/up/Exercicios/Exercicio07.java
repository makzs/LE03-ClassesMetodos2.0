package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.Carro;

public class Exercicio07 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de custo: ");
        double preco = leitor.nextDouble();
        leitor.close();

        System.out.println("Valor Venda: " + Carro.Calcular(preco));

    }
}
