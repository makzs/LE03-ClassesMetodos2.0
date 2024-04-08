package br.edu.up.Exercicios;

// 12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. 
// Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente
// de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. 
// Até 2000- 12% e acima de 2000 - 7%. 
// O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: 
// “(N) Não”. Informar total de carros com ano até 2000 e total geral.

import java.util.Scanner;

import br.edu.up.Models.DescontoCarros;

public class Exercicio12 {

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);
        boolean repetir = true;
        DescontoCarros desconto = new DescontoCarros();

        System.out.println("Carango Velho");
        System.out.println("Calculadora de descontos");

        while (repetir){
            boolean respValida = false;
            System.out.println("\n----------------------------------\n");
            System.out.print("Informe o preço do veiculo: R$");
            desconto.setPreco(leitor.nextDouble());
            System.out.print("\nInforme o ano do veiculo: ");
            desconto.setAno(leitor.nextInt());
            if (desconto.getAno() > 2000){
                System.out.println("\nDesconto calculado: " + desconto.desconto7(desconto.getPreco()));
                System.out.println("Preço final: " + (desconto.getPreco() - desconto.desconto7(desconto.getPreco())));
            }
            else{
                System.out.println("\nDesconto calculado: " + desconto.desconto12(desconto.getPreco()));
                System.out.println("Preço final: " + (desconto.getPreco() - desconto.desconto12(desconto.getPreco())));
            }
            do{
                System.out.println("Deseja continuar? (S/N)");
                char resp = leitor.next().charAt(0);
                resp = Character.toUpperCase(resp);
                if (resp == 'S'){
                    respValida = true;
                    repetir = true;
                }
                else if (resp == 'N'){
                    System.out.println("Desligando...");
                    respValida = true;
                    repetir = false;
                }
                else{
                    System.out.println("Resposta invalida!");
                }
            } while(respValida == false);
        }

        System.out.println("\n----------------------------------\n");
        leitor.close();
    }

}
