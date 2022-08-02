package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class SalvarBancoDeDados implements AcaoAposGerarPedido{
	
	@Override
	public void executaAcao(Pedido pedido) {
		System.out.println("Salvar pedido no banco de dados");
	}


}
