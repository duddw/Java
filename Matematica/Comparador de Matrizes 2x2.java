import java.util.Scanner;
public class Atividade_Algebra_Matrizes1 {

    static void main() {
        Scanner scanner = new Scanner (System.in);

        // Declara as variáveis que serão utilizadas para armazenar valores.
        int numeros_iguais = 0;
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        // Recepciona o usuário e instrui a atribuição de valores.
        System.out.println("Seja bem vindo ao comparador de matrizes!");
        System.out.println("Vamos atribuir os valores da matriz 1.");

        // Utiliza dois laços de repetição para coletar as informações da primeira matriz.
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + " x " + (j + 1));
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Utiliza dois laços de repetição para coletar as informações da segunda matriz.
        System.out.println("Vamos atribuir os valores da matriz 2.");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + " x " + (j + 1));
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Utiliza dois laços de repetição para validar a igualdade em todas as posições de ambas
        // as matrizes e verifica a veracidade da igualdade utilizando um contador.
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                if(matriz1[i][j] == matriz2[i][j]){
                numeros_iguais++;
                }
            }
        }

        // Exibe o resultado da comparação ao usuário
        if(numeros_iguais == 4){
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes são diferentes.");
        }
    }
}
