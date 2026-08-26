import java.util.Scanner;
public class Atividade3_Algebra_Matrizes2 {

    static void main() {

        // Declara o scanner e a variável de tamanho da matriz.
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Recepciona o usuário e define a órdem da matriz.
        System.out.println("Seja bem vindo ao gerador de Matrizes Identidade.");
        System.out.println("Digite a órdem (NxN) da matriz que deseja gerar:");
        n = scanner.nextInt();

            // Declara a variável "matriz" com o tamanho "n" x "n".
            int[][] matriz = new int[n][n];

            // Utiliza laços de repetição para gerar a matriz identidade.
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    // Utiliza uma regra de i == j para dividir os 1s dos 0s.
                    if(i == j){
                        System.out.print(" 1 ");
                    } else {
                        System.out.print(" 0 ");
                    }
                }
                System.out.println();
            }

    }
}
