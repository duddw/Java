// Classe

package Sobrescrita;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    int anoPublicacao;

    public Livro(String titulo, String autor, int numeroPaginas, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + "\n" + "Autor: " + autor + "\n" + "Número de Páginas: " + numeroPaginas
        + "\n" + "Publicado em: " + anoPublicacao;
    }
}

// Main:

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
