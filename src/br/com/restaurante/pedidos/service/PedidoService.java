package br.com.restaurante.pedidos.service;

import br.com.restaurante.pedidos.dao.PedidoDAO;
import br.com.restaurante.pedidos.dao.PedidoDAOImpl;
import br.com.restaurante.pedidos.model.ItemPedido;
import br.com.restaurante.pedidos.model.Pedido;

import java.util.List;

public class PedidoService {

    private PedidoDAO pedidoDAO = new PedidoDAOImpl();

    public void criarPedido(Pedido pedido) {
        float total = 0f;
        for (ItemPedido item : pedido.getListaPedido()) {
            total += item.getPreco() * item.getQuantidade();
        }
        pedido.setValorTotal(total);
        pedidoDAO.salvar(pedido);
    }

    public List<Pedido> listarTodos() {
        return pedidoDAO.listarTodos();
    }

}
