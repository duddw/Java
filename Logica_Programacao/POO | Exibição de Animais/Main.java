// Main

public class Main {
    static void main() {

        Cachorro cachorro = new Cachorro(
                "Cookie",
                4,
                4.00,
                "maltês"
        );

        Gato gato = new Gato(
                "Nina",
                7,
                60.00,
                "siamês"
        );

        Passaro passaro = new Passaro(
                "leonam edson",
                18,
                98.9,
                "pica-pau"
        );

        cachorro.apresentarDados();
        cachorro.emitirSom();
        System.out.println();

        gato.apresentarDados();
        gato.emitirSom();
        System.out.println();

        passaro.apresentarDados();
        passaro.emitirSom();
        System.out.println();

    }
}
