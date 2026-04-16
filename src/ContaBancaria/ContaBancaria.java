package ContaBancaria;

public class ContaBancaria {

    public int numero;
    public String titular;
    public double saldo;
    public int retirada;


    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.00;
        this.retirada = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado mais bônus de boas-vindas de R$ 50,00.");
        } else {
            System.out.println("Erro: Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (retirada >= 3) {
            System.out.println("Erro: Limite de 3 saques diários atingido.");
        }
        else if (valor > 1000) {
            System.out.println("Erro: Limite máximo por saque é de R$ 1.000,00.");
        }
        else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente. Saldo atual: R$ " + saldo);
        }
        else {
            this.saldo -= valor;
            this.retirada++;
            System.out.println("Saque de R$ " + valor + " realizado. Saques hoje: " + retirada);
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}