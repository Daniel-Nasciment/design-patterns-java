package br.com.alura.descontos;

import java.math.BigDecimal;

import br.com.alura.imposto.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;

public class TesteCalculadorDesconto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000"), 5));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		
		System.out.println(calculadora.calcular(orcamento));
		
	}
	
}
