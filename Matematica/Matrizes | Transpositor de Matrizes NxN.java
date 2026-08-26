import java.util.Scanner;
public class Atividade3_Algebra_Matrizes5 {
    static void main() {

        // Declara o scanner.
        Scanner scanner = new Scanner(System.in);

        // Recepciona o usuário e solicita a órdem da matriz.
        System.out.println("Seja bem vindo ao transpositor de Matrizes NxN.");
        System.out.println("Digite a órdem da matriz que deseja transpor:");
        int n = scanner.nextInt();

        // Declara a matriz utilizando a órdem "n" que o usuário inseriu.
        int[][] matriz = new int[n][n];

        // Utiliza laços de repetição para receber os valores da matriz.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Digite o valor a ser atribuído na posição");
                System.out.println((i + 1) + "x" + (j + 1) + " da matriz de órdem " + n);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Utiliza uma função sem retorno para exibir a matriz inserida.
        exibeMatriz(matriz, n);

        transpoeMatriz(matriz, n);

    }

    // Cria uma função sem retorno para exibir a matriz utilizando laços de repetição.
    static void exibeMatriz(int[][] matriz, int n){
        System.out.println("A Matriz 3x3 inserida foi:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Cria uma função para realizar a transposição da matriz utilizando uma matriz auxiliar
    // e laços de repetição.
    static void transpoeMatriz(int[][] matriz, int n){
        
        // Declara a matriz onde ficarão os valores da matriz transposta.
        int[][] matrizTransposta = new int[n][n];

        // Utiliza um laço de repetição para transpor os valores.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        // Exibe o resultado da transposição ao usuário.
        System.out.println("A matriz transposta da matriz inserida é:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" " + matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
