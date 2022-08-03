package br.com.alura.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.imposto.ItemOrcamento;
import br.com.alura.orcamento.situacao.EmAnalise;
import br.com.alura.orcamento.situacao.Finalizado;
import br.com.alura.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;

	// CLASSE QUE REPRESENTA A SITUAÇÃO
	private SituacaoOrcamento situacao;

	private List<ItemOrcamento> item;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.situacao = new EmAnalise();
		this.item = new ArrayList<>();
	}

	public BigDecimal getValor() {
		return valor;
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

	public List<ItemOrcamento> getItem() {
		return item;
	}

	public void setItem(List<ItemOrcamento> item) {
		this.item = item;
	}

	// A PROPRIA SITUACAO VAI ME RETORNAR O DESCONTO EXTRA (SE TIVER)
	public void aplicarDescontoExtra() {

		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

		this.valor.subtract(valorDescontoExtra);

	}

	public boolean isFInalizado() {
		return situacao instanceof Finalizado;
	}
	
	public void adicionarItem(ItemOrcamento item) {
		this.valor = valor.add(item.getValor());
		this.item.add(item);
	}

}
