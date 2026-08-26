// Classe Animal

public class Animal {
    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void emitirSom(){

    }

    public void apresentarDados(){
        System.out.println("Nome do Animal: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + "kg");
    }
}

// Classe Cachorro

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O cachorro faz au au");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Raça: " + raca);
    }
}

// Classe Gato

public class Gato extends Animal {
    private String pelagem;

    public Gato(String nome, int idade, double peso, String pelagem) {
        super(nome, idade, peso);
        this.pelagem = pelagem;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O gato faz miau miau");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Pelagem: " + pelagem);
    }
}

// Classe Pássaro

public class Passaro extends Animal {
    private String especie;

    public Passaro(String nome, int idade, double peso, String especie) {
        super(nome, idade, peso);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O passaro faz piupiu");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Espécie: " + especie);
    }
}

// Main

public class Main {
    static void main() {

        Cachorro cachorro = new Cachorro(
                "Cookie",
                4,
                4.00,
                "maltês"
        );

        Gato gato = new Gato(
                "Nina",
                7,
                60.00,
                "siamês"
        );

        Passaro passaro = new Passaro(
                "leonam edson",
                18,
                98.9,
                "pica-pau"
        );

        cachorro.apresentarDados();
        cachorro.emitirSom();
        System.out.println();

        gato.apresentarDados();
        gato.emitirSom();
        System.out.println();

        passaro.apresentarDados();
        passaro.emitirSom();
        System.out.println();

    }
}
