package PoucoDeTudo;

public class Main {
    public static void main(String[] args) {
        Caminhao meuCaminhao = new Caminhao("ABC-1234", "Volvo FH 540", 800.0, 300000.0, 15.0);
        CarroPasseio meuCarro = new CarroPasseio("XYZ-5678", "Honda Civic", 150.0, 80000.0);

        System.out.println("************ Sistema de Veículos ************");
        System.out.println(meuCaminhao);
        System.out.println("IPVA Caminhão: R$ " + meuCaminhao.calcularIpva());
        System.out.println("Locação (20t / 8 dias): R$ " + meuCaminhao.calcularLocacao(20.0, 5));

        System.out.println("\n" + meuCarro);
        System.out.println("IPVA Carro: R$ " + meuCarro.calcularIpva());
        System.out.println("Locação (5 dias): R$ " + meuCarro.calcularLocacao(0, 3));
    }
}