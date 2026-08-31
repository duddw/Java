// Classe Carro


public class Carro {
   private String marca;
   private String modelo;
   private Motor motor;


   public Carro(String marca, String modelo, int cilindradas, int combustivel) {
       this.marca = marca;
       this.modelo = modelo;
       this.motor = new Motor(cilindradas, combustivel);
   }


   public String getMarca() {
       return marca;
   }


   public void setMarca(String marca) {
       this.marca = marca;
   }


   public String getModelo() {
       return modelo;
   }


   public void setModelo(String modelo) {
       this.modelo = modelo;
   }


   public Motor getMotor() {
       return motor;
   }


   public void setMotor(Motor motor) {
       this.motor = motor;
   }


   public void mostrarCarro(){
       System.out.println("\n=====================================");
       System.out.println("Modelo do carro: " + getModelo());
       System.out.println("Marca: " + getMarca());
       System.out.println("Cilindradas do Motor: " + motor.getCilindradas() + "Cm³");
       System.out.println("Combustivel restante: " + motor.getCombustivel() + "L");
   }
}
