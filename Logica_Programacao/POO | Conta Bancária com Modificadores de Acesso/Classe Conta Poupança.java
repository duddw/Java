// Classe Conta Poupança

package ContaBancaria.Aplicacao;

import ContaBancaria.Modelo.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(String titular, String numeroConta, double saldo, String nomeBanco, double taxaDeRendimento) {
        super(titular, numeroConta, saldo, nomeBanco);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    // Sobrescreve o metodo da classe ContaBancaria adicionando a taxa de rendimento.
    @Override
    public void exibirConta() {
        super.exibirConta();
        System.out.printf("Taxa de Rendimento: %.2f%n", taxaDeRendimento);
    }
}
