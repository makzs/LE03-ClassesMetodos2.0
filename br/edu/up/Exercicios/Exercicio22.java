package br.edu.up.Exercicios;

// 22. Faça um programa que calcule o valor da conta de luz de uma pessoa. 
// Sabe-se que o cálculoda conta de luz segue a tabela abaixo:Tipo de Cliente Valor do KW/h1
// (Residência) 0,602 
// (Comércio) 0,483
// (Indústria) 1,29

import java.util.Scanner;

import br.edu.up.Models.ContaLuz;

public class Exercicio22 {

    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        ContaLuz conta =  new ContaLuz();

        System.out.println("Informe o valor de KW/h gasto: ");
        conta.setValor(leitor.nextDouble());

        System.out.println("Informe o tipo de cliente (R/C/I) : ");
        conta.setTipo(Character.toUpperCase(leitor.next().charAt(0)));

        if ( conta.getTipo() == 'R'){
            double valorConta = conta.getValor() * 0.602;
            System.out.println("O valor da conta da luz é de: R$" + valorConta);
        }
        else if (conta.getTipo() == 'C'){
            double valorConta = conta.getValor() * 0.483;
            System.out.println("O valor da conta da luz é de: R$" + valorConta);
        }
        else if ( conta.getTipo() == 'I'){
            double valorConta = conta.getValor() * 1.29;
            System.out.println("O valor da conta da luz é de: R$" + valorConta);
        }
        else{
            System.out.println("Tipo de cliente invalido!");
        }

        leitor.close();
    }

}
