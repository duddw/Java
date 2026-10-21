// Classe Abstrata Curso

public abstract class Curso implements Certificavel {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibirDados(){
        System.out.println("Nome do curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria);
    }

    abstract double calcularValor();

}
