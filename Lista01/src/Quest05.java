import java.util.Scanner;

public class Quest05 {
 public void tabuada(){
	 
	 int numero;
	 Scanner s = new Scanner(System.in);
	 
	 System.out.println("5- reescreva o programa anterior de modo a apresentar a tabuada de qualquer número introduzido pelo usuário.");
		System.out.println("");
		System.out.println("Informe o número da tabuada:");
		numero = s.nextInt();
		for (int i = 0; i <= 10; i++) {

			System.out.println(numero + "X" + i + "=" + (numero * i));

		}
 }
}
