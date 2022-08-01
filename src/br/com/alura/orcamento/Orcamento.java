package br.com.alura.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;

	private int quantidade;

	public Orcamento() {
	}

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}

	public Orcamento(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
