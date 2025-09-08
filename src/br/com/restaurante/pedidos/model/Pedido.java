package br.com.restaurante.pedidos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private String numeroMesa;
    private LocalDateTime dataHora;
    private EnumStatus status;
    private List<ItemPedido> listaPedido = new ArrayList<>();
    private float valorTotal;


    public Pedido(String numeroMesa, EnumStatus status, LocalDateTime dataHora, List<ItemPedido> listaPedido) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.status = status;
        this.dataHora = dataHora;
        this.listaPedido = listaPedido;
    }

    public Pedido() {}

    public Pedido(int id, String numeroMesa, EnumStatus status, Float valorTotal, LocalDateTime dataHora) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.status = status;
        this.dataHora = dataHora;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public List<ItemPedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<ItemPedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", numeroMesa='" + numeroMesa + '\'' +
                ", dataHora=" + dataHora +
                ", status=" + status +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
