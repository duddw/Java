// Classe Abstrata Entrega

public abstract class Entrega implements Rastreavel {
    private String codigo;
    private int distanciaKm;

    public Entrega(String codigo, int distanciaKm) {
        this.codigo = codigo;
        this.distanciaKm = distanciaKm;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void exibirDados(){
        System.out.println("Entrega " + codigo);
        System.out.println("Distância: " + distanciaKm + " Km.");
    }

    abstract double calcularFrete();
}
