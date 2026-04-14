import java.util.Scanner;

public class CaixaEletronico {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int quantidadeSaques = 0;
        int opcao;

        do{
            System.out.println("\n ****** MENU CAIXA ELETRONICO ******");
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Deposite aqui seu Dinheiro");
            System.out.println("3 - Retire aqui seu Dinheiro");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:  ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Valor do deposito: ");
                    double deposito =scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito foi realizado!");
                    break;
                case 3:
                    if (quantidadeSaques >= 3) {
                        System.out.println("Atingiu o limite de saques diários");

                    }else{
                        System.out.print("Valor do saque: ");
                        double valorSaque = scanner.nextDouble();
                        if (valorSaque > 1000) {
                            System.out.println("Erro: Limite máximo de saque diário é de R$ 1.000,00 por dia");
                        }else if (valorSaque > saldo) {
                            System.out.println("Saldo é insuficiente.");
                        }else{
                            saldo -= valorSaque;
                            quantidadeSaques++;
                            System.out.println("Saque realizado!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }
        }while (opcao!=0);
        while (opcao!=0);
        scanner.close();
    }
}