package ContaBancaria.Aplicacao;

public class Main {
    static void main() {
        ContaPoupanca c1 = new ContaPoupanca(
                "Marcelo",
                "0001",
                9000,
                "Itaú",
                5
        );

        c1.exibirConta();
    }
}
