import java.util.Scanner;

public class Quest08 {

	public void eleicoes() {

		String variante = null;
		int idade[] = new int[100];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < idade.length; i++) {

			System.out.print("Qual a idade da pessoa :");
			idade[i] = s.nextInt();
			
		if(idade[i] > 18 && idade[i] < 90){
			System.out.println("Essa pessoa tem "+(idade[i])+" anos e pode votar.");
		}else{
			System.out.println("Essa pessoa tem "+(idade[i])+" anos e não pode votar.");	
		}
		}
	}

}
