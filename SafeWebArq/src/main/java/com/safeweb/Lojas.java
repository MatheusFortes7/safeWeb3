package com.safeweb;

public class Lojas {
	private String nome;
	private	float notaConsumidor;
	private int NumReclamacoes;
	private int NumReclamacoesResp;
	private float porcProblemasResol;
	
	public Lojas() {
		this.nome = "";
		this.notaConsumidor = 0;
		this.NumReclamacoes  = 0;
		this.NumReclamacoesResp = 0;
		this.porcProblemasResol = 0;
	}
	
	public Lojas(String nome, float notaConsumidor, int NumReclamacoes,int NumReclamacoesResp,float porcProblemasResol) {
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
	
	public float getNotaConsumidor() {
		return this.notaConsumidor;
	}
	public void setNotaConsumidor(float notaConsumidor) {
		this.notaConsumidor = notaConsumidor;
	}

    public int getNumReclamacoes() {
		return this.NumReclamacoes;
	}
	public void setNumReclamacoes(int numReclamacoes) {
		this.NumReclamacoes = numReclamacoes;
	}
	
	public int getNumReclamacoesResp() {
		return this.NumReclamacoesResp;
	}
	public void setNumReclamacoesResp(int numReclamacoesResp) {
		this.NumReclamacoesResp = numReclamacoesResp;
	}

    public float getPorcProblemasResolv() {
		return this.porcProblemasResol;
	}
	public void setPorcProblemasResolv(float porcProblemasResol) {
		this.porcProblemasResol = porcProblemasResol;
	}
}
