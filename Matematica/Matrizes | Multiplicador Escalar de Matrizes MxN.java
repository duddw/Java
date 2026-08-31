import java.util.Scanner;
public class Multiplicador_de_Matriz_Escalar {
    static void main() {

        // Declara o Scanner, o escalar e as variáveis que serão utilizadas
        // para definir o tamanho da matriz A.
        Scanner scanner = new Scanner(System.in);
        int m; int n; int escalar;

            // Recepciona o usuário e solicita a inserção do tamanho da matriz A e do
            // valor escalar pelo qual a matriz A será multiplicada.
            System.out.println("Seja bem vindo ao multiplicador escalar de matrizes.");
            System.out.println("Digite o número de linhas da matriz A:");
            m = scanner.nextInt();
            System.out.println("Digite o número de colunas da matriz A:");
            n = scanner.nextInt();
            System.out.println("Agora, digite o valor escalar pelo qual desela multiplicar a matriz inteira:");
            escalar = scanner.nextInt();

            // Declara a matriz A que será utilizada para realizar a multiplicação escalar.
            int[][] matrizA = new int[m][n];

                // Utiliza laços de repetição para que o usuário insira os valores da matriz A
                for(int i = 0; i < m; i++){
                    for(int j = 0; j < n; j++){
                        System.out.println("Insira o valor que será atribuído na posição");
                        System.out.println((i + 1) + "x" + (j + 1) + " da matriz A:");
                        matrizA[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("A matriz resultado é:");
                // Utiliza laços de repetição para multiplicar os valores de A pelo escalar K e exibir
                // os valores multiplicados em formato matricial.
                for(int i = 0; i < m; i++){
                    for(int j = 0; j < n; j++){
                        matrizA[i][j] = matrizA[i][j] * escalar;
                        System.out.print(" " + matrizA[i][j] + " ");
                    }
                    System.out.println();
                }
    }
}
