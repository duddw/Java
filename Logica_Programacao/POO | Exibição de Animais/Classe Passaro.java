// Classe Pássaro

public class Passaro extends Animal {
    private String especie;

    public Passaro(String nome, int idade, double peso, String especie) {
        super(nome, idade, peso);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O passaro faz piupiu");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Espécie: " + especie);
    }
}
