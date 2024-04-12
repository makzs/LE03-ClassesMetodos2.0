package br.edu.up.Exercicios;

// 10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando 
//“maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade.

import java.util.Scanner;
import br.edu.up.Models.Pessoa;

public class Exercicio10 {

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas que deseja registrar: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < quantidade; i++){
            Pessoa pessoa = new Pessoa();

            System.out.println("Informe o nome da " + (i+1) + " pessoa: ");
            pessoa.setNome(leitor.nextLine());
            System.out.println("Informe a idade da " + (i+1) + " pessoa: ");
            pessoa.setIdade(leitor.nextInt());
            leitor.nextLine();

            pessoa.validacao(pessoa.getNome(), pessoa.getIdade() );

        }

        leitor.close();

    }
}
