package service;

import com.google.gson.Gson;

import dao.UsuariosDAO;
import model.Usuarios;

import spark.Request;
import spark.Response;

public class UsuariosService {

	private UsuariosDAO UsuariosDAO;

	public UsuariosService() {
		UsuariosDAO = new UsuariosDAO();
		UsuariosDAO.conectar();
	} 

	public Object add(Request request, Response response) {
		String id = request.queryParams("id");
		String email = request.queryParams("email");
		String senha = request.queryParams("senha");

		Usuarios usuario = new Usuarios(id, senha, email);
		//System.out.println(usuario.getUsername() + " " + usuario.getEmail() + " " + usuario.getSenha());
		
		UsuariosDAO.inserirUsuario(usuario);

		response.status(201); // 201 Created
		return email;
	}

	public Object get(Request request, Response response) {
		Gson gson = new Gson();
		Usuarios user = gson.fromJson(request.body(), Usuarios.class);
		
		Usuarios usuario = UsuariosDAO.getUsuario(user.getEmail());
		
		if (usuario != null) {
            response.status(200);
            return "ok";
        } else {
            response.status(404); // 404 Not found
            return "Usuário " + usuario + " não encontrado.";
        }

	}

	public Object remove(Request request, Response response) {
        String username = request.params(":username");

            UsuariosDAO.excluirUsuario(username);

            response.status(200); // success
        	return username;
	}

	public Object getAll(Request request, Response response) {
		StringBuffer returnValue = new StringBuffer("<usuarios type=\"array\">");
		for (Usuarios usuario : UsuariosDAO.getUsuarios()) {
			returnValue.append("\n<usuario>\n" + 
            		"\t<username>" + usuario.getId() + "</id>\n" +
            		"\t<email>" + usuario.getEmail() + "</email>\n" +
            		"\t<senha>" + usuario.getSenha() + "</senha>\n" +
            		"</usuario>\n");
		}
		returnValue.append("</usuarios>");
	    response.header("Content-Type", "application/xml");
	    response.header("Content-Encoding", "UTF-8");
		return returnValue.toString();
	}
}