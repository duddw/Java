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

// Classe Vendedor

import java.util.Scanner;
public class Vendedor extends Funcionario {
    Scanner scanner = new Scanner(System.in);
    private double valorVendas;
    private double percentualComissao;
    private double valorvendanova;

    public Vendedor(String nome, int matricula, double salarioBase, double valorVendas, int percentualComissao) {
        super(nome, matricula, salarioBase);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
        this.valorvendanova = valorvendanova;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(int percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getValorvendanova() {
        return valorvendanova;
    }

    public void setValorvendanova(double valorvendanova) {
        this.valorvendanova = valorvendanova;
    }

    public void registrarVenda(){
        System.out.println("Digite o valor da nova venda: ");
        valorvendanova = scanner.nextDouble();
        valorVendas += valorvendanova;
        System.out.printf("O valor total das vendas até agora é: R$%.2f", valorVendas);
        System.out.println();
    }
    @Override
    public void calcularSalario() {
        double comissao = valorVendas * (percentualComissao / 100);
        System.out.printf("Valor das comissões: R$%.2f", comissao);
        System.out.println();
        super.calcularSalario();
        double salariototal = getSalarioBase() + comissao;
        System.out.printf("Salário total: R$%.2f", salariototal);
        System.out.println();
    }
}

// Classe Estagiário

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, int matricula, double salarioBase, String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public void realizarTreinamento(){
        System.out.println("Realizando treinamento...");
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        System.out.println("O valor acima é convertido em bolsa de estudos.");
    }
}

// Main

import java.util.Scanner;
public class Main {
    static void main() {
        Gerente gerente = new Gerente(
                "marcelo",
                1000,
                5000,
                1500
        );
        Vendedor vendedor = new Vendedor(
                "dudd",
                1001,
                3000,
                10000,
                5
        );
        Estagiario estagiario = new Estagiario(
                "leonam edson",
                1002,
                1200,
                "UEL"
        );

        linha();

        gerente.apresentarDados();
        System.out.println();
        linha();

        vendedor.apresentarDados();
        System.out.println();
        linha();

        estagiario.apresentarDados();
        System.out.println();
        linha();

        System.out.println("Salário do Marcelo:");
        gerente.calcularSalario();
        System.out.println();
        linha();

        System.out.println("Salario do dudd:");
        vendedor.calcularSalario();
        System.out.println();
        linha();

        System.out.println("Salário do leonam edson:");
        estagiario.calcularSalario();
        System.out.println();
        linha();

        gerente.realizarReuniao();
        System.out.println();
        linha();

        estagiario.realizarTreinamento();
        System.out.println();
        linha();

        vendedor.registrarVenda();
        linha();

    }

    static void linha(){
        for(int i = 0; i < 20; i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
