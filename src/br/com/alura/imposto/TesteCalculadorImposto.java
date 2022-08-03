package br.com.alura.imposto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class TesteCalculadorImposto {

	public static void main(String[] args) {
		
		//Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		
		// DESSA FORMA CONSEGUIMOS ACUMULAR OS VALORES DOS IMPOSTOS
//		System.out.println(calculadora.calcular(orcamento, 
//				new ICMS(
//						new ISS(
//								null))));
		
	}
	
}
