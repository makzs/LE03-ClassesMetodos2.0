package br.edu.up.Exercicios;

// 18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. 
// Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade:
// sexo | idade | abono
// M    | >=30  | 100
// M    |  <30  | 50
// F    | >=30  | 200
// F    |  <30  | 80

import java.util.Scanner;
import br.edu.up.Models.Funcionario;

public class Exercicio18 {

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();

        System.out.println("Informe o nome do funcionario: ");
        funcionario1.setNome(leitor.nextLine());

        System.out.println("Informe a idade do funcionario: ");
        funcionario1.setIdade(leitor.nextInt());

        System.out.println("Informe o sexo do funcionario (M/F) : ");
        funcionario1.setSexo(Character.toUpperCase(leitor.next().charAt(0)));;

        System.out.println("Informe o salario do funcionario: ");
        funcionario1.setSalario(leitor.nextDouble());

        if (funcionario1.getSexo() == 'M'){
            if (funcionario1.getIdade() >= 30){
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.getNome());
                System.out.println("idade: " + funcionario1.getIdade());
                System.out.println("sexo: " + funcionario1.getSexo());
                System.out.println("antigo salario: R$" + funcionario1.getSalario());
                System.out.println("abono: R$" + 100);
                funcionario1.abono(100);
                System.out.println("novo salario: R$" + funcionario1.getSalario());
            }
            else{
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.getNome());
                System.out.println("idade: " + funcionario1.getIdade());
                System.out.println("sexo: " + funcionario1.getSexo());
                System.out.println("antigo salario: R$" + funcionario1.getSalario());
                System.out.println("abono: R$" + 50);
                funcionario1.abono(50);
                System.out.println("novo salario: R$" + funcionario1.getSalario());
            }
        }
        else if (funcionario1.getSexo() == 'F'){
            if (funcionario1.getIdade() >= 30){
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.getNome());
                System.out.println("idade: " + funcionario1.getIdade());
                System.out.println("sexo: " + funcionario1.getSexo());
                System.out.println("antigo salario: R$" + funcionario1.getSalario());
                System.out.println("abono: R$" + 200);
                funcionario1.abono(200);
                System.out.println("novo salario: R$" + funcionario1.getSalario());
            }
            else{
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.getNome());
                System.out.println("idade: " + funcionario1.getIdade());
                System.out.println("sexo: " + funcionario1.getSexo());
                System.out.println("antigo salario: R$" + funcionario1.getSalario());
                System.out.println("abono: R$" + 80);
                funcionario1.abono(80);
                System.out.println("novo salario: R$" + funcionario1.getSalario());
            }
        }
        else{
            System.out.println("Informações fornecidas invalidas!");
        }

        leitor.close();
    }

}