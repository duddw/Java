// Main

public class Main {
    static void main() {

        // O polimorfismo se encontra na criação do objeto "Cachorro" utilizando
        // a classe "Animal" para herdar os métodos.
        Animal cachorro = new Cachorro(
                "Cookie",
                2
        );

        // O polimorfismo se encontra na criação do objeto "Gato" utilizando
        // a classe "Animal" para herdar os métodos.
        Animal gato = new Gato(
                "Nina",
                7
        );

        System.out.println();
        cachorro.apresentarDados();
        System.out.println();
        cachorro.emitirSom();

        System.out.println();
        gato.apresentarDados();
        System.out.println();
        gato.emitirSom();
    }
}
