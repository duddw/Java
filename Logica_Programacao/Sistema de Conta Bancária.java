// Classe:

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

// Main:

import java.util.Scanner;
public class Principal2 {
    static void main() {

        ContaBancaria contaBancaria = new ContaBancaria(
          "marcelo",
          1,
          100
        );
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int recorrencia = 1;

        System.out.println("Seja bem vindo ao Banco.");

            do{
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Realizar um Saque.");
                System.out.println("2 - Realizar um Depósito.");
                System.out.println("3 - Ver Saldo e Informações.");
                System.out.println("4 - Sair.");
                escolha = scanner.nextInt();

                    switch (escolha){
                        case 1: contaBancaria.sacar(); break;
                        case 2: contaBancaria.depositar(); break;
                        case 3: contaBancaria.mostrarSaldo(); break;
                        case 4: recorrencia = 0; break;
                    }

            } while(recorrencia == 1);

        System.out.println("Obrigado por usar nosso Banco.");
        System.out.println("Até a próxima.");
    }
}
