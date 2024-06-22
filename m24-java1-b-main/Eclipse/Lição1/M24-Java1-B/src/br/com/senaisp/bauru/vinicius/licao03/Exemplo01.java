package br.com.senaisp.bauru.vinicius.licao03;

public class Exemplo01 {

	public static void main(String[] args) {
		byte vByte = 127;
		vByte++; //aqui ocorre o estouro do limite do byte
		System.out.println(vByte); //amostra o limite inferior
		float vFloat = 6_000.00f; //necessario colocar F para dizer que é float
		//Variavel declarada
		if (vByte == -128) {
			String nome = "Vinicius";
			System.out.println("Meu nome é " + nome);
		}
		//Aqui não existe variavel nome
		System.out.println(nome); 
	}

}
