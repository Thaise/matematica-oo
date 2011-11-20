package br.com.xti.poo;

public class Matematica {
	/**calcula raiz quadrada de um n�mero com a equa��o de Pell*/
	int raizQuadrada(int num){
		int impar = 1;
		int raiz = 0;//a cada subtra��o realizada, at� a condi��o num > = impar, haver� um incremento, 
					//a vari�vel que receber� essa quantidade de subtra��es ser� a raiz, ou seja:
					//raiz  = quantidade de subtra��es enquanto num >= impar
		
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
	
	double somaValores(double...numeros){/*cria��o de uma lista de argumentos. � totalmente din�mico. Serve para que o usu�rio possa somar quantos n�meros quiser.
	seria a mesma coida que double[] numeros, ou seja, um array.A diferen�a est� na chamada do m�todo, que, se fosse um array precidaria que fosse construido um array,
	para depois utilizar dentro do m�todo soma, nos par�metros. Obs.: Podemos somente TERMINAR os par�metros do m�todo com argumentos. Antes dele, podem vir outros, mas depois n�o!
	Tamb�m N�O � poss�vel colocar dois argumentos ou + dentro dos par�metros*/
		double total = 0;	
		for(double n:numeros){//foreach
			total += n;
		}
		return total;
	}
	
	//vemos a seguir que dois m�todos podem ter um mesmo nome, 
	//desde que suas assinaturas sejam diferentes(par�metros diferentes)
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
		//como j� criamos um m�todo para somar doversos n�meros, � s� cham�-lo e dividir pela quant. de n�meros
	}
	
	double media(String x, String y){
		System.out.print("Assinatura do m�todo = media(String x, String y)");
		int media = (Integer.parseInt(x) + Integer.parseInt (y)) / 2;
		return media;
	}
}
