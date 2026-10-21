// Classe CursoPresencial

public class CursoPresencial extends Curso implements Certificavel{

    public CursoPresencial(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor por hora: R$20");
        System.out.println("Valor dos materiais: R$50");
    }

    @Override
    double calcularValor() {
        return (getCargaHoraria() * 20) + 50;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Certificamos que " + nomeAluno + " realizou a conclusão do curso presencial: ");
        System.out.println(getNome() + " com um total de " + getCargaHoraria() + " Horas.");
    }
}
