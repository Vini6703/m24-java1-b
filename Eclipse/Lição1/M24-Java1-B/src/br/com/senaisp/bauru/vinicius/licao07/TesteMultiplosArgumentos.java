package br.com.senaisp.bauru.vinicius.licao07;

public class TesteMultiplosArgumentos {

	public static void main(String[] args) {
		System.out.println("Soma de 2 valores: ", + calcularSoma(10,20);
		System.out.println("Soma de 4 valores: ", + calcularSoma(10,20,30,40);
	}
	//Métods que soma valores
	public static int calcularSoma(int ...is itens) {
		int ret = 0;
		for (int vl : itens) {
			ret += vl;
		}
		return ret;
	}
	public static int calcularSomaX(double ...is itens) {
		int ret = 0;
		for (int vl : itens) {
			ret += vl;
		}
		System.out.println(abc);
		return ret;
	}
}
