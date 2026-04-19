package PoucoDeTudo;

public class CarroPasseio extends Veiculo {

    public CarroPasseio(String placa, String marca, double precoDiaria, double precoFipe) {
        super(placa, marca, precoDiaria, precoFipe);
    }

    @Override
    public double calcularLocacao(double peso, int dias) {
        return valorDiaria * dias; // Carro não cobra sobrecarga
    }

    @Override
    public double calcularIpva() {
        return getPrecoFipe() * 0.04; // 4%
    }
}