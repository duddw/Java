// Main

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria um vetor de objetos da classe Carro.
        Carro[] carros = {
            new Carro("ABC1234", "Onix", 100.0),
            new Carro("XYZ9988", "Corolla", 220.0),
            new Carro("JJK4521", "HB20", 90.0),
            new Carro("QRS7788", "Civic", 250.0)
        };

        // Define o carro que está na posição 1 como indisponível.
        carros[1].setDisponivel(false);

        // Cria um vetor de objetos da classe Clientes.
        Cliente[] clientes = {
            new Cliente("Joana", 25, 5),
            new Cliente("Pedro", 19, 0),
            new Cliente("Marcos", 30, 3)
        };

        // Cria um objeto da classe Locadora e declara o Scanner para receber
        // as inserções do usuário.
        Locadora locadora = new Locadora();
        Scanner scanner = new Scanner(System.in);

        // Define uma variável para manter o laço de repetição funcionando.
        int opcao = -1;

        // Utiliza um laço de repetição para exibir o menu do usuário e solicitar o que o usuário deseja
        // realizar dentro das opções apresentadas.
        while (opcao != 0) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Carros disponiveis: " + locadora.contarCarrosDisponiveis(carros));
                    break;
                case 2:
                    System.out.println("Valor do aluguel do Onix por 5 dias: R$" + locadora.calcularValorAluguel(carros[0], 5));
                    break;
                case 3:
                    Carro maisBarato = locadora.buscarCarroMaisBarato(carros);
                    System.out.println("Carro mais barato disponivel: " + maisBarato.getModelo() + " (R$" + maisBarato.getValorDiaria() + "/dia)");
                    break;
                case 4:
                    System.out.println("Joana esta apta a alugar? " + locadora.verificarClienteApto(clientes[0]));
                    break;
                case 5:
                    System.out.println("Multa para 3 dias de atraso: R$" + locadora.calcularMultaAtraso(3));
                    break;
                case 6:
                    System.out.println("Valor de R$1000,00 com desconto (10 dias): R$" + locadora.aplicarDesconto(1000, 10));
                    break;
                case 7:
                    System.out.println(locadora.obterDescricaoCarro(carros[0]));
                    break;
                case 8:
                    System.out.println("Clientes aptos a alugar: " + locadora.contarClientesAptos(clientes));
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }

    // Exibe o menu do usuário, mostrando opções de 0 a 8.
    private static void exibirMenu() {
        System.out.println("\n===== SISTEMA LOCADORA - DOCUMENTACAO =====");
        System.out.println("1 - Contar carros disponiveis");
        System.out.println("2 - Calcular valor do aluguel");
        System.out.println("3 - Buscar carro mais barato disponivel");
        System.out.println("4 - Verificar se cliente esta apto");
        System.out.println("5 - Calcular multa por atraso");
        System.out.println("6 - Aplicar desconto");
        System.out.println("7 - Obter descricao do carro");
        System.out.println("8 - Contar clientes aptos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }
}
