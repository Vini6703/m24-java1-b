package br.com.senaisp.bauru.vinicius.licao03;

public class Exemplo03 {

	public static void main(String[] args) {
		//Strings
		String nome1 = "Richard";
		String nome2 = "Richard";
		//Solicitando os nomes
		System.out.println("Digite o Nome: ");
		nome2 = nome1 + "";
		//comparando eendereços de memória quando é objeto
		if (nome1 == nome2) {
			System.out.println("São iguais");
		}

	}

}
