// Classe Concreta Moto

public class Moto extends Veiculo implements Operavel{
    private int cilindradas;

    public Moto(String placa, String modelo, double valorBaseDiaria, int cilindradas) {
        super(placa, modelo, valorBaseDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    double calcularDiaria() {
        return (20 + getValorBaseDiaria());
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas da Moto: " + getCilindradas());
    }

    @Override
    public void ligar() {
        System.out.println("A moto " + getModelo() + " está ligando...");
        System.out.println("Vruuuuuuuuuum.");
    }

    @Override
    public void desligar() {
        System.out.println("A moto " + getModelo() + " está desligando...");
        System.out.println("Pof.");
    }
}
