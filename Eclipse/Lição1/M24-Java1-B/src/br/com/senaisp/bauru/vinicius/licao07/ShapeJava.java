package br.com.senaisp.bauru.vinicius.licao07;

public class ShapeJava {
	protected double altura;
	private double largura;
	String cor;//default
	//Constructor
	public ShapeJava(double alt, double larg) {
		altura = alt;
		largura = larg;
	}
	//Getters e Setters
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	//Classe dentro de outra classe
	public class apoio {
		public void chamarApoio() {
			ShapeJava sp2 = new ShapeJava(2,2);
			sp2.altura = 10;
		}
	}
	//Metodo estático de criação do objeto
	public static ShapeJava getInstancia(double v1, double v2) {
		ShapeJava ret = new ShapeJava(v1, v2);
		ret.altura = 15;
		return ret;
	}
}
