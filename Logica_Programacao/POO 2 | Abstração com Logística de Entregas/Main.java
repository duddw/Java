// Main

public class Main {
    static void main() {
        Entrega bicicleta = new EntregaBicicleta(
                "0001",
                5
        );
        Entrega caminhao = new EntregaCaminhao(
                "0002",
                20
        );

        for(int i = 0; i < 33; i++) { System.out.print("="); }
        System.out.println();
        bicicleta.exibirDados();
        System.out.println();
        System.out.println("Valor total do frete: R$" + bicicleta.calcularFrete());
        System.out.println();
        bicicleta.rastrear();
        System.out.println();

        for(int i = 0; i < 33; i++) { System.out.print("="); }
        System.out.println();
        caminhao.exibirDados();
        System.out.println();
        System.out.println("Valor total do frete: R$" + caminhao.calcularFrete());
        System.out.println();
        caminhao.rastrear();
        System.out.println();
    }
}
