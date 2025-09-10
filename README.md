# Sistema de Pedidos - Restaurante 🍽️

Projeto de exemplo em **Java + JDBC + MySQL** para gerenciar pedidos de um restaurante.  
Inclui operações de **CRUD** ainda incompleto com (Create, Read) sobre a entidade `Pedido`.

---

## 📌 Estrutura do projeto

- `br.com.restaurante.pedidos.model.Pedido` → classe modelo (representa um pedido).
- `br.com.restaurante.pedidos.dao.PedidoDAO` → interface do DAO.
- `br.com.restaurante.pedidos.dao.PedidoDAOImpl` → implementação do DAO usando JDBC.
- `br.com.restaurante.pedidos.singleton.ConexaoBD` → singleton responsável por criar/gerenciar a conexão com o banco.
- `pedidosMain.java` → exemplo de uso do DAO (inserir, buscar, listar, atualizar, deletar).

---

## ⚙️ Requisitos

- Java 23
- MySQL rodando localmente.
- Driver JDBC do MySQL (mysql-connector-j) no **classpath**.

---

## 🗄️ Banco de Dados

Crie o banco e a tabela antes de rodar:

```sql
CREATE DATABASE restaurante;

USE restaurante;

CREATE TABLE pedido (
    id INT PRIMARY KEY,
    numero_mesa VARCHAR(20) NOT NULL,
    valor_total DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL
);

CREATE TABLE item_pedido (
    id INT PRIMARY KEY,
    pedido_id INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedido(id)

```
## 🔌 Configuração da conexão

No arquivo ConexaoBD.java, ajuste com suas credenciais do MySQL:

```java
instancia = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/restaurante",
    "usuario",
    "senha"
);
```

-- ✅ AGORA SÓ EXECUTAR 😎😎
