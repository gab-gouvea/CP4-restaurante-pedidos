package br.com.restaurante.pedidos.pedidosMain;

import br.com.restaurante.pedidos.model.EnumStatus;
import br.com.restaurante.pedidos.model.ItemPedido;
import br.com.restaurante.pedidos.model.Pedido;
import br.com.restaurante.pedidos.service.PedidoService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppPedido {
    public static void main(String[] args) {
        PedidoService service = new PedidoService();
//        salvar(service);
        listarTodos(service);
    }
    public static void salvar(PedidoService service) {
        List<ItemPedido> listaPedido = new ArrayList<>();
        listaPedido.add(new ItemPedido(6, "Taça de vinho tinto", 57.0f, 1));
        listaPedido.add(new ItemPedido(9, "Macarrao", 98.0f, 2));
        Pedido pedido = new Pedido("Mesa 9", EnumStatus.ABERTO, LocalDateTime.now(), listaPedido);
        service.criarPedido(pedido);
    }

    public static void listarTodos(PedidoService service) {
        List<Pedido> pedidos = service.listarTodos();

        System.out.println("---- LISTA DE PEDIDOS ----");
        for (Pedido p : pedidos) {
            System.out.println("ID: " + p.getId() +
                    " | Mesa: " + p.getNumeroMesa() +
                    " | Total: R$" + p.getValorTotal() +
                    " | Status: " + p.getStatus());
        }

    }
}
