package br.com.alura.imposto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class ISS implements Imposto{

	// O IMPOSTO DEVE SER CAPAZ DE SE CALCULAR
	
		@Override
		public BigDecimal calcular(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.2"));
		}

}
