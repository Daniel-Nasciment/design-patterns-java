package br.com.alura.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.orcamento.Orcamento;

public class TestesPedidos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100.0"), 6);
		
		Pedido pedido = new Pedido("Daniel", LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar email com dados do novo pedido");
		
	}

}
