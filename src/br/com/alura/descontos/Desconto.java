package br.com.alura.descontos;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	public abstract boolean regraAplicarDesconto(Orcamento orcamento);
	
	// AGORA A CLASSE MAE SABE O FLUXO A SER SEGUIDO, SEM A NECESSIDADE DE TODAS AS CLASSES FILHAS SABEREM DESSE PROCESSO
	// FLUXO: FOI APLICADO ? NÃO -> PROXIMO
	// DESSA FORMA ENCAPSULAMOS ISSO DENTRO DA CLASSE MAE
	// ESSE MÉTODO É UM TEMPLATE
	public BigDecimal calcular(Orcamento orcamento) {
		
		// LÓGICA DO IF ESTA SENDO DELEGADA AS CLASSES FILHAS
		
		if(regraAplicarDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		// DESSA FORMA EU VOU ENCADEANDO TODOS OS DESCONTOS ATÉ UM DELES SEREM APLICADOS
		// OU SEJA, SE A REGRA DO IF ACIMA NAO FOR APLICADA, ELE VAI ENCADEAR OUTRA CLASSE FILHA DE "Desconto"
		// PARA IR VALIDANDO SE O DESCONTO JA FOI APLICADO
		return proximo.calcular(orcamento);
	};

	
	
}
