import java.util.Scanner;
public class Verificador_de_Simetria_Matrizes {
    static void main() {
        // Declara o scanner e as variáveis que definirão o tamanho da matriz.
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;

        // Recepciona o usuário e solicita a atribuição de ordem da Matriz que será verificada.
        System.out.println("Seja bem vindo ao verificador de simetria de matrizes MxN.");
        System.out.println("Digite o valor de linhas da Matriz: ");
        m = scanner.nextInt();
        System.out.println("Agora insira o valor de colunas da Matris: ");
        n = scanner.nextInt();

        // Cria a matriz onde os valores serão inseridos.
        int[][] matriz = new int[m][n];

        // Coleta os valores da matriz utilizando laço de repetição.
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + "x" + (j + 1) + ":");
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Utiliza uma função sem retorno para exibir a matriz.
        exibeMatriz(matriz, m, n);

        // Utiliza o retorno de uma função booleana para exibir o resultado da simetria.
        if(comparaSimetria(matriz, m, n)){
            System.out.println("A Matriz é simétrica.");
        } else {
            System.out.println("A Matriz não é simétrica.");
        }

    }

    // Cria uma função sem retorno para exibir a matriz utilizando laços de repetição.
    static void exibeMatriz(int[][] matriz, int m, int n){
        System.out.println("A Matriz MxN inserida foi:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Cria uma função com retorno booleano que verifica a simetria da matriz utilizando
    // uma regra de diferença entre os elementos da matriz.
    static boolean comparaSimetria(int[][] matriz, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
