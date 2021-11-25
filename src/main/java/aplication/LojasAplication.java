package aplication;

import static spark.Spark.*;
import service.LojasService;

public class LojasAplication{
	
	private static LojasService lojasService = new LojasService();
	
	public static void main(String[] args) throws Exception{
		
		staticFiles.location("/public");
		
		post("/lojas", (request, response) -> lojasService.add(request, response));
		
		post("/lojas/:nome",  "application/json", (request, response) -> lojasService.get(request, response));

		//get("/lojas/update/:nome", (request, response) -> usuarioService.update(request, response));
		
		get("/lojas/remove/:nome", (request, response) -> lojasService.remove(request, response));

		get("/lojas", (request, response) -> lojasService.getAll(request, response));
	}
}
