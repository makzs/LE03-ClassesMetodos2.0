package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.MamaoComAcucar;

public class Exercicio05 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor do produto:");
        double preco = leitor.nextDouble();
        leitor.close();

        System.out.println("O valor das 5 prestaçoes é" + MamaoComAcucar.Parcela(preco));

    }
}