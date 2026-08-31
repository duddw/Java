// Classe Funcionário

public class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void calcularSalario(){
        System.out.printf("O salário total é: R$%.2f", salarioBase);
        System.out.println();
    }

    public void apresentarDados(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário Base: R$%.2f", salarioBase);
        System.out.println();
    }
}
