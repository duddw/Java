// Classe Cachorro

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O cachorro faz au au");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Raça: " + raca);
    }
}
