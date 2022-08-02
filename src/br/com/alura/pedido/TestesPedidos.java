package br.com.alura.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.pedido.acao.EnviarEmail;
import br.com.alura.pedido.acao.SalvarBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {

		GeraPedido gerador = new GeraPedido("Daniel", new BigDecimal("100"), 5);
		
		// PASSO TODAS AS ACOES QUE DEVEM SER EXECUTADAS
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarBancoDeDados(), new EnviarEmail())); // passaria as dependencias aqui (repository etc)

		handler.executa(gerador);
		
	}

}
