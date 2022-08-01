package br.com.alura.imposto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public interface Imposto {

	
	BigDecimal calcular(Orcamento orcamento);
	
	
}
