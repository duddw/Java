// Classe Triângulo

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
