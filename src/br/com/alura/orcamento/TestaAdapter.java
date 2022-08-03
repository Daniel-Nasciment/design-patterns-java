package br.com.alura.orcamento;

import java.math.BigDecimal;

import br.com.alura.imposto.ItemOrcamento;

public class TestaAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000"), 4));
		
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
		
		registro.registrar(orcamento);
		
	}

}
