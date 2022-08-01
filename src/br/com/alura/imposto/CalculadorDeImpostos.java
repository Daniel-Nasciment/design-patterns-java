package br.com.alura.imposto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class CalculadorDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		
		// SE TIVERMOS 30 TipoImposto TERIAMOS QUE CRIAR VARIOS IFs PARA DEFINIR OS CALCULOS
		// IMPLEMENTANDO O STRATEGY, PODEMOS PASSAR UMA INTERFACE (COMO É GENÉRICA) INDEPENDENTE DA IMPLEMENTACAO
		// A CALCULADORA FUNCIONARÁ
		
		return imposto.calcular(orcamento);
	}

}
