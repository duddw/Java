// Classe Medico

public class Medico {
    private String nomeMedico;
    private String especialidade;
    private String crm;

    public Medico(String nomeMedico, String especialidade, String crm) {
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        if(nomeMedico != null){
            this.nomeMedico = nomeMedico;
        } else {
            System.out.println("O nome do médico não pode ser vazio.");
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if(especialidade != null){
            this.especialidade = especialidade;
        } else {
            System.out.println("A especialidade não pode ser vazia.");
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if(crm != null){
            this.crm = crm;
        } else {
            System.out.println("O CRM não pode ficar vazio.");
        }
    }

    public void apresentarMedico(){
        System.out.println("Nome do médico: " + nomeMedico);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
    }
}

// Classe Paciente

public class Paciente {
    private Medico medico;
    private String nome;
    private String cpf;
    private int idade;

    public Paciente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("O nome do paciente não pode ficar vazio.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null){
            this.cpf = cpf;
        } else {
            System.out.println("O CPF não pode ficar vazio.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        } else {
            System.out.println("A idade inserida deve ser maior que 0.");
        }
    }

    public void apresentarPaciente(){
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("CPF: " + cpf);
    }

    public void realizarConsulta(Medico medico){
        if(medico != null){
            System.out.println("Certo. Marcando consulta com o médico " + medico.getNomeMedico());
            System.out.println("Especialista em " + medico.getEspecialidade());
            System.out.println("Para o paciente " + nome);
        } else {
            System.out.println("Erro. Digite um valor válido.");
        }
    }
}

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
