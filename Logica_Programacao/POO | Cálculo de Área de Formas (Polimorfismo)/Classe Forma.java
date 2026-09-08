// Classe Forma

public class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcularArea(){
        System.out.println("Calculando a área da forma " + nome);
    }

    public void apresentarDados(){
        System.out.println("Nome da forma: " + nome);
    }
}
