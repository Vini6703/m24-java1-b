package br.com.senaisp.bauru.vinicius.licao05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma data no" + "formato dd/mm/aaaa:");
		//sc.useDelimiter("/");
		String linha = sc.nextLine();
		Scanner scA = new Scanner(linha);
		int dia = scA.nextInt();
		int mes = scA.nextInt();
		int ano = scA.nextInt();
		boolean  valido = true;
		//vamos aos testes
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(dia<1 || dia>31) {
				valido = false;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(dia<1 || dia>30) {
				valido = false;
			}
			break;
		case 2:
			if(dia<1 || dia>28) {
				valido = false;
				//condiçoes para ano bisexto:
				//ano deve ser divisivel por 4, exceto
				//Não pode ser divisivel por 100, exeto
				//Divisivel por 400
			} else if (dia == 29 && ano % 4 != 0) {
				valido = false;
			} else if (dia == 29 && ano % 4 == 0 && ano % 100 == 0 && ano % 400 != 0) {
				valido = false;
			}
			break;
			default:
				System.out.println("Mês inválido");
				valido = false;
		}//Fim do switch
		if (valido) {
			System.out.println("Data é válida!");
		}else {
			System.out.println("Data é invalida!");
		}
		sc.close();
	}

}
