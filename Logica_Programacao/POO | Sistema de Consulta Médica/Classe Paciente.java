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
