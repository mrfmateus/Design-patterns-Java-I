package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class GerarLogDoPedido implements AcaoAposGerarPedido {

  public void executarAcao(Pedido pedido) {
    System.out.println("Gerando log do pedido!");
  }
}
