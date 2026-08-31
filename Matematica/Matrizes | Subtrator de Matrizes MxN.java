import java.util.Scanner;
public class Subtrator_de_Matrizes {
    static void main() {

        // Declara o scanner e as variáveis que serão utilizadas para atribuir
        // tamanho à matriz 1 e a matriz 2 (MxN 1 e MxN 2).
        Scanner scanner = new Scanner(System.in);
        int matriz1_M; int matriz1_N;
        int matriz2_M; int matriz2_N;

        // Recepciona o usuário e solicita os valores para declarar as matrizes e
        // realizar a verificação de possibilidade de subtração de ambas.
        System.out.println("Seja bem vindo ao subtrator de Matrizes MxN!");
        System.out.println("Digite o número de linhas da matriz A:");
        matriz1_M = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz A:");
        matriz1_N = scanner.nextInt();
        System.out.println("Digite o número de linhas da matriz B:");
        matriz2_M = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz B");
        matriz2_N = scanner.nextInt();

        // Utiliza uma condicional para verificar se é possível realizar a subtração
        // utilizando como critério a ordem da matriz.
        if(matriz1_M == matriz2_M && matriz1_N == matriz2_N){

            // Declara as matrizes 1 e 2.
            int[][] matriz1 = new int[matriz1_M][matriz1_N];
            int[][] matriz2 = new int[matriz2_M][matriz2_N];
            int[][] matriz3 = new int[matriz1_M][matriz2_N];

            // Utiliza laços de repetição para coletar os valores da matriz A.
            for(int i = 0; i < matriz1_M; i++){
                for(int j = 0; j < matriz1_N; j++){
                    System.out.println("Digite o valor a ser atribuído na posição");
                    System.out.println((i + 1) + "x" + (j + 1) + " da matriz A:");
                    matriz1[i][j] = scanner.nextInt();
                }
            }

            // Utiliza laços de repetição para coletar os valores da matriz A.
            for(int i = 0; i < matriz2_M; i++){
                for(int j = 0; j < matriz2_N; j++){
                    System.out.println("Digite o valor a ser atribuído na posição");
                    System.out.println((i + 1) + "x" + (j + 1) + " da matriz B:");
                    matriz2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("A Matriz C (Resultado) é:");
            // Utiliza laços de repetição para realizar a subtração, atribuir os valores e exibi-los
            // na matriz C (matriz resultado).
            for(int i = 0; i < matriz2_M; i++){
                for(int j = 0; j < matriz2_N; j++){
                    matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
                    System.out.print(" " + matriz3[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            // Adiciona uma mensagem de erro caso a condicional seja falsa.
            System.out.println("Não é possível realizar a subtração das matrizes.");
            System.out.println("Motivo: As Matrizes A e B possuem ordem diferente.");
        }

    }
}
