// Classe:

public class Produto {

    String nome;
    double preco;
    int quantidade;


    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void apresentarProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade + " unidades");
        System.out.println();
    }
}

// Main:

public class Principal {

    static void main() {

        Produto produto1 = new Produto(
                "batata",
                6,
                40
        );
        produto1.apresentarProduto();

        Produto produto2 = new Produto(
                "Tomate",
                4,
                40
        );
        produto2.apresentarProduto();
    }
}
