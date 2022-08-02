package br.com.alura.pedido;

import java.time.LocalDateTime;

import br.com.alura.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	
	// CONSTRUTOR COM INJECAO DE DEPENDENCIAS: REPOSITORY, SERVICE, ETC.
	
	public void executa(GeraPedido dados) {

		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar email com dados do novo pedido");

	}

}
