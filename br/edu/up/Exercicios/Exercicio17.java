package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.Funcionario;

public class Exercicio17 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = leitor.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salarioFuncionario = leitor.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = leitor.nextDouble();

        Funcionario funcionario = new Funcionario(nomeFuncionario, salarioFuncionario, salarioMinimo);

        double novoSalario = funcionario.calcularNovoSalario();

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Reajuste:" + funcionario.getReajuste());
        System.out.println("Novo salário:" + novoSalario);

        double aumentoFolha = novoSalario - salarioFuncionario;
        System.out.println("Aumento na folha de pagamento da empresa: R$" + aumentoFolha);

        leitor.close();
    }
}
