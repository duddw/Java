// Classe:

import java.util.Scanner;
public class Veiculo {

    String modelo;
    String marca;
    int velocidade_atual;

        public Veiculo(String modelo, String marca, int velocidade_atual){
            this.modelo = modelo;
            this.marca = marca;
            this.velocidade_atual = velocidade_atual;
        }

        public void acelerar(){
            Scanner scanner = new Scanner(System.in);
            int aceleracao = 0;

            System.out.println("Digite a velocidade que deseja acelerar o carro:");
            aceleracao = scanner.nextInt();
            velocidade_atual += aceleracao;
            System.out.println("O carro agora está a " + velocidade_atual + " Km/h.");
        }

        public void frear(){
            Scanner scanner = new Scanner(System.in);
            int reducao = 0;

            System.out.println("Digite a quantidade de velocidade que deseja reduzir:");
            reducao = scanner.nextInt();
            if (velocidade_atual - reducao > 0) {
                velocidade_atual -= reducao;
                System.out.println("O carro agora está a " + velocidade_atual + " Km/h.");
            } else {
                System.out.println("A velocidade do carro não pode abaixar de 0, tente novamente.");
            }
        }

        public void mostrarDados(){
            System.out.println("Dados do veículo:");
            System.out.println("Modelo do veículo: " + modelo);
            System.out.println("Marca do veículo: " + marca);
            System.out.println("Velocidade atual: " + velocidade_atual + " Km/h.");
        }
}

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
