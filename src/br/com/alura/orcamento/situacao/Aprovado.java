package br.com.alura.orcamento.situacao;

import br.com.alura.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento{
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
