package br.com.alura.descontos;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		// DESSA FORMA AQUI SERIA O "FIM DA LINHA CASO NAO SEJA APLICADO NENHUM DESCONTO"
		return BigDecimal.ZERO;
	}
	
}
