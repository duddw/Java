// Classe Sobrescrita

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
