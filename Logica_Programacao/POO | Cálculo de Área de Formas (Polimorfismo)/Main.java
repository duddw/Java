// Main

public class Main {
    static void main() {
        Forma[] formas = new Forma[2];

        formas[0] = new Retangulo(
                "Retangulo Um",
                38,
                57
        );

        formas[1] = new Circulo(
                "Circulo Um",
                23
        );

        for(int i = 0; i < 2; i++){
            formas[i].apresentarDados();
            formas[i].calcularArea();
            System.out.println();
        }
    }
}
