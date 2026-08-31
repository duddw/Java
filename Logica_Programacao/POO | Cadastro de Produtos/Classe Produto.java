// Classe Produto

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
