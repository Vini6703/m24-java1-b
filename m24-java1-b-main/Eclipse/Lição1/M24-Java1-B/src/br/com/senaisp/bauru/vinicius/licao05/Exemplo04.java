package br.com.senaisp.bauru.vinicius.licao05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Exemplo04.class.getResourceAsStream("dados.cvs"));
		String linha = sc.nextLine(); //linha do cabeçalho
		Scanner scA = new Scanner(linha);
		scA.useDelimiter(";");//colocando como delimitardor o ;
		//usando o laço - impressão do cabeçalho
		while (scA.hasNext()) {
			System.out.print(scA.next() + "\t\t");
		}
		System.out.println();
		//fechando o scanner da linha
		scA.close();
		//percorrendo os itens do arquivo
		while (sc.hasNext()) {
			linha = sc.nextLine();
			scA = new Scanner(linha);
			scA.useDelimiter(";");
			while (scA.hasNext()) {
				System.out.print(scA.next()+"\t");
			}
			scA.close();
			System.out.println();
		}
		sc.close();//fechando o arquivo
	}

}
