import java.util.Scanner;
public class Atividade_Algebra_Matrizes2 {

    static void main() {
        Scanner scanner = new Scanner (System.in);

        // Declara as variáveis que serão utilizadas para definir o tamanho da matriz.
        int I = 0, J = 0;

        // Recepciona o usuário e permite que ele escolha a ordem da matriz.
        System.out.println("Digite a ordem da matriz IxJ que deseja comparar:");
        System.out.println("Digite o I:");
        I = scanner.nextInt();
        System.out.println("Digite o J:");
        J = scanner.nextInt();

        // Declara as variáveis que serão utilizadas para armazenar valores.
        int numeros_iguais = 0;
        int[][] matriz1 = new int[I][J];
        int[][] matriz2 = new int[I][J];

        // Instrui a atribuição de valores.
        System.out.println("Vamos atribuir os valores da matriz 1.");

        // Utiliza dois laços de repetição para coletar as informações da primeira matriz.
        for(int i = 0; i < I; i++){
            for(int j = 0; j < J; j++){
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + " x " + (j + 1));
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Utiliza dois laços de repetição para coletar as informações da segunda matriz.
        System.out.println("Vamos atribuir os valores da matriz 2.");
        for(int i = 0; i < I; i++){
            for(int j = 0; j < J; j++){
                System.out.println("Digite o valor a ser atribuido na posição " + (i + 1) + " x " + (j + 1));
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Utiliza dois laços de repetição para validar a igualdade em todas as posições de ambas
        // as matrizes e verifica a veracidade da igualdade utilizando um contador.
        for(int i = 0; i < I; i++){
            for(int j = 0; j < J; j++){
                if(matriz1[i][j] == matriz2[i][j]){
                    numeros_iguais++;
                }
            }
        }

        // Exibe o resultado da comparação ao usuário
        if(numeros_iguais == (I * J)){
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes são diferentes.");
        }
    }
}
