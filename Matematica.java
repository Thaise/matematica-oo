package br.com.xti.poo;

public class Matematica {
	/**calcula raiz quadrada de um número com a equação de Pell*/
	int raizQuadrada(int num){
		int impar = 1;
		int raiz = 0;//a cada subtração realizada, até a condição num > = impar, haverá um incremento, 
					//a variável que receberá essa quantidade de subtrações será a raiz, ou seja:
					//raiz  = quantidade de subtrações enquanto num >= impar
		
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
	
	double somaValores(double...numeros){/*criação de uma lista de argumentos. É totalmente dinâmico. Serve para que o usuário possa somar quantos números quiser.
	seria a mesma coida que double[] numeros, ou seja, um array.A diferença está na chamada do método, que, se fosse um array precidaria que fosse construido um array,
	para depois utilizar dentro do método soma, nos parâmetros. Obs.: Podemos somente TERMINAR os parâmetros do método com argumentos. Antes dele, podem vir outros, mas depois não!
	Também NÃO é possível colocar dois argumentos ou + dentro dos parâmetros*/
		double total = 0;	
		for(double n:numeros){//foreach
			total += n;
		}
		return total;
	}
	
	//vemos a seguir que dois métodos podem ter um mesmo nome, 
	//desde que suas assinaturas sejam diferentes(parâmetros diferentes)
	double media(int x, int y){
		System.out.print("Assinatura do método = media(int x, int y)");
		int media = (x + y) / 2;
		return media;
	}
	
	double media(int x){
		System.out.print("Assinatura do método = media(int x)");
		return x;
	}
	
	double media(double...numeros){
		System.out.print("Assinatura do método = media(int...numeros)");
		return this.somaValores(numeros) / numeros.length;
		//como já criamos um método para somar doversos números, é só chamá-lo e dividir pela quant. de números
	}
	
	double media(String x, String y){
		System.out.print("Assinatura do método = media(String x, String y)");
		int media = (Integer.parseInt(x) + Integer.parseInt (y)) / 2;
		return media;
	}
}
