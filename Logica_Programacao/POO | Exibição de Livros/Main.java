// Main

public class Principal {
    static void main() {

        Livro l1 = new Livro (
                "Programação Básica",
                "Marcelo Yamamoto",
                90,
                2026
        );

        Livro l2 = new Livro(
                "Programação Insana",
                "Marcelo Yamamoto",
                180,
                2028
        );

        Livro l3 = new Livro(
                "Programação Máxima",
                "Marcelo Yamamoto",
                360,
                2030
        );

        System.out.println(l1);
        System.out.println();
        System.out.println(l2);
        System.out.println();
        System.out.println(l3);
    }
}
