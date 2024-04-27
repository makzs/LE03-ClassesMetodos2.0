
package br.edu.up.Models;

public class CalcularDesconto {
    private double totalDesconto;
    private double totalPago;

    public double getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(double totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public CalcularDesconto() {
        this.totalDesconto = 0;
        this.totalPago = 0;
    }

    public void executarCalculadoraCombustivel(String combustivel, double valorVeiculo) {
        double desconto = calcularDesconto(combustivel, valorVeiculo);
        double valorPago = valorVeiculo - desconto;

        System.out.println("Desconto: R$" + getTotalDesconto());
        System.out.println("Valor a ser pago pelo cliente: R$" + getTotalPago());

        totalDesconto += desconto;
        totalPago += valorPago;
    }

    public void exibirTotais() {
        System.out.println("Total de desconto concedido: R$" + getTotalDesconto());
        System.out.println("Total pago pelos clientes: R$" + getTotalPago());
    }

    private double calcularDesconto(String combustivel, double valorVeiculo) {
        double desconto;
        switch (combustivel) {
            case "alcool":
                desconto = valorVeiculo * 0.25;
                break;
            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;
            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;
            default:
                desconto = 0;
                System.out.println("Tipo de combustível inválido. Desconto será 0%.");
                break;
        }
        return desconto;
    }
}
