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
