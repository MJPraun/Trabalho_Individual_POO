package EComerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
         this.itens = new ArrayList<>();
    }
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void fecharPedido() {
        double totalItens = 0;

        System.out.println("\n******** RECIBO DO PEDIDO ********");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("--------------------------------------");

        for (ItemPedido item : itens) {
            totalItens += item.getSubtotal();
            System.out.printf("%s x%d - R$%.2f (Subtotal: R$%.2f)\n",
                    item.getNomeProduto(), item.getQuantidade(),
                    item.getPrecoUnitario(), item.getSubtotal());
        }

        double frete = (totalItens > 250.00) ? 0.0 : 25.0;
        double totalFinal = totalItens + frete;

        System.out.println("------------------------");
        System.out.printf("Total dos Itens: R$%.2f\n", totalItens);
        System.out.printf("Frete: %s\n", (frete == 0 ? "GRÁTIS" : "R$25,00"));
        System.out.printf("VALOR TOTAL: R$%.2f\n", totalFinal);
        System.out.println("------------------------");
    }
}
