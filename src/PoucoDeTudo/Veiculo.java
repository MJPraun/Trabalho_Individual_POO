package PoucoDeTudo;

public abstract class Veiculo implements Fretavel, Tributavel {
    private String placa;
    private String marca;
    protected double valorDiaria;
    private double precoFipe;

    public Veiculo(String placa, String marca, double valorDiaria, double precoFipe) {
        this.placa = placa;
        this.marca = marca;
        this.valorDiaria = valorDiaria;
        this.precoFipe = precoFipe;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecoFipe() {
        return precoFipe;
    }

    @Override
    public String toString() {
        return String.format("Veículo: %s | Placa: %s | FIPE: R$ %.2f", marca, placa, precoFipe);
    }
}