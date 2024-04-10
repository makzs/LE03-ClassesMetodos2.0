package br.edu.up.Exercicios;

// 6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
// Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário

import java.util.Scanner;
import br.edu.up.Models.Vendas;

public class Exercicio06 {

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);
        Vendas vendas = new Vendas();

        System.out.println("Informe o preço de custo do produto: ");
        vendas.setPreco(leitor.nextDouble());

        System.out.println("Informe a taxa de venda do produto: ");
        vendas.setTaxa(leitor.nextInt());

        System.out.println("O valor de venda do produto é de " + vendas.vender(vendas.getPreco(), vendas.getTaxa()));

        leitor.close();
    }

}
