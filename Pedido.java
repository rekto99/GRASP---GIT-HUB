import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    /*
     * PADRÃO GRASP UTILIZADO: Creator
     *
     * A classe Pedido cria objetos ItemPedido porque ela possui, armazena
     * e controla a lista de itens do pedido. Segundo o GRASP Creator,
     * uma classe deve criar objetos que ela contém ou usa diretamente.
     *
     * Aplicado neste método: adicionarItem().
     */
    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    /*
     * PADRÃO GRASP UTILIZADO: High Cohesion
     *
     * A classe Pedido fica responsável apenas por regras relacionadas
     * ao pedido, como adicionar itens e calcular o total. Isso mantém
     * a classe coesa, com responsabilidades bem definidas.
     *
     * Aplicado neste método: calcularTotal().
     */
    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
