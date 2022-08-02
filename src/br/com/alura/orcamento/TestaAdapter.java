package br.com.alura.orcamento;

import java.math.BigDecimal;

public class TestaAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
		
		registro.registrar(orcamento);
		
	}

}
