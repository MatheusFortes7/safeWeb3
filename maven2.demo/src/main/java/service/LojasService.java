package service;

import dao.LojasDAO;
import model.Lojas;
import spark.Request;
import spark.Response;


public class LojasService {

	private LojasDAO LojasDAO;

	public LojasService() {
		LojasDAO = new LojasDAO();
		LojasDAO.conectar();
	}

	public Object add(Request request, Response response) {
		String nome = request.queryParams("descricao");
		String notaConsumidor = (request.queryParams("preco"));
		String NumReclamacoes = (request.queryParams("quantidade"));
		String NumReclamacoesResp = (request.queryParams("dataFabricacao"));
		String porcProblemasResol = (request.queryParams("dataValidade"));

		Lojas loja = new Lojas(nome, notaConsumidor, NumReclamacoes, NumReclamacoesResp, porcProblemasResol);

		LojasDAO.inserirLoja(loja);

		response.status(201); // 201 Created
		return nome;
	}

	/*public Object get(Request request, Response response) {
		String nome = request.params(":nome");
		
		Lojas loja = (Lojas) LojasDAO.getLoja(nome);
		
		if (loja != null) {
    	    response.header("Content-Type", "application/xml");
    	    response.header("Content-Encoding", "UTF-8");

            return "<produto>\n" + 
            		"\t<id>" + loja.getNome() + "</id>\n" +
            		"\t<descricao>" + loja.getNotaConsumidor() + "</descricao>\n" +
            		"\t<preco>" + loja.getNumReclamacoes() + "</preco>\n" +
            		"\t<quantidade>" + loja.getNumReclamacoesResp() + "</quantidade>\n" +
            		"\t<fabricacao>" + loja.getPorcProblemasResolv() + "</fabricacao>\n" +
            		"</produto>\n";
        } else {
            response.status(404); // 404 Not found
            return "Produto " + nome + " não encontrado.";
        }

	}

	public Object update(Request request, Response response) {
        String nome = request.params(":nome");
        
		Lojas produto = (Lojas) LojasDAO.get(nome);

        if (produto != null) {
        	produto.setNome(request.queryParams("descricao"));
        	produto.setNotaConsumidor((request.queryParams("preco")));
        	produto.setNumReclamacoes((request.queryParams("quantidade")));
        	produto.setNumReclamacoesResp((request.queryParams("dataFabricacao")));
        	produto.setPorcProblemasResolv((request.queryParams("dataValidade")));

        	LojasDAO.atualizarLoja(produto);
        	
            return nome;
        } else {
            response.status(404); // 404 Not found
            return "Produto não encontrado.";
        }

	}

	public Object remove(Request request, Response response) {
        String nome = request.params(":nome");

        Lojas produto = (Lojas) LojasDAO.get(nome);

        if (produto != null) {

            LojasDAO.excluirLoja(produto.getNome());

            response.status(200); // success
        	return nome;
        } else {
            response.status(404); // 404 Not found
            return "Produto não encontrado.";
        }
	}*/

	public Object getAll(Request request, Response response) {
		StringBuffer returnValue = new StringBuffer("<usuarios type=\"array\">");
		
		for (Lojas usuario : LojasDAO.getLojas()) {
			returnValue.append("\n<usuario>\n" + 
            		"\t<username>" + usuario.getNome() + "</username>\n" +
            		"\t<email>" + usuario.getNome() + "</email>\n" +
            		"\t<senha>" + usuario.getNome() + "</senha>\n" +
            		"</usuario>\n");
		}
		returnValue.append("</usuarios>");
	    response.header("Content-Type", "application/xml");
	    response.header("Content-Encoding", "UTF-8");
		return returnValue.toString();
	}
}