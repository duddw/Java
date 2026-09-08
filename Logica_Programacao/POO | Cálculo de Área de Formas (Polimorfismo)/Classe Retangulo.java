// Classe Retangulo

public class Retangulo extends Forma {
    private int base;
    private int altura;

    public Retangulo(String nome, int base, int altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        System.out.println("A área é: " + (base * altura));
    }
}
