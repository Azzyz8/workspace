import java.util.Scanner;

public class Quest03 {
	public void analisaValor(){
		Scanner s = new Scanner(System.in);
		double numero = 0;
		
		
		System.out.println("3- Escreva um programa em java que solicite um n�meroao usu�rio "
				+ "at� que o valor figitado estaeja entre 1 e 100.");
		System.out.println("Informe um n�mero entre 1 e 100");
		numero = s.nextDouble();
		
		if(numero < 1 || numero > 100){
			while(numero < 1 || numero > 100){
				System.out.println("informe um n�mero valido entre 1 e 100");
				numero = s.nextDouble();
			}
			
		}
		System.out.println("Valor digitado correto com o solicitado");
		System.out.println("N�MERO: "+numero);
		
	}
}
