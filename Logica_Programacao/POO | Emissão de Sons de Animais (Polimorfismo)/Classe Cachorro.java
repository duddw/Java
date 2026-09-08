// Classe Cachorro

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au Auuuuu!!");
    }
}
