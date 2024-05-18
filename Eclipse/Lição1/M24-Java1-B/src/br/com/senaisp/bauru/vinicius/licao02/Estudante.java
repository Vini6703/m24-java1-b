package br.com.senaisp.bauru.vinicius.licao02;

public class Estudante {
	//Campos ou Fields ou Variaveis de instancia
	private int id;
	private String nome;
	private String documento;
	private float media;
	private boolean fumante;
	private double bolsaEstudo;
	//Constructers
	//Constructor padrão sem parametros
	public Estudante() {
		id = 0;
		nome = "Sem nome";
		documento = "Sem documento";
		media = 0;
		fumante = false;
		bolsaEstudo = 0.0;
		
	}
	//Constructor personalizado
	public Estudante(int id, String nome, String documento, 
					float media, double bolsa, boolean fum) {
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.media = media;
		setBolsaEstudo = bolsa;
		setFumante = fum;
	}
	//Gettes e setters
	public int getId() {
		return id;
	}
	//Metodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public boolean isFumante() {
		return fumante;
	}
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	public double getBolsaEstudo() {
		return bolsaEstudo;
	}
	public void setBolsaEstudo(double bolsaEstudo) {
		this.bolsaEstudo = bolsaEstudo;
	}
	//Metodos
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome()+"\n"
						+ "Documento: " + getDocumento()+"\n"
						+ "Média: "+ getMedia() + "Bolsa Estudos: " 
						+ getBolsaEstudo() + "\n" 
						+ "Fumante :" + isFumante();
	}
}
