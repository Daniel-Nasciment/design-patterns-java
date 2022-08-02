package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {
	
	@Override
	public void executaAcao(Pedido pedido) {
		System.out.println("Enviar email com dados do novo pedido");
	}

}
