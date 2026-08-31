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
