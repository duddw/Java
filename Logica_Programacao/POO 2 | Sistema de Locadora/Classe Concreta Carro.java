// Classe Concreta Carro

public class Carro extends Veiculo implements Operavel{
    private int quantidadePortas;

    public Carro(String placa, String modelo, double valorBaseDiaria, int quantidadePortas) {
        super(placa, modelo, valorBaseDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    double calcularDiaria() {
        return (50 + getValorBaseDiaria());
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de Portas: " + getQuantidadePortas());
    }

    @Override
    public void ligar() {
        System.out.println("O veículo " + getModelo() + " está ligando...");
        System.out.println("Vrum vrum.");
    }

    @Override
    public void desligar() {
        System.out.println("O veículo " + getModelo() + " está desligando...");
        System.out.println("Pof.");
    }
}
