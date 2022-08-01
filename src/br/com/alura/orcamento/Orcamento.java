package br.com.alura.orcamento;

import java.math.BigDecimal;

import br.com.alura.orcamento.situacao.EmAnalise;
import br.com.alura.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;

	private int quantidade;

	// CLASSE QUE REPRESENTA A SITUAÇÃO
	private SituacaoOrcamento situacao;

	public Orcamento() {
		this.situacao = new EmAnalise();
	}

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
		this.situacao = new EmAnalise();
	}

	public Orcamento(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	// A PROPRIA SITUACAO VAI TRANSITAR PARA O PROXIMO ESTADO SE FOR POSSIVEL
	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	// A PROPRIA SITUACAO VAI ME RETORNAR O DESCONTO EXTRA (SE TIVER)
	public void aplicarDescontoExtra() {

		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

		this.valor.subtract(valorDescontoExtra);

	}

}
