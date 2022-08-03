package br.com.alura.imposto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class ISS extends Imposto{


	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.2"));
	}

}
