// Main

import java.util.Scanner;
public class Main {
    static void main() {
        Gerente gerente = new Gerente(
                "marcelo",
                1000,
                5000,
                1500
        );
        Vendedor vendedor = new Vendedor(
                "dudd",
                1001,
                3000,
                10000,
                5
        );
        Estagiario estagiario = new Estagiario(
                "leonam edson",
                1002,
                1200,
                "UEL"
        );

        linha();

        gerente.apresentarDados();
        System.out.println();
        linha();

        vendedor.apresentarDados();
        System.out.println();
        linha();

        estagiario.apresentarDados();
        System.out.println();
        linha();

        System.out.println("Salário do Marcelo:");
        gerente.calcularSalario();
        System.out.println();
        linha();

        System.out.println("Salario do dudd:");
        vendedor.calcularSalario();
        System.out.println();
        linha();

        System.out.println("Salário do leonam edson:");
        estagiario.calcularSalario();
        System.out.println();
        linha();

        gerente.realizarReuniao();
        System.out.println();
        linha();

        estagiario.realizarTreinamento();
        System.out.println();
        linha();

        vendedor.registrarVenda();
        linha();

    }

    static void linha(){
        for(int i = 0; i < 20; i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
