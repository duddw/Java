import java.util.Scanner;
public class Atividade3_Algebra_Matrizes3 {
    static void main() {

        // Declara o scanner e a matriz 3x3 que será utilizada.
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Recepciona o usuário e coleta os valores da matriz utilizando laço de repetição.
        System.out.println("Seja bem vindo ao verificador de simetria de Matrizes 3x3.");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + "x" + (j + 1) + ":");
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Utiliza uma função sem retorno para exibir a matriz.
        exibeMatriz(matriz);

        // Utiliza o retorno de uma função booleana para exibir o resultado da simetria.
        if(comparaSimetria(matriz)){
            System.out.println("A Matriz é simétrica.");
        } else {
            System.out.println("A Matriz não é simétrica.");
        }

    }

    // Cria uma função sem retorno para exibir a matriz utilizando laços de repetição.
    static void exibeMatriz(int[][] matriz){
        System.out.println("A Matriz 3x3 inserida foi:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Cria uma função com retorno booleano que verifica a simetria da matriz utilizando
    // uma regra de diferença entre os elementos da matriz.
    static boolean comparaSimetria(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
