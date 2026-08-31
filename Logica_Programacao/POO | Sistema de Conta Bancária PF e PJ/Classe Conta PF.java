// Classe Conta PF

public class ContaPF extends Conta {
    private String cpf;

    public ContaPF(String titular, int numero, double saldo, String cpf) {
        super(titular, numero, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("CPF: " + cpf);
    }
}
