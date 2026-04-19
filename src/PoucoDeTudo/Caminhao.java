package PoucoDeTudo;

public class Caminhao extends Veiculo {
    private double pesoMaximo;

    public Caminhao(String placa, String marca, double precoDiaria, double precoFipe, double capacidade) {
        super(placa, marca, precoDiaria, precoFipe);
        this.pesoMaximo = capacidade;
    }

    @Override
    public double calcularLocacao(double peso, int dias) {
        double total = valorDiaria * dias;

        if (peso > pesoMaximo) {
            total = total * 1.10;
        }
        return total;
    }

    @Override
    public double calcularIpva() {
        return getPrecoFipe() * 0.015; // 1,5%
    }
}