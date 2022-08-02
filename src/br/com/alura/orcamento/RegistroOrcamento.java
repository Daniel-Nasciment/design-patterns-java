package br.com.alura.orcamento;

import java.util.Map;

public class RegistroOrcamento {

	private HttpAdapter http;

	public RegistroOrcamento(HttpAdapter http) {
		this.http = http;
	}

	// Depender sempre de abstra��es, e n�o de implementa��es espec�ficas.
	// Devemos sempre preferir depender de abstra��es, ou seja, interfaces ou
	// classes abstratas,
	// sempre que poss�vel, ao inv�s de implementa��es espec�ficas.
	public void registrar(Orcamento orcamento) {
		// chamada http api externa

		if(!orcamento.isFInalizado()) {
			throw new RuntimeException("Orcamento nao finalizado");
		}
		
		String url = "http://api.externa/orcamento";

		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidade()
				);
		
		
		http.post(url, dados);

	}

}
