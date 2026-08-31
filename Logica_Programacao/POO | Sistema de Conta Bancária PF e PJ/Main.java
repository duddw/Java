// Main

public class Main {
    static void main() {

        ContaPF contapf = new ContaPF(
                "duds",
                0001,
                100000,
                "12345678900"
        );

        ContaPJ contapj = new ContaPJ(
                "marcelo",
                0002,
                200000,
                "12.345.678/0001-00"
        );

        System.out.println("===========================================");
        System.out.println("Pessoa física:");
        System.out.println();

        contapf.mostrarDados();
        System.out.println();

        System.out.println("Deposito:");
        contapf.depositar(5000);
        System.out.println();

        System.out.println("Saque:");
        contapf.sacar(20000);
        System.out.println();

        contapf.mostrarDados();
        System.out.println();

        System.out.println("===========================================");
        System.out.println("Pessoa jurídica:");
        System.out.println();

        contapj.mostrarDados();
        System.out.println();

        System.out.println("Deposito:");
        contapj.depositar(5000);
        System.out.println();

        System.out.println("Saque:");
        contapj.sacar(20000);
        System.out.println();

        contapj.mostrarDados();
    }
}
