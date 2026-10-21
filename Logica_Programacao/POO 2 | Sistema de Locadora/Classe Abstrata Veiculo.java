// Classe Abstrata Veículo

public abstract class Veiculo implements Operavel{
    private final String placa;
    private String modelo;
    private double valorBaseDiaria;
    private static int totalVeiculos;
    private static final String NOME_LOCADORA = "Filadéldia Carros.";

    public Veiculo(String placa, String modelo, double valorBaseDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        setValorBaseDiaria(valorBaseDiaria);
        totalVeiculos++;
    }

    // Métodos Getters.
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }

    // Métodos Setters.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorBaseDiaria(double valorBaseDiaria) {
        if(valorBaseDiaria > 0){
            this.valorBaseDiaria = valorBaseDiaria;
        } else {
            throw new IllegalArgumentException("Insira um valor maior que zero.");
        }
    }

    // Metodo abstrato calcular diaria.
    abstract double calcularDiaria();

    // Metodo concreto exibir dados.
    public void exibirDados(){
        System.out.println("=== Detalhes da Locação: ===");
        System.out.println("Nome da Locadora: " + NOME_LOCADORA);
        System.out.println("Placa do Veículo: " + placa);
        System.out.println("Modelo do Veículo: " + modelo);
        System.out.println("Valor da Diária: R$" + calcularDiaria());
    }

    // Metodo concreto calcularLocacao.
    public double calcularLocacao(int dias){
        if(dias > 0){
            System.out.println("Locação do veículo por " + dias + " dias: R$" + (dias * calcularDiaria()));
            return (dias * calcularDiaria());
        } else {
            throw new IllegalArgumentException("Insira um valor maior que zero.");
        }
    }

}
