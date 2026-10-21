// Classe CursoOnline

public class CursoOnline extends Curso implements Certificavel{

    public CursoOnline(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    double calcularValor() {
        return getCargaHoraria() * 15;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor por hora: R$15");
        System.out.println("Valor dos materiais: R$0");
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Certificamos que " + nomeAluno + " realizou a conclusão do curso online: ");
        System.out.println(getNome() + " com um total de " + getCargaHoraria() + " Horas.");
    }
}
