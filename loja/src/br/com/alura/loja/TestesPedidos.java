package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.GerarLogDoPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.List;

public class TestesPedidos {

  public static void main(String[] args) {
    String cliente = "Mateus";
    BigDecimal valorOrcamento = new BigDecimal("300");
    int quantidadeItens = Integer.parseInt("2");

    GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
    GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(List.of(
      new SalvarPedidoNoBancoDeDados(),
      new EnviarEmailPedido(),
      new GerarLogDoPedido())
    );
    geraPedidoHandler.execute(gerador);
  }
}
