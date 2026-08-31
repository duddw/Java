// Classe Gerente

public class Gerente extends Funcionario {
    private double valorBonus;

    public Gerente(String nome, int matricula, double salarioBase, double valorBonus) {
        super(nome, matricula, salarioBase);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    public void realizarReuniao(){
        System.out.println("Chamando todos os funcionários.");
    }

    @Override
    public void calcularSalario() {
        System.out.printf("O valor bônus é: R$%.2f", valorBonus);
        System.out.println();
        super.calcularSalario();
        double salariototal = getSalarioBase() + valorBonus;
        System.out.printf("Salário total: R$%.2f", salariototal);
        System.out.println();
    }
}
