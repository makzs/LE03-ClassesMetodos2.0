package br.edu.up.Exercicios;

import java.util.Scanner;

import br.edu.up.Models.Vendedor;

public class Exercicio02 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();

        System.out.println("Informe o nome do vendedor: ");
        vendedor.setNome(leitor.nextLine());

        System.out.println("Informe o salario do vendedor: ");
        vendedor.setSalario(leitor.nextDouble());

        System.out.println("Informe o total do valor de vendas: ");
        vendedor.setValorVendas(leitor.nextDouble());
        leitor.close();

        var comissao = (vendedor.getValorVendas() * 15) / 100;

        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getSalario());
        System.out.println(vendedor.getSalario() + comissao);
    }
}
