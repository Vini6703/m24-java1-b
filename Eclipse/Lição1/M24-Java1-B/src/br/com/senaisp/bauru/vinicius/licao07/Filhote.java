package br.com.senaisp.bauru.vinicius.licao07;
/*
 * Utilização de campo estatico em uma classe
 */
public class Filhote {
	private static int nSeq = 0;
	private int id;
	private String nome;
	//Constructors
	public Filhote(String nome) {
		id = ++nSeq;
		this.nome = nome;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	
}
