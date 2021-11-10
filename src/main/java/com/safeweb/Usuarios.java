package com.safeweb;

public class Usuarios {
	private int id;
	private String email;
	private String senha;
	
	public Usuarios() {
		this.id = 0;
		this.email = "";
		this.senha  = "";
	}
	
	public Usuarios(int id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha  = senha;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
