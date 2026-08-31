// Classe Conta PJ

public class ContaPJ extends Conta{
    private String cnpj;

    public ContaPJ(String titular, int numero, double saldo, String cnpj) {
        super(titular, numero, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("CNPJ: " + cnpj);
    }
}
