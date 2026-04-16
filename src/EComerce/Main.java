package EComerce;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mário Praun");


        Pedido pedido = new Pedido(cliente1);


        pedido.adicionarItem(new ItemPedido("Pendrive", 2, 45.00));
        pedido.adicionarItem(new ItemPedido("Mousepad", 1, 30.00));

        System.out.println("Simulando Pedido 1:");
        pedido.fecharPedido();


        Pedido pedido2 = new Pedido(cliente1);
        pedido2.adicionarItem(new ItemPedido("Monitor Gamer", 1, 1200.00));

        System.out.println("Simulando Pedido 2:");
        pedido2.fecharPedido();
    }
}