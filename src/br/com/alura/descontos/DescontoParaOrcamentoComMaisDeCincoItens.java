package br.com.alura.descontos;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
		
	}

	@Override
	public boolean regraAplicarDesconto(Orcamento orcamento) {
		
		return orcamento.getItem().size() > 4;
	}
	
}
