import java.util.Scanner;
public class Gerador_de_Matrizes {
    static void main() {
        // Declara o scanner e as variáveis que serão utilizadas para definir o tamanho da matriz.
        Scanner scanner = new Scanner(System.in);
        int m; int n;

        // Recepciona o usuário e coleta os dados para criar a matriz do tamanho desejado.
        System.out.println("Seja bem vindo ao Gerador de Matrizes MxN");
        System.out.println("Digite o número de linhas da matriz que deseja gerar:");
        m = scanner.nextInt();
        System.out.println("Agora, digite o número de colunas da matriz que deseja gerar:");
        n = scanner.nextInt();

        // Cria a matriz MxN que será preenchida.
        int[][] matriz = new int[m][n];

            // Preenche a matriz utilizando laços de repetição.
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.println("Digite o valor a ser atribuído na posição");
                    System.out.println((i + 1) + "x" + (j + 1) + " da matriz:");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Exibe a matriz inserida em formato matricial de acordo com o tamanho desejado
            // utilizando laços de repetição.
            System.out.println("A Matriz inserida foi:");

            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(" " + matriz[i][j] + " ");
                }
                System.out.println();
            }
    }
}
