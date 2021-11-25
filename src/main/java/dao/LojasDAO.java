package dao;

import java.sql.*;
import model.Lojas;

public class LojasDAO {
private Connection conexao;
	
	public LojasDAO() {
		conexao = null;
	}
	
	public boolean conectar() {
		String driverName = "org.postgresql.Driver";                    
		String serverName = "safeweb.postgres.database.azure.com";
		String mydatabase = "safeweb";
		int porta = 5432;
		String url = "jdbc:postgresql://" + serverName + ":" + porta +"/" + mydatabase;
		String username = "safewebadm@safeweb";
		String password = "@Safeweb";
		boolean status = false;

		try {
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			status = (conexao == null);
			System.out.println("Conexão efetuada com o postgres!");
		} catch (ClassNotFoundException e) { 
			System.err.println("Conexão NãO efetuada com o postgres -- Driver não encontrado -- " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Conexão NãO efetuada com o postgres -- " + e.getMessage());
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
	
	public boolean inserirLoja(Lojas loja) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO lojas (nome,notaConsumidor ,NumReclamacoes , NumReclamacoesResp , porcProblemasResol)"
					       + "VALUES ("+loja.getNome()+ ", '" + loja.getNotaConsumidor() + "', '"  
					       + loja.getNumReclamacoes() + "', '" + loja.getNumReclamacoesResp() + "', ' " + loja.getPorcProblemasResolv() + "');");
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean atualizarLoja(Lojas loja) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			String sql = "UPDATE lojas SET Porcentagem de problemas resolvidos = '" + loja.getPorcProblemasResolv() + "', Nota connsumidor = '"  
				       + loja.getNotaConsumidor() + "', Numero de reclamações = '" +  loja.getNumReclamacoes() + "', Numero de reclamações respondidas  = '" + loja.getNumReclamacoesResp() + "'"
					   + " WHERE nome = " + loja.getNome();
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean excluirLoja(String nome) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM lojas WHERE nome= " + nome);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public void getLoja(String nome) {
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("SELECT FROM lojas WHERE nome= " + nome);
			st.close();
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		
		
	}
	
	public Lojas[] getLojas() {
		Lojas[] loja = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM lojas");		
	         if(rs.next()){
	             rs.last();
	             loja = new Lojas[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                loja[i] = new Lojas(rs.getString("nome"), rs.getString("notaConsumidor"), 
	                		                  rs.getString("NumReclamacoes"), rs.getString("NumReclamacoesResp"), rs.getString("porcProblemasResolv"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return loja;
	}

}
