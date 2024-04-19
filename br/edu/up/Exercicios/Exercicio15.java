package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.CalcularDesconto;

public class Exercicio15 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        CalcularDesconto calculadora = new CalcularDesconto();

        while (true) {
            System.out.println("Informe o tipo de combustível do veículo (álcool, gasolina, diesel) ou digite '0' para encerrar:");
            String combustivel = leitor.nextLine().toLowerCase();

            if (combustivel.equals("0")) {
                break;
            }

            System.out.println("Informe o valor do veículo:");
            double valorVeiculo = leitor.nextDouble();
            leitor.nextLine();

            calculadora.executarCalculadoraCombustivel(combustivel, valorVeiculo);
        }

        calculadora.exibirTotais();
        leitor.close();
    }
}
