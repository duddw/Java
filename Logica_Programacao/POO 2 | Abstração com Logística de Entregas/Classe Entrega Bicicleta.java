// Classe EntregaBicicleta

public class EntregaBicicleta extends Entrega implements Rastreavel{

    public EntregaBicicleta(String codigo, int distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    double calcularFrete() {
        return (getDistanciaKm() * 2);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor por Km: R$2");
        System.out.println("Preço total: R$" + (getDistanciaKm() * 2));
    }

    @Override
    public void rastrear() {
        System.out.println("Detalhes da entrega " + getCodigo());
        System.out.println("Modalidade: Bicicleta.");
        System.out.println("Status: Em rota de entrega.");
    }
}
