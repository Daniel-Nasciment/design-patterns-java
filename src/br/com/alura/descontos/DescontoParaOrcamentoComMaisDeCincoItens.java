package br.com.alura.descontos;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		if(orcamento.getQuantidade() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		// DESSA FORMA EU VOU ENCADEANDO TODOS OS DESCONTOS ATÉ UM DELES SEREM APLICADOS
		// OU SEJA, SE A REGRA DO IF ACIMA NAO FOR APLICADA, ELE VAI ENCADEAR OUTRA CLASSE FILHA DE "Desconto"
		// PARA IR VALIDANDO SE O DESCONTO JA FOI APLICADO
		return proximo.calcular(orcamento);
	}
	
}
