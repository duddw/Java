// Classe Circulo

public class Circulo extends Forma {
    private int raio;

    public Circulo(String nome, int raio) {
        super(nome);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        System.out.println("A área é: " + (Math.PI * (raio * raio)));
    }
}
