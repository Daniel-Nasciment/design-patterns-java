package br.com.alura.imposto;

import java.math.BigDecimal;

public class ItemOrcamento {

	private BigDecimal valor;

	private int quantidade;

	public ItemOrcamento(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
