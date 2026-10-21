// Main

public class Main {
    static void main() {
        Veiculo carro = new Carro(
                "ABC1D23",
                "Ônix",
                100,
                4
        );
        Veiculo moto = new Moto(
                "XYZ9A87",
                "CG 160",
                60,
                160
        );

        System.out.println("=== Carro ===");
        System.out.println();
        carro.exibirDados();
        carro.calcularLocacao(3);
        System.out.println();

        System.out.println("=== Operações ===");
        carro.ligar();
        carro.desligar();

        System.out.println();

        System.out.println("=== Moto ===");
        System.out.println();
        moto.exibirDados();
        moto.calcularLocacao(3);
        System.out.println();

        System.out.println("=== Operações ===");
        moto.ligar();
        moto.desligar();

        System.out.println();
        System.out.println("Total de veículos criados: " + Veiculo.getTotalVeiculos());
    }
}
