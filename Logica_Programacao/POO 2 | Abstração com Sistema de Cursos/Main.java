// Main

public class Main {
    static void main() {
        Curso presencial = new CursoPresencial(
                "Ciências da Computação",
                360
        );
        Curso online = new CursoOnline(
                "Análise e Desenvolvimento de Sistemas",
                180
        );

        presencial.exibirDados();
        System.out.println("Valor total: R$" + presencial.calcularValor());
        System.out.println();
        presencial.emitirCertificado("Carlos Eduardo");
        System.out.println();

        System.out.println();
        online.exibirDados();
        System.out.println("Valor total: R$" + online.calcularValor());
        System.out.println();
        online.emitirCertificado("Julia Moura");
    }
}
