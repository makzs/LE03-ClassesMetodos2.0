package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.Aluno;

public class Exercicio01 {
    public static void Executar() {

        Scanner leitor = new Scanner(System.in);
        var aluno = new Aluno();

        System.out.println("Informe o nome: ");
        aluno.setName(leitor.nextLine());

        System.out.println("Informe a primeira nota: ");
        aluno.setNota1(leitor.nextDouble());
        System.out.println("Informe a segunda nota: ");
        aluno.setNota2(leitor.nextDouble());
        System.out.println("Informe a terceira nota: ");
        aluno.setNota3(leitor.nextDouble());

        double media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;

        System.out.println("A media aritmetica é : " + media);

        leitor.close();
    }
}
