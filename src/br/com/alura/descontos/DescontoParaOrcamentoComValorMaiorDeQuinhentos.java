package br.com.alura.descontos;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorDeQuinhentos extends Desconto {

	public DescontoParaOrcamentoComValorMaiorDeQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.2"));

	}

	@Override
	public boolean regraAplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500.0")) > 0;
	}

}
