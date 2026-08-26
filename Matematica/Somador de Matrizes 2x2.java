import java.util.Scanner;
public class Atividade_Algebra_Matrizes3 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis que serão utilizadas para armazenar valores.
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] soma = new int[2][2];

        // Recepciona o usuário e instrui a atribuição de valores.
        System.out.println("Seja bem vindo ao somador de matrizes!");
        System.out.println("Vamos atribuir os valores da matriz 1.");

        // Utiliza dois laços de repetição para coletar as informações da primeira matriz.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + " x " + (j + 1));
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Utiliza dois laços de repetição para coletar as informações da segunda matriz.
        System.out.println("Vamos atribuir os valores da matriz 2.");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + " x " + (j + 1));
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Utiliza dois laços de repetição para realizar a soma dos valores de ambas as matrizes.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("A soma das matrizes A e B resulta na matriz C:");
        System.out.println(soma[0][0] + " | " + soma[0][1]);
        System.out.println(soma[1][0] + " | " + soma[1][1]);
    }
}
