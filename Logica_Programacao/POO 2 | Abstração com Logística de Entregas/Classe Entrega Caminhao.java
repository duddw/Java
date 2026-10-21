// Classe EntregaCaminhao

public class EntregaCaminhao extends Entrega implements Rastreavel{

    public EntregaCaminhao(String codigo, int distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor por Km: R$5 + Taxa Fixa: R$30.");
        System.out.println("Preço total: R$" + (getDistanciaKm() * 5 + 30));
    }

    @Override
    double calcularFrete() {
        return (getDistanciaKm() * 5) + 30;
    }

    @Override
    public void rastrear() {
        System.out.println("Detalhes da entrega " + getCodigo());
        System.out.println("Modalidade: Caminhão.");
        System.out.println("Status: Transferência entre Filiais.");
    }
}
