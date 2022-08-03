package br.com.alura.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	// DESSA FORMA CONFORMA MAIS ACOES SAO NECESSARIAS, A CLASSE GERAPEDIDOHANDLER NAO É MAIS MODIFICADA
	
	private List<AcaoAposGerarPedido> acoes;
	
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	// CONSTRUTOR COM INJECAO DE DEPENDENCIAS: REPOSITORY, SERVICE, ETC.

	public void executa(GeraPedido dados) {

		Orcamento orcamento = new Orcamento();

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executaAcao(pedido));
		
	}

}
