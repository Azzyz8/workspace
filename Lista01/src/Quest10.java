import java.util.Scanner;

public class Quest10 {

	public static void matriz() {

		int menorValor = Integer.MAX_VALUE, maiorValor = Integer.MIN_VALUE;

		Scanner s = new Scanner(System.in);
		int matriz[][] = new int[4][4];

		System.out.println("Vamos preencher o Array:");
		System.out.println("Informe apenas valores de 0 à 9.");
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Informe o valor da coluna " + i + ", linha " + j);
				matriz[i][j] = s.nextInt();

				if (matriz[i][j] < 0 || matriz[i][j] > 9) {
					System.out.println("No valor informado não é valido.");
					System.out.println("INFORME APENAS NÚMEROS ENTRE 0 E 9");

					do {
						System.out.println("Informe o valor da coluna " + i + ", linha " + j);
						matriz[i][j] = s.nextInt();
					} while (matriz[i][j] < 0 || matriz[i][j] > 9);
				}

			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz.length; k++) {
				System.out.print(matriz[k][i] + "\t");

			}
			System.out.println("");
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < menorValor)
					menorValor = matriz[i][j];
				else if (matriz[i][j] > maiorValor)
					maiorValor = matriz[i][j];
			}
		}

		System.out.println("O menor valor da matriz é " + menorValor);
		System.out.println("O maior valor da matriz é " + maiorValor);
	}
}
