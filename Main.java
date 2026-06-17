public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00);
        Produto produto2 = new Produto("Mouse", 80.00);
        Produto produto3 = new Produto("Teclado", 150.00);

        PedidoController controller = new PedidoController();

        controller.adicionarProdutoAoPedido(produto1, 1);
        controller.adicionarProdutoAoPedido(produto2, 2);
        controller.adicionarProdutoAoPedido(produto3, 1);

        controller.finalizarPedido();
    }
}
