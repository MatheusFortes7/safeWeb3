package com.safeweb;

import java.sql.*;


public class UsuariosDAO {
	private Connection conexao;
	
	public UsuariosDAO() {
		conexao = null;
	}
	
	public boolean conectar() {
		String driverName = "";                    
		String serverName = "";
		String mydatabase = "";
		int porta = 5432;
		String url = "jdbc:postgresql://" + serverName + ":" + porta + "/" + mydatabase;
		String username = "";
		String password = "";
		boolean status = false;

		try {
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			status = (conexao == null);
			System.out.println("Conex�o efetuada com o postgres!");
		} catch (ClassNotFoundException e) { 
			System.err.println("Conex�o N�O efetuada com o postgres -- Driver n�o encontrado -- " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Conex�o N�O efetuada com o postgres -- " + e.getMessage());
		}

		return status;
	}
	
	public boolean close() {
		boolean status = false;
		
		try {
			conexao.close();
			status = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return status;
	}
	
	public boolean inserirUsuario(Usuarios user) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO usuario (id, email, senha) "
					       + "VALUES ('" + user.getId()+ "', '" + user.getEmail() + "', '"  
					       + user.getSenha() +"');");
			
			
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean atualizarUsuario(Usuarios user) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			String sql = "UPDATE Usuarios SET Id = '" + user.getId() + "', email = '" + user.getEmail() 
					   + "', senha = '" + user.getSenha();
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean excluirUsuario(String username) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM Usuario WHERE username = " + username);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	
	public Usuarios[] getUsuarios() {
		Usuarios[] usuario = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM Usuario");		
	         if(rs.next()){
	             rs.last();
	             usuario = new Usuarios[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                usuario[i] = new Usuarios(rs.getInt("id"), rs.getString("email"), rs.getString("senha"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return usuario;
	}

	
	public Usuarios getUsuario(String username) {
		Usuarios[] usuarios = null;
		Usuarios usuario = new Usuarios();
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM Usuario WHERE Usuario.username LIKE " + username);		
	         if(rs.next()){
	             rs.last();
	             usuarios = new Usuarios[rs.getRow()];
	             rs.beforeFirst();

		         usuarios[0] = new Usuarios(rs.getInt("id"), rs.getString("email"), rs.getString("senha"));
		         usuario = usuarios[0];
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return usuario;
	}
}