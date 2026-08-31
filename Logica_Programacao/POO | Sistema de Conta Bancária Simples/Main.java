// Main

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
