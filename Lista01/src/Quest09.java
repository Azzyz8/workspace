import java.util.Scanner;

public class Quest09 {
	
	public void numero(){
		/*Elabore um algoritmo que apresente os n�meros pares maiores que 10 no
		 *  intervalo fechado[A, B]. Sendo que A e B ser�o n�meros inteiros escolhidos
		 *   pelo usu�rio. Um n�mero � par quando este satisfaz a seguinte condi��o:
		 *    (N�MERO mod 2 = 0).*/
		Scanner s = new Scanner (System.in);
		int limiteInferior, limiteSuperior;
		
		
		System.out.println("Esse programa mostra os numeros pares maiores que dez");
		System.out.println("EM um intervalo definido por voc�.");
		
		System.out.print("O intervalo vai de :");limiteInferior = s.nextInt();
		System.out.print("At�:"); limiteSuperior = s.nextInt();
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
