// Classe

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\n" + "Preço: " + preco + "R$";
    }
}

// Main:

public class Principal {
    static void main() {

        Produto p1 = new Produto (
                "Mouse Gamer",
                450
        );

        System.out.println(p1);
    }
}
