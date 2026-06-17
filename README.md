# Atividade GRASP - Sistema de Pedidos em Java

Este projeto foi desenvolvido para demonstrar a aplicação prática de princípios GRASP em uma aplicação Java simples.

## Tema do sistema

Sistema simples de pedidos, onde é possível criar produtos, adicionar itens a um pedido e calcular o valor total da compra.

## Princípios GRASP aplicados

### 1. Creator

A classe `Pedido` é responsável por criar objetos `ItemPedido`, pois ela contém e gerencia a lista de itens do pedido.

Aplicação no código:

```java
public void adicionarItem(Produto produto, int quantidade) {
    ItemPedido item = new ItemPedido(produto, quantidade);
    itens.add(item);
}
```

### 2. Controller

A classe `PedidoController` recebe as ações principais do sistema e coordena o fluxo entre as classes `Pedido` e `Produto`.

Aplicação no código:

```java
public void adicionarProdutoAoPedido(Produto produto, int quantidade) {
    pedido.adicionarItem(produto, quantidade);
}
```

### 3. High Cohesion

Cada classe possui uma responsabilidade bem definida:

- `Produto`: guarda os dados do produto;
- `ItemPedido`: representa um item específico do pedido;
- `Pedido`: gerencia os itens e calcula o total;
- `PedidoController`: controla as operações do sistema;
- `Main`: executa a aplicação.

### 4. Low Coupling

A classe `Main` não acessa diretamente os detalhes internos de `Pedido`. Ela utiliza o `PedidoController`, reduzindo a dependência entre as classes.

## Como executar

Entre na pasta `src` e execute:

```bash
javac *.java
java Main
```

## Autor

João Pedro Carneiro Ibiapino - UC25200195
