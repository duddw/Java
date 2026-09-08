// Classe Animal

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentarDados(){
        System.out.println("Nome do animal: " + nome);
        System.out.println("Idade: " + idade + " anos.");
    }

    public void emitirSom(){
        System.out.println("O som que o animal " + nome);
        System.out.println("emite ao ser chamado é:");
    }
}
