// Classe Conta

public class Conta {

    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Seu depósito foi realizado com sucesso.");
            System.out.println("Novo saldo: R$" + saldo);
        } else {
            System.out.println("Você precisa digitar um valor maior que 0.");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
                System.out.println("Seu saque foi realizado com sucesso.");
                System.out.println("Novo saldo: R$" + saldo);
        } else if(valor < 0){
            System.out.println("Digite um valor maior que 0.");
        } else if(valor <= saldo){
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo Atual: R$" + saldo);
    }
}

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

// Main

public class Main {
    static void main() {

        ContaPF contapf = new ContaPF(
                "duds",
                0001,
                100000,
                "12345678900"
        );

        ContaPJ contapj = new ContaPJ(
                "marcelo",
                0002,
                200000,
                "12.345.678/0001-00"
        );

        System.out.println("===========================================");
        System.out.println("Pessoa física:");
        System.out.println();

        contapf.mostrarDados();
        System.out.println();

        System.out.println("Deposito:");
        contapf.depositar(5000);
        System.out.println();

        System.out.println("Saque:");
        contapf.sacar(20000);
        System.out.println();

        contapf.mostrarDados();
        System.out.println();

        System.out.println("===========================================");
        System.out.println("Pessoa jurídica:");
        System.out.println();

        contapj.mostrarDados();
        System.out.println();

        System.out.println("Deposito:");
        contapj.depositar(5000);
        System.out.println();

        System.out.println("Saque:");
        contapj.sacar(20000);
        System.out.println();

        contapj.mostrarDados();
    }
}
