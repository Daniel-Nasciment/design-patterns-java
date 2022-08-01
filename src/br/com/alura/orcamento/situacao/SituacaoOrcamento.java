package br.com.alura.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class SituacaoOrcamento {

	// ESSE CARA REPRESENTA O PATTERN STATE
	// É MUITO PARECIDO COM O STRATEGY
	// REPRESENTA A QUESTÃO DE ESTADO DE UM OBJETO
	// ESSE PADRÃO É USADO QUANDO TEMOS TRANSIÇÃO DE ESTADOS OU QUANDO PRECISAMOS DESENVOLVER UMA REGRA OU ALGORITMO BASEADO NO ESTADO DE UM OBJETO 
	
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
