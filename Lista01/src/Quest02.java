
public class Quest02 {

	public void DivisiveisPorQuatro() {
		System.out.println(
				"02- Fa�a um programa em java para exibir todos os n�meros inteiros divis�veis por 4, maiores ou iguais a 1050 e menores ou iguais a 2400");
		System.out.println("");

		for (int i = 1050; i <= 2400; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}

		}
	}
}
