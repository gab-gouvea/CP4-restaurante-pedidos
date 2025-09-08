package br.com.restaurante.pedidos.model;

public class ItemPedido {
    private int id;
    private int pedidoId;
    private int quantidade;
    private float preco;
    private String nome;

    public ItemPedido(int id, String nome, float preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public ItemPedido() {}

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", pedidoId=" + pedidoId +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
