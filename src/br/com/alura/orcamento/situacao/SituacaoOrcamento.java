package br.com.alura.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class SituacaoOrcamento {

	// ESSE CARA REPRESENTA O PATTERN STATE
	// � MUITO PARECIDO COM O STRATEGY
	// REPRESENTA A QUEST�O DE ESTADO DE UM OBJETO
	// ESSE PADR�O � USADO QUANDO TEMOS TRANSI��O DE ESTADOS OU QUANDO PRECISAMOS DESENVOLVER UMA REGRA OU ALGORITMO BASEADO NO ESTADO DE UM OBJETO 
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Nao pode aprovar");
	}

	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Nao pode reprovar");
	}

	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Nao pode finalizar");
	}
	
}
