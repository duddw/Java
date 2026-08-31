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
