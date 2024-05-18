package br.com.senaisp.bauru.vinicius.licao02;

public class EstudanteTester {

	public static void main(String[] args) {
		//Criando um estudante
		Estudante est01 = new Estudante();
		//Atribuindo a média
		est01.setNome("Vinicius");
		est01.setId(1);
		est01.setMedia(5.5f);
		//Mostrando valores
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento " + est01.getDocumento());
		//Obtendo o objeto como representação textual
		System.out.println(est01.toString());
		//Criando um novo Estudante
		Estudante est02 = new Estudante(2, "Cinthia", "12345678900", 9.6f, 1600.00, true);
		//mostrando o estudante
		System.out.println(est02.toString());

	}

}
