// Classe Locadora

public class Locadora {

    /**
     * Conta quantos carros da frota estao disponiveis para locacao.
     * Utilizado na opção 1 do menu do usuário.
     *
     * @param carros array com os carros da frota a serem verificados
     * @return a quantidade de carros disponiveis
     */
    public int contarCarrosDisponiveis(Carro[] carros) {
        int total = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                total++;
            }
        }
        return total;
    }

    /**
     * Calcula o valor total do aluguel multiplicando o valor da diaria do
     * carro pela quantidade de dias.
     * Utilizado na opção 2 do menu do usuário.
     *
     * @param carro carro que sera alugado
     * @param dias numero de dias do aluguel
     * @return o valor total do aluguel, sem nenhum desconto aplicado
     */
    public double calcularValorAluguel(Carro carro, int dias) {
        return carro.getValorDiaria() * dias;
    }


    /**
     * Utiliza um laço de repetição para buscar o carro que possui a diária mais barata, verificando
     * se o carro está disponível e também se o espaço do vetor de objetos não está vazio.
     * Utilizado na opção 3 do menu do usuário.
     *
     * @param carros serve para buscar os carros que foram criados na main para realizar o cálculo.
     * @return retorna o carro que possui o menor valor da diária.
     */
    public Carro buscarCarroMaisBarato(Carro[] carros) {
        Carro maisBarato = null;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                if (maisBarato == null || carros[i].getValorDiaria() < maisBarato.getValorDiaria()) {
                    maisBarato = carros[i];
                }
            }
        }
        return maisBarato;
    }

    /**
     * Utiliza uma outra função criada dentro da classe "Cliente" para realizar a verificação
     * acerca da possibilidade do cliente ser apto para realizar o aluguel do carro.
     * Utilizado na opção 4 do menu do usuário.
     *
     * @param cliente busca o cliente para repassar para a função booleana que realiza a verificação.
     * @return retorna um valor booleano se o cliente é apto ou não.
     */
    public boolean verificarClienteApto(Cliente cliente) {
        return cliente.isApto();
    }

    /**
     * Utiliza uma constante 40.0 para calcular o valor de atraso sob o valor total da diária,
     * a cada dia de atraso, a função soma + 40 ao valor total.
     * Utilizado na opção 5 do menu do usuário.
     *
     * @param diasAtraso serve para coletar o número de dias de atraso que o cliente tem a pagar.
     * @return retorno o valor total dos dias que o cliente tem a pagar por seu atraso.
     */
    public double calcularMultaAtraso(int diasAtraso) {
        return diasAtraso * 40.0;
    }

    /**
     *
     * Aplica o desconto através da quantidade de dias, sendo o valor multiplicado
     * por 0.9 caso a quantiade de dias seja >= (maior ou igual) a 7.
     * Usado na opção 6 do menu do usuário para aplicar o desconto.
     *
     * @param valor quantidade que representa o custo do total do carro durante os dias escolhidos.
     * @param dias quantidade de dias que o carro foi alugado.
     * @return valor que representa a quantidade total após o desconto do carro.
     */
    public double aplicarDesconto(double valor, int dias) {
        if (dias >= 7) {
            return valor * 0.9;
        }
        return valor;
    }

    /**
     * Utiliza os métodos get para coletar e exibir os valores dos objetos da classe Carro ao usuário.
     * Utilizado na opção 7 do menu do usuário para exibir os dados do carro.
     *
     * @param carro é utilizado para coletar o carro que foi chamado pela função e repassar para os métodos get e set.
     * @return retorna os dados do carro para o solicitante na main.
     */
    public String obterDescricaoCarro(Carro carro) {
        return carro.getModelo() + " - Placa: " + carro.getPlaca() + " - R$" + carro.getValorDiaria() + "/dia";
    }

    /**
     * Utiliza um laço de repetição para verificar quantos clientes são aptos para poder realizar o aluguel
     * dos carros, utilizando todos os clientes gerados na main.
     * Utilizado na opção 8 do menu do usuário para verificar quantos clientes podem realizar um aluguel.
     *
     * @param clientes é solicitado para coletar os objetos da classe Cliente que foram criados na main
     * @return o total de clientes que estão aptos a alugar carros.
     */
    public int contarClientesAptos(Cliente[] clientes) {
        int total = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].isApto()) {
                total++;
            }
        }
        return total;
    }
}

// Classe Carro

public class Carro {

    private String placa;
    private String modelo;
    private double valorDiaria;
    private boolean disponivel;

    public Carro(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    // Retorna a placa do carro.
    public String getPlaca() {
        return placa;
    }

    // Retorna o modelo do carro.
    public String getModelo() {
        return modelo;
    }

    // Retorna o valor da diária do carro.
    public double getValorDiaria() {
        return valorDiaria;
    }

    // Retorna se o carro está disponível para aluguel.
    public boolean isDisponivel() {
        return disponivel;
    }

    // Define o carro solicitado como disponível.
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

// Classe Cliente

public class Cliente {

    private String nome;
    private int idade;
    private int anosHabilitado;

    public Cliente(String nome, int idade, int anosHabilitado) {
        this.nome = nome;
        this.idade = idade;
        this.anosHabilitado = anosHabilitado;
    }

    // Retorna o nome do cliente.
    public String getNome() {
        return nome;
    }

    // Retorna a idade do cliente.
    public int getIdade() {
        return idade;
    }

    // Retorna quantos anos o cliente possui de habilitação.
    public int getAnosHabilitado() {
        return anosHabilitado;
    }

    /**
     * Utiliza duas condições e um "and" para verificar se ambas são verdadeiras.
     * @return o valor booleano que resulta das duas condições (>= 21 e >= 2).
     */
    public boolean isApto() {
        return idade >= 21 && anosHabilitado >= 2;
    }
}

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
