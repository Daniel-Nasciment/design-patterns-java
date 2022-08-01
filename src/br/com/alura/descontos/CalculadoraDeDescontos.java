package br.com.alura.descontos;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		// DESSA FORMA VAMOS ENCADEANDO AS CHAMADAS DAS CLASSES QUE REPRESENTAM CADA
		// FORMA DE DESCONTO
		Desconto desconto = 
				new DescontoParaOrcamentoComMaisDeCincoItens(
						new DescontoParaOrcamentoComValorMaiorDeQuinhentos(
								new SemDesconto()));

		return desconto.calcular(orcamento);
	}

}
