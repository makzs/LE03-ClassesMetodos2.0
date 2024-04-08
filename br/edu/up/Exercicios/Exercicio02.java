package br.edu.up.Exercicios;

// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a 
// distância total percorrida pelo automóvel e o total de combustível gasto.

import java.util.Scanner;
import br.edu.up.Models.Automovel;

public class Exercicio02 {

    public static void Executar02(){
        Scanner leitor = new Scanner(System.in);
        Automovel carro = new br.edu.up.Models.Automovel();

        System.out.println("Informe a distancia percorrida pelo automovel: ");
        carro.setDistancia(leitor.nextInt());

        System.out.println("Informe o combustivel consumido pelo automovel: ");
        carro.setCombustivel(leitor.nextInt());

        int consumo = carro.getDistancia() / carro.getCombustivel();

        System.out.println("O consumo medio do automovel é de " + consumo + "km/l");

        leitor.close();

    }

}
