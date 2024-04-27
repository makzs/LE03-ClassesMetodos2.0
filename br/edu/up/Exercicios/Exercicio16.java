package br.edu.up.Exercicios;

// 16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionáriosde acordo com os 
// seguintes critérios:
// a) 50% para aqueles que ganham menos do que três salários mínimos;
// b) 20% para aqueles que ganham entre três até dez salários mínimos; 
// c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
// d) 10% para os demais funcionários.

import java.text.DecimalFormat;
import java.util.Random;
import br.edu.up.Models.Funcionario;

public class Exercicio16 {

    public static void Executar(){
        Random random = new Random();
        DecimalFormat deci = new DecimalFormat("0.00");
        double salarioMinimo = 1412;
        double[] salarios = new double[5];

        for (int i = 0; i < salarios.length; i++){
            salarios[i] = random.nextDouble(1412, 30000);
        }

        System.out.println("Salarios atuais: ");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < salarios.length; i++){
            Funcionario funcionario = new Funcionario();

            funcionario.setSalario(salarios[i]);
            System.out.println("Funcionario " + (i+1) + " salario atual: " + deci.format(funcionario.getSalario()));

            if (salarios[i] < (salarioMinimo * 3)){
                salarios[i] = salarios[i] + ((salarios[i] * 50) / 100);
            }
            else if (salarios[i] > (salarioMinimo * 3) && salarios[i] < (salarioMinimo * 10)){
                salarios[i] = salarios[i] + ((salarios[i] * 20) / 100);
            }
            else if (salarios[i] > (salarioMinimo * 10) && salarios[i] < (salarioMinimo * 20)){
                salarios[i] = salarios[i] + ((salarios[i] * 15) / 100);
            }
            else{
                salarios[i] = salarios[i] + ((salarios[i] * 10) / 100);
            }

            System.out.println("Atualizando Salario...");

            funcionario.setSalario(salarios[i]);
            System.out.println("Funcionario " + (i+1) + " novo salario: " + deci.format(funcionario.getSalario()));
            System.out.println("-------------------------------------------");

        }
    }

}