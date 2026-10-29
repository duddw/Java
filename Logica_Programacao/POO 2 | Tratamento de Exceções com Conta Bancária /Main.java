// Main
package Bimestre4.AT13;

public class Main {
    static void main() throws SaldoInsuficienteException {
        ContaBancaria c1 = new ContaBancaria(
                "Marcelo",
                500
        );

        // Saque de 100.
        c1.sacar(Double.parseDouble("100"));
        System.out.println();
        System.out.println("Saque realizado com sucesso.");
        System.out.println("Saldo atual: R$" + c1.getSaldo());
        System.out.println();

        // Saque de 600.
        try{
            c1.sacar(Double.parseDouble("600"));
            System.out.println();
        } catch (SaldoInsuficienteException e) {
            System.out.println("Você não possui saldo insuficiente.");
        } finally {
            System.out.println("Saldo atual: R$" + c1.getSaldo());
        }
        System.out.println();

        // Saque de -50.
        try {
            c1.sacar(Double.parseDouble("-50"));
            System.out.println();
        } catch (IllegalArgumentException e){
            System.out.println("Insira um valor acima de 0.");
        } finally {
            System.out.println("Saldo atual: R$" + c1.getSaldo());
        }
        System.out.println();

        // Saque de abc.
        try {
            c1.sacar(Double.parseDouble("abc"));
            System.out.println();
        } catch (NumberFormatException e){
            System.out.println("Insira um número inteiro ou real.");
        } finally {
            System.out.println("Saldo atual: R$" + c1.getSaldo());
        }

    }
}
