package br.edu.up.Exercicios;

// 14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. 
// Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
// Informe média de preço de custo e do preço de venda

import java.util.Scanner;
import br.edu.up.Models.Produtos;

public class Exercicio14 {

    // ----------- Funções -----------

    public static void linha() {
        System.out.println("-----------------------------------------------------");
    }

    // ----------- Fim Funções -----------

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);
        int quantidade = 4;
        double somaCusto = 0;
        double somaVenda = 0;

        for (int i = 0; i < quantidade; i++){
            Produtos produto = new Produtos();

            System.out.println("Informe o nome do " + (i+1) + " produto: ");
            produto.setNome(leitor.nextLine());
            System.out.println("Informe o preço de custo do " + (i+1) + " produto: ");
            produto.setCusto(leitor.nextInt());
            leitor.nextLine();
            System.out.println("Informe o preço de venda do " + (i+1) + " produto: ");
            produto.setVenda(leitor.nextInt());
            leitor.nextLine();

            somaCusto += produto.getCusto();
            somaVenda += produto.getVenda();

            double media = produto.getVenda() - produto.getCusto();

            if (media > 0){
                System.out.println("O produto " + produto.getNome() + " teve lucro!");
            }
            else if (media < 0){
                System.out.println("O produto " + produto.getNome() + " teve prejuizo!");
            }
            else{
                System.out.println("O produto " + produto.getNome() + " teve empate!");
            }

        }

        double mediaCusto = somaCusto / quantidade;
        double mediaVenda = somaVenda / quantidade;

        System.out.println("Ao todo tivemos uma media de custos de: R$" + mediaCusto);
        System.out.println("Ao todo tivemos uma media de vendas de: R$" + mediaVenda);
        if (mediaCusto < mediaVenda){
            System.out.println("E tivemos mais lucros do que prejuizos!");
        }
        else if (mediaCusto > mediaVenda){
            System.out.println("E tivemos mais prejuizos do que lucros!");
        }
        else{
            System.out.println("E tivemos uma empate entre lucros e prejuizos!");
        }

        leitor.close();
    }
}
