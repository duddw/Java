// Main

public class Main {
    static void main() {

            Medico medico = new Medico(
                    "marcelo",
                    "programação",
                    "22012"
            );
            Paciente paciente = new Paciente(
                    "adao",
                    "12345678910",
                    24
            );

            System.out.println();
            paciente.apresentarPaciente();
            System.out.println();

            medico.apresentarMedico();
            System.out.println();

            paciente.realizarConsulta(medico);
            System.out.println();

            paciente.apresentarPaciente();
            System.out.println();
            medico.apresentarMedico();

    }
}
