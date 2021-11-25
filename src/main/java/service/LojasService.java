package service;

import java.io.IOException;
import com.google.gson.Gson;

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
		
		String nome = request.queryParams("nome");
		String notaConsumidor = request.queryParams("notaConsumidor");
		String NumReclamacoes = request.queryParams("NumReclamacoes");
		String NumReclamacoesResp = request.queryParams("NumReclamacoesResp");
		String porcProblemasResol = request.queryParams("porcProblemasResol");

		Lojas loja = new Lojas(nome,notaConsumidor,NumReclamacoes,NumReclamacoesResp,porcProblemasResol);
		//System.out.println(usuario.getUsername() + " " + usuario.getEmail() + " " + usuario.getSenha());
		
		LojasDAO.inserirLoja(loja);

		response.status(201); // 201 Created
		return nome;
	}

	public Object get(Request request, Response response) {
		//System.out.println(request.body());
		Gson gson = new Gson();
		Lojas user = gson.fromJson(request.body(), Lojas.class);
		
		Lojas loja = LojasDAO.getLoja(user.getNome());
		
		if (loja != null) {
            response.status(200);
            return "ok";
        } else {
            response.status(404); // 404 Not found
            return "Loja " + loja + " não encontrado.";
        }

	}

	public Object remove(Request request, Response response) {
        String nome = request.params(":nome");

            LojasDAO.excluirLoja(nome);

            response.status(200); // success
        	return nome;
	}

	public Object getAll(Request request, Response response) {
		StringBuffer returnValue = new StringBuffer("<usuarios type=\"array\">");
		for (Lojas loja: LojasDAO.getLojas()) {
			returnValue.append("\n<lojas>\n" + 
            		"\t<username>" + loja.getNome() + "</nome>\n" +
            		"\t<email>" + loja.getNotaConsumidor() + "</NotaConsumidor>\n" +
            		"\t<senha>" + loja.getNumReclamacoes() + "<NumReclamacoes>\n" +
            		"\t<senha>" + loja.getNumReclamacoesResp() + "<NumReclamacoesResp>\n" +
            		"\t<senha>" + loja.getPorcProblemasResolv() + "<PorcProblemasResolv>\n" +
            		"</lojas>\n");
		}
		returnValue.append("</usuarios>");
	    response.header("Content-Type", "application/xml");
	    response.header("Content-Encoding", "UTF-8");
		return returnValue.toString();
	}
}