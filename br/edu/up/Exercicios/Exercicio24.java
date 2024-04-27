package br.edu.up.Exercicios;

// 24. Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas atribuídas,
// respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um examefinal.
// As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas.
// A lista abaixo fornece os pesos:
//a. Laboratório: peso 2
//b. Avaliação semestral: peso 3
//c. Exame final: peso 5

import java.util.Scanner;

import br.edu.up.Models.Boletim;

public class Exercicio24 {

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);
        Boletim boletim1 = new Boletim();

        System.out.println("Calculadora de Nota final");
        System.out.println("------------------------------");

        System.out.println("(Peso 2) Informe a nota do trabalho de laboratorio: ");
        boletim1.setNotaLaboratorio(leitor.nextDouble());

        System.out.println("(Peso 3) Informe a nota da avaliação semestral: ");
        boletim1.setNotaAvaliacao(leitor.nextDouble());

        System.out.println("(Peso 5) Informe a nota do exame final: ");
        boletim1.setNotaExame(leitor.nextDouble());

        System.out.println("------------------------------");
        System.out.println("A media final do aluno é de: " + Boletim.notaFinal(boletim1.getNotaLaboratorio(), boletim1.getNotaAvaliacao() , boletim1.getNotaExame()));

        leitor.close();
    }

}