package br.com.senaisp.bauru.vinicius.licao07;

public class Gato extends Mamifero {
	private boolean quadrupede;
	//Constructors
	public Gato(String nome) {
		setNome(nome);
	}
	public Gato(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
	}
	public Gato() {
		setIdade(0);
		setNome("Gato sem nome");
		setCor("Gato sem cor");
	}
	//Getters e Setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Métodos
	@Override
	public void falar() {
		System.out.println("Miau Miau");
	}
}
