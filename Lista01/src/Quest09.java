import java.util.Scanner;

public class Quest09 {
	
	public void numero(){
		/*Elabore um algoritmo que apresente os números pares maiores que 10 no
		 *  intervalo fechado[A, B]. Sendo que A e B serão números inteiros escolhidos
		 *   pelo usuário. Um número é par quando este satisfaz a seguinte condição:
		 *    (NÚMERO mod 2 = 0).*/
		Scanner s = new Scanner (System.in);
		int limiteInferior, limiteSuperior;
		
		
		System.out.println("Esse programa mostra os numeros pares maiores que dez");
		System.out.println("EM um intervalo definido por você.");
		
		System.out.print("O intervalo vai de :");limiteInferior = s.nextInt();
		System.out.print("Até:"); limiteSuperior = s.nextInt();
		if(limiteInferior < 10){
			limiteInferior = 10;
		}
		
		for (int i = limiteInferior; i < limiteSuperior; i++) {
			if (i % 2 == 0) {
				
				System.out.print("|"+i);
			}
			
			
		}
	}

}
