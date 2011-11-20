package br.com.xti.poo;

public class Matematica {
	/**calcula raiz quadrada de um n�mero com a equa��o de Pell*/
	int raizQuadrada(int num){
		int impar = 1;
		int raiz = 0;
		
		while(num >= impar){
			num -= impar;
			raiz++;
			impar += 2;
		}
		
		return raiz;
	}
	
	int retornaMaior(int num1, int num2){
		int numeroMaior;
		
		if(num1 > num2){
			numeroMaior = num1;
		}else{
			numeroMaior = num2;
		}
		
		return numeroMaior;
	}
	
	double somaValores(double...numeros){
		double total = 0;	
		for(double n:numeros){
			total += n;
		}
		return total;
	}
	
	double media(int x, int y){
		System.out.print("Assinatura do m�todo = media(int x, int y)");
		int media = (x + y) / 2;
		return media;
	}
	
	double media(int x){
		System.out.print("Assinatura do m�todo = media(int x)");
		return x;
	}
	
	double media(double...numeros){
		System.out.print("Assinatura do m�todo = media(int...numeros)");
		return this.somaValores(numeros) / numeros.length;
	}
	
	double media(String x, String y){
		System.out.print("Assinatura do m�todo = media(String x, String y)");
		int media = (Integer.parseInt(x) + Integer.parseInt (y)) / 2;
		return media;
	}
}
