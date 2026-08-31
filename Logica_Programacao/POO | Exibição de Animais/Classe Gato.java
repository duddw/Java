// Classe Gato

public class Gato extends Animal {
    private String pelagem;

    public Gato(String nome, int idade, double peso, String pelagem) {
        super(nome, idade, peso);
        this.pelagem = pelagem;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O gato faz miau miau");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Pelagem: " + pelagem);
    }
}
