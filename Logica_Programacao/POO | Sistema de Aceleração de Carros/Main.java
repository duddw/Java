// Main:

import java.util.Scanner;
public class Principal3 {

    static void main() {

        Veiculo veiculo = new Veiculo(
                "civic 2004",
                "honda",
                120
        );

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int recorrencia = 1;

        System.out.println("Seja bem vindo ao sistema de direção.");

            do{
                System.out.println("O que deseja realizar?");
                System.out.println("1 - Acelerar o veículo.");
                System.out.println("2 - Frear o veículo.");
                System.out.println("3 - Mostrar informações do veículo.");
                System.out.println("4 - Sair.");
                escolha = scanner.nextInt();

                    switch(escolha){
                        case 1: veiculo.acelerar(); break;
                        case 2: veiculo.frear(); break;
                        case 3: veiculo.mostrarDados(); break;
                        case 4: recorrencia = 0; break;
                    }

            } while (recorrencia == 1);

        System.out.println("Obrigado por utilizar o sistema de direção.");
        System.out.println("Até a próxima.");
    }
}
