// Classe Conta Bancaria

    import java.util.Scanner;
    public class ContaBancaria {

        String titular;
        int numero_da_conta;
        double saldo;

        public ContaBancaria(String titular, int numero_da_conta, double saldo){
            this.titular = titular;
            this.numero_da_conta = numero_da_conta;
            this.saldo = saldo;
        }

        public void depositar(){
            Scanner scanner = new Scanner(System.in);
            double deposito = 0;

            System.out.println("Digite o valor que deseja depositar:");
            deposito = scanner.nextDouble();
            saldo += deposito;
            System.out.println("Você depositou " + deposito + "R$");
            System.out.println("Seu novo saldo é: " + saldo + "R$");

        }

        public void sacar(){
            Scanner scanner = new Scanner(System.in);
            double saque = 0;

            System.out.println("Digite o valor que deseja sacar:");
            saque = scanner.nextDouble();
            if(saque <= saldo){
                saldo -= saque;
                System.out.println("Você sacou " + saque + "R$");
                System.out.println("Seu novo saldo é " + saldo + "R$");
            } else {
                System.out.println("Valor indisponível para saque.");
                System.out.println("Tente novamente.");
            }
        }

        public void mostrarSaldo(){
            System.out.println("Informações e Saldo da Conta" + numero_da_conta + ":");
            System.out.println("Nome do titular: " + titular);
            System.out.println("Saldo disponível: " + saldo + "R$");
        }

    }
