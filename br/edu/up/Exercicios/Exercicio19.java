package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.Triangulo;

public class Exercicio19 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado do triângulo:");
        int lado1 = leitor.nextInt();

        System.out.println("Digite o valor do segundo lado do triângulo:");
        int lado2 = leitor.nextInt();

        System.out.println("Digite o valor do terceiro lado do triângulo:");
        int lado3 = leitor.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.verificarTriangulo()) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os valores formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os valores formam um triângulo isóscele.");
            } else {
                System.out.println("Os valores formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não podem formar um triângulo.");
        }

        leitor.close();
    }
}
