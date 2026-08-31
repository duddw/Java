// Main

public class Main {
    static void main() {

        Escola escola = new Escola(
                "UniFil",
                "Jardim Quebec",
                "Universidade"
        );

        Professor professor = new Professor(
                "Marcelo",
                "Lógica de Programação"
        );

        System.out.println("========================");
        escola.mostrarEscola();
        System.out.println("========================");
        escola.mostrarProfessor(professor);
        System.out.println("========================");
        professor.exibirDados();
    }
}
