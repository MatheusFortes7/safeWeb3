package model;

public class Lojas {
	private String nome;
	private	String notaConsumidor;
	private String NumReclamacoes;
	private String NumReclamacoesResp;
	private String porcProblemasResol;
	
	public Lojas() {
		this.nome = "";
		this.notaConsumidor = "";
		this.NumReclamacoes  = "";
		this.NumReclamacoesResp = "";
		this.porcProblemasResol = "";
	}
	
	public Lojas(String nome, String notaConsumidor, String NumReclamacoes,String NumReclamacoesResp,String porcProblemasResol) {
		this.nome = nome;
		this.notaConsumidor = notaConsumidor;
		this.NumReclamacoes  = NumReclamacoes;
		this.NumReclamacoesResp = NumReclamacoes;
		this.porcProblemasResol = porcProblemasResol;
		
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public String getNotaConsumidor() {
		return this.notaConsumidor;
	}
	public void setNotaConsumidor(String notaConsumidor) {
		this.notaConsumidor = notaConsumidor;
	}

    public String getNumReclamacoes() {
		return this.NumReclamacoes;
	}
	public void setNumReclamacoes(String numReclamacoes) {
		this.NumReclamacoes = numReclamacoes;
	}
	
	public String getNumReclamacoesResp() {
		return this.NumReclamacoesResp;
	}
	public void setNumReclamacoesResp(String numReclamacoesResp) {
		this.NumReclamacoesResp = numReclamacoesResp;
	}

    public String getPorcProblemasResolv() {
		return this.porcProblemasResol;
	}
	public void setPorcProblemasResolv(String porcProblemasResol) {
		this.porcProblemasResol = porcProblemasResol;
	}
}
