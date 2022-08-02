package br.com.alura.orcamento;

import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

	@Override
	public void post(String url, Map<String, Object> dados) {

		System.out.println("Chamando api externa");
		
	}

}
