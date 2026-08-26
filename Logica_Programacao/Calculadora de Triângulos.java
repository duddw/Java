// Classe

public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double perimetro(){
        return ladoA + ladoB + ladoC;
    }

    public boolean verificarTriangulo(){
        return (ladoA + ladoB > ladoC) &&
               (ladoB + ladoC > ladoA) &&
               (ladoC + ladoA > ladoB);
    }

    public double calcularArea(){
        double p = (ladoA + ladoB + ladoC)/2;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }
}

// Main:

public class Principal {
    static void main() {

        Triangulo triangulo1 = new Triangulo(
                5,
                6,
                7
        );

        Triangulo triangulo2 = new Triangulo(
                2,
                4,
                8
        );

        if(triangulo1.verificarTriangulo()){
            System.out.println("O triângulo 1 é um triângulo.");
        } else {
            System.out.println("O triângulo 1 não é um triângulo.");
        }


        if(triangulo2.verificarTriangulo()){
            System.out.println("O triângulo 2 é um triângulo.");
        } else {
            System.out.println("O triângulo 2 não é um triângulo.");
        }
        System.out.println();


        System.out.println("O perímetro do triângulo 1 é: " + triangulo1.perimetro());
        System.out.println("O perímetro do triângulo 2 é: " + triangulo2.perimetro());
        System.out.println();


        System.out.println("A área do triângulo 1 é: " + triangulo1.calcularArea());
        System.out.println("A área do triângulo 2 é: " + triangulo2.calcularArea());
    }
}
