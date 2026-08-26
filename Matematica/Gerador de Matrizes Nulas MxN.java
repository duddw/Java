import java.util.Scanner;
public class Atividade3_Algebra_Matrizes1 {

    static void main() {
        
        // Declara o scanner e as variáveis de tamanho da matriz.
        Scanner scanner = new Scanner(System.in);
        int m = 0; int n = 0;

        // Recepciona o usuário e coleta os valores para atribuir a matriz.
        System.out.println("Seja bem vindo ao construtor de Matrizes Nulas.");
        System.out.println("Digite o valor de linhas que deseja atribuir a matriz:");
        m = scanner.nextInt();
        System.out.println("Agora digite o valor de colunas que deseja atribuir a matriz:");
        n = scanner.nextInt();
        
            // Cria a matriz utilizando as variáveis "m" e "n".
            int[][] matriz = new int[m][n];
            
            // Utiliza laços de repetição para gerar e exibir a matriz solicitada pelo usuário.
            System.out.println("A Matriz Nula " + m + "x" + n + " é:");
            System.out.println();

            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(" 0 ");
                }
                System.out.println();
            }

    }
}
