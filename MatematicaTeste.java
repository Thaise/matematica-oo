package br.com.xti.poo;

public class MatematicaTeste {

	/**
	 * testa a classe Matemática
	 */
	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		int maiorPar = m.retornaMaior(2,4);
		int maiorImpar = m.retornaMaior(3,5);
		System.out.println("Total maior ímpar + maior par = "+m.somaValores(maiorPar,maiorImpar));
		System.out.println("Total = "+m.somaValores(1,2,3,4,5,6,7,8));
		//pela forma de passar os parâmetros a JVM sabe qual método executar
		//isso (criar vários métodos com o mesmo nome e parâmetros diferentes) 
		//chama-se SOBRECARGA DE MÉTODOS
		System.out.println(" = "+m.media(5,3));
		System.out.println(" = "+m.media(5,3,4,5,2,1));
		System.out.println(" = "+m.media(5));
		System.out.println(" = "+m.media("10","2"));
		
		System.out.println("Raiz = "+m.raizQuadrada(256));

	}

}
