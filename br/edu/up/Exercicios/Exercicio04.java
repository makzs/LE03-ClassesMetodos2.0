package br.edu.up.Exercicios;

// 4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido 
// em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a 
// quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;
import br.edu.up.Models.Conversor;

public class Exercicio04 {

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("Informe o valor da cotacao do dolar: ");
        conversor.setCotacao(leitor.nextDouble());

        System.out.println("Informe o valor em dolares: US$");
        conversor.setDollar(leitor.nextDouble());

        System.out.println("A quantidade de dolares informada é igual a: R$" + (conversor.getDollar() * conversor.getCotacao()));

        leitor.close();
    }

}
