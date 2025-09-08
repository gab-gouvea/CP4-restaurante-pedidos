package br.com.restaurante.pedidos.exception;

public class PedidoException extends RuntimeException{

    public PedidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public PedidoException(String mensagem) {
        super(mensagem);
    }
}
