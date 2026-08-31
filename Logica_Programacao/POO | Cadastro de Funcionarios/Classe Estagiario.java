// Classe Estagiário

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, int matricula, double salarioBase, String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public void realizarTreinamento(){
        System.out.println("Realizando treinamento...");
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        System.out.println("O valor acima é convertido em bolsa de estudos.");
    }
}
