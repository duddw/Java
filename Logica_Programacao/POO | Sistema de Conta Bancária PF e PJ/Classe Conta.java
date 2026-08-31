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
