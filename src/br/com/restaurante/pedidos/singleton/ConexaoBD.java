package br.com.restaurante.pedidos.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static Connection conn;

    private ConexaoBD() {}

    public static Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante",
                        "root","");
                System.out.println(conn + " conectado");
            } catch (SQLException e) {
                System.out.println("Erro ao conectar " + e.getMessage());
            }
        }
        return conn;
    }
}
