// Classe ContaBancária

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if(titular == null || titular.trim().isEmpty()){
            throw new IllegalArgumentException(
                    "Insira um titular válido."
            );
        } else {
            this.titular = titular;
        }

        if(!Double.isFinite(saldoInicial) || saldoInicial < 0){
            throw new IllegalArgumentException(
                    "O saldo deve ser finito e maior que zero."
            );
        } else {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double sacar(double saque) throws SaldoInsuficienteException {
        if (!Double.isFinite(saque) || saque < 0) {
            throw new IllegalArgumentException(
                    "Insira um titular válido."
            );
        } else if (saque > saldo) {
            throw new SaldoInsuficienteException(
                    "Insira um valor menor ou igual ao saldo disponível."
            );
        } else {
            return saldo -= saque;
        }
    }

    public void exibirDados(){
        System.out.println("Detalhes da Conta");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
