// Classe Vendedor

import java.util.Scanner;
public class Vendedor extends Funcionario {
    Scanner scanner = new Scanner(System.in);
    private double valorVendas;
    private double percentualComissao;
    private double valorvendanova;

    public Vendedor(String nome, int matricula, double salarioBase, double valorVendas, int percentualComissao) {
        super(nome, matricula, salarioBase);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
        this.valorvendanova = valorvendanova;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(int percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getValorvendanova() {
        return valorvendanova;
    }

    public void setValorvendanova(double valorvendanova) {
        this.valorvendanova = valorvendanova;
    }

    public void registrarVenda(){
        System.out.println("Digite o valor da nova venda: ");
        valorvendanova = scanner.nextDouble();
        valorVendas += valorvendanova;
        System.out.printf("O valor total das vendas até agora é: R$%.2f", valorVendas);
        System.out.println();
    }
    @Override
    public void calcularSalario() {
        double comissao = valorVendas * (percentualComissao / 100);
        System.out.printf("Valor das comissões: R$%.2f", comissao);
        System.out.println();
        super.calcularSalario();
        double salariototal = getSalarioBase() + comissao;
        System.out.printf("Salário total: R$%.2f", salariototal);
        System.out.println();
    }
}
