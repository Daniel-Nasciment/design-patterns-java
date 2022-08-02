package br.com.alura.pedido;

import java.math.BigDecimal;

public class TestesPedidos {

	public static void main(String[] args) {

		GeraPedido gerador = new GeraPedido("Daniel", new BigDecimal("100"), 5);
		
		GeraPedidoHandler handler = new GeraPedidoHandler(); // passaria as dependencias aqui (repository etc)

		handler.executa(gerador);
		
	}

}
