public class PedidoController {
    private Pedido pedido;

    public PedidoController() {
        this.pedido = new Pedido();
    }

    /*
     * PADRÃO GRASP UTILIZADO: Controller
     *
     * A classe PedidoController recebe as ações do sistema e coordena
     * o fluxo entre as classes de domínio, como Pedido e Produto.
     *
     * Isso evita que a classe Main concentre regras de negócio.
     *
     * Aplicado nos métodos: adicionarProdutoAoPedido(), mostrarResumoPedido()
     * e finalizarPedido().
     */
    public void adicionarProdutoAoPedido(Produto produto, int quantidade) {
        pedido.adicionarItem(produto, quantidade);
    }

    public void mostrarResumoPedido() {
        System.out.println("===== RESUMO DO PEDIDO =====");

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(
                item.getProduto().getNome() +
                " | Quantidade: " + item.getQuantidade() +
                " | Subtotal: R$ " + item.calcularSubtotal()
            );
        }
    }

    /*
     * PADRÃO GRASP UTILIZADO: Low Coupling
     *
     * A classe Main não acessa diretamente a lista de itens nem calcula
     * o total do pedido. Ela conversa apenas com o PedidoController.
     * Isso reduz o acoplamento entre as classes e facilita manutenção.
     *
     * Aplicado neste método: finalizarPedido().
     */
    public void finalizarPedido() {
        mostrarResumoPedido();
        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    }
}
