package br.edu.up.Exercicios;

// 8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. 
// Calcular a sua média (aritmética), informar o nome e sua menção
// aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)

import java.util.Scanner;
import br.edu.up.Models.Aluno;

public class Exercicio08 {
    public static void Executar(){
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Informe o nome do aluno: ");
        aluno.setName(leitor.nextLine());

        System.out.println("Informe a primeira nota do aluno: ");
        aluno.setNota1(leitor.nextDouble());

        System.out.println("Informe a segunda nota do aluno: ");
        aluno.setNota2(leitor.nextDouble());

        System.out.println("Informe a terceira nota do aluno: ");
        aluno.setNota3(leitor.nextDouble());

        double media = aluno.media(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());

        System.out.println("------------------------------------------");
        System.out.println("\t\tStatus Escolar");
        System.out.println("------------------------------------------");
        System.out.println("Aluno: \t\t" + aluno.getName());
        System.out.println("Nota 1: \t\t\t" + aluno.getNota1());
        System.out.println("Nota 2: \t\t\t" + aluno.getNota2());
        System.out.println("Nota 3: \t\t\t" + aluno.getNota3());
        System.out.println("Media: \t\t\t\t" + media);
        System.out.println("------------------------------------------");
        if (media >= 7){
            System.out.println("\tAluno Aprovado!");
        }
        else if (media > 5.1){
            System.out.println("\tAluno em Recuperação!");
        }
        else{
            System.out.println("\tAluno Reprovado!");
        }
        System.out.println("------------------------------------------");

        leitor.close();
    }
}
