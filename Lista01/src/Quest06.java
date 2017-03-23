
public class Quest06 {

	public void tabuadas() {
		System.out.println("6- Faça um programa em java para escrever o conjunto das cinco primeiras tabuadas(tabuada do 1, tabuada d3,...., tabuada do 5) parando a tela depois de cad auma ser escrita ");
		System.out.println("");

		for (int i = 0; i <= 10; i++) {
			System.out.println("===================================");
			for (int j = 0; j <= 10; j++) {

				System.out.println(i + "X" + j + "=" + (i * j));

			}
		}
	}

}
