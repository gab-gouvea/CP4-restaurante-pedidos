package br.com.restaurante.pedidos.dao;

import br.com.restaurante.pedidos.exception.PedidoException;
import br.com.restaurante.pedidos.model.EnumStatus;
import br.com.restaurante.pedidos.model.Pedido;
import br.com.restaurante.pedidos.singleton.ConexaoBD;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAOImpl implements PedidoDAO {

    private Connection conn;

    public PedidoDAOImpl() {
        this.conn = ConexaoBD.getConn();
    }

    @Override
    public void salvar(Pedido pedido) {
        String insert = "INSERT INTO pedido (numero_mesa, status, valor_total, data_hora) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(insert)) {
            statement.setString(1, pedido.getNumeroMesa());
            statement.setString(2, pedido.getStatus().name());
            statement.setFloat(3, pedido.getValorTotal());
            statement.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
            statement.executeUpdate();
            System.out.println("Pedido Salvo com sucesso!");
        } catch (SQLException e) {
            throw new PedidoException("Erro ao salvar pedido!", e);
        }
    }

    @Override
    public List<Pedido> listarTodos() {
        List<Pedido> pedidos = new ArrayList<>();
        String insert = "Select * From pedido";
        try (PreparedStatement statement = conn.prepareStatement(insert)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pedido pedido = new Pedido(
                        resultSet.getInt("id"),
                        resultSet.getString("numero_mesa"),
                        EnumStatus.valueOf(resultSet.getString("status")),
                        resultSet.getFloat("valor_total"),
                        resultSet.getTimestamp("data_hora").toLocalDateTime()
                );
                pedidos.add(pedido);
            }

        } catch (SQLException e) {
            throw new PedidoException("Erro ao salvar pedido!", e);
        }
        return pedidos;
    }
}
