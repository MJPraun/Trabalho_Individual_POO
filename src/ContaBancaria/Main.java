package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(44556677, "Maria das Coves");

        conta.depositar(200.0);

        conta.sacar(150.0);

        System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());

        scanner.close();
    }
}