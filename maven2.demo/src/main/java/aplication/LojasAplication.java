package aplication;

import static spark.Spark.*;

import service.LojasService;

public class LojasAplication {
	
	private static LojasService produtoService = new LojasService();
	
    public static void main(String[] args) {
    	
    	staticFiles.location("/public");

        post("/produto", (request, response) -> produtoService.add(request, response));

        //get("/produto/:id", (request, response) -> produtoService.get(request, response));

        //get("/produto/update/:id", (request, response) -> produtoService.update(request, response));

        //get("/produto/delete/:id", (request, response) -> produtoService.remove(request, response));

        get("/produto", (request, response) -> produtoService.getAll(request, response));
               
    }
}