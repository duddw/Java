// Classe Carro

public class Carro {

    private String placa;
    private String modelo;
    private double valorDiaria;
    private boolean disponivel;

    public Carro(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    // Retorna a placa do carro.
    public String getPlaca() {
        return placa;
    }

    // Retorna o modelo do carro.
    public String getModelo() {
        return modelo;
    }

    // Retorna o valor da diária do carro.
    public double getValorDiaria() {
        return valorDiaria;
    }

    // Retorna se o carro está disponível para aluguel.
    public boolean isDisponivel() {
        return disponivel;
    }

    // Define o carro solicitado como disponível.
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
