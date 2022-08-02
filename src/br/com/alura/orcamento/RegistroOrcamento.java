package br.com.alura.orcamento;

import java.util.Map;

public class RegistroOrcamento {

	private HttpAdapter http;

	public RegistroOrcamento(HttpAdapter http) {
		this.http = http;
	}

	// Depender sempre de abstrações, e não de implementações específicas.
	// Devemos sempre preferir depender de abstrações, ou seja, interfaces ou
	// classes abstratas,
	// sempre que possível, ao invés de implementações específicas.
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
