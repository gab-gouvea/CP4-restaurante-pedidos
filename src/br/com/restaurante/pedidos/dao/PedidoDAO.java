package br.com.restaurante.pedidos.dao;

import br.com.restaurante.pedidos.model.Pedido;

import java.util.List;

public interface PedidoDAO {
    void salvar(Pedido pedido);
    List<Pedido> listarTodos();
}
