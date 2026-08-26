// Classe Escola

public class Escola {
    private String nome;
    private String localidade;
    private String tipo;
    private Professor professor;

    public Escola(String nome, String localidade, String tipo) {
        this.nome = nome;
        this.localidade = localidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarEscola(){
        System.out.println("Dados da escola " + getNome());
        System.out.println("Localidade: " + getLocalidade());
        System.out.println("Tipo da escola: " + getTipo());
    }

    public void mostrarProfessor(Professor professor){
        System.out.println("O professor da escola é: " + professor.getNome());
        System.out.println("A especialidade dele é: " + professor.getDisciplina());
    }
}

// Classe Professor

public class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matéria: " + disciplina);
    }
}

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
