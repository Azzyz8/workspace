import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int opcaoSwitch;
		int opcaoDo;
		Scanner s = new Scanner(System.in);

		do {

			System.out.println("|------------------------------------------------|");
			System.out.println("|                 MENU DE SELEÇÃO                |");
			System.out.println("|                                                |");
			System.out.println("| Informe o número da questão a ser visualizada: |");
			System.out.println("| Utilize: 1, 2, 3, 13                           |");
			System.out.println("| Não utilize: 01, 02, 03                        |");
			System.out.println("|________________________________________________|");
			System.out.print("|Questão: ");
			// colocar aqui um barramento caso alguém escreva outra coisa que
			// não seja os numeros de 1 a 14
			opcaoSwitch = s.nextInt();

			switch (opcaoSwitch) {

			case 1:

				Quest01 imparesResult = new Quest01();
				imparesResult.impares();

				break;

			case 2:
				Quest02 result = new Quest02();
				result.DivisiveisPorQuatro();

				break;

			case 3:

				Quest03 result3 = new Quest03();
				result3.analisaValor();

				break;

			case 4:
				
				Quest04 result4 = new Quest04();
				result4.tabuada();
				
				break;

			case 5:
				
				Quest05 result5 = new Quest05();
				result5.tabuada();

				break;

			case 6:

				Quest06 result6 = new Quest06();
				result6.tabuadas();

				break;

			case 7:

				Quest07 result7 = new Quest07();

				result7.resultadosEscolares();

				break;

			case 8:
				Quest08 result8 = new Quest08();

				result8.eleicoes();
				break;

			case 9:
				
				Quest09 result9 = new Quest09();
				result9.numero();

				break;

			case 10:
				
				Quest10 result10 = new Quest10();
				result10.matriz();

				break;
				
			case 11:
				Quest11 result11 = new Quest11();
				
				result11.jogoVelha();
				break;

			default:
				System.out.println("Escolha uma opção válida entre 1 e 14");
			}

			System.out.println("Tecle 1 para continuar.");
			System.out.println("0 para encerrar o programa:");
			opcaoDo = s.nextInt();
			while (opcaoDo < 0 || opcaoDo > 1) {
				System.out.println("Informe um valor válido");
				System.out.println("Tecle 1 para ver o menu novamente.");
				System.out.println("0 para encerrar o programa:");
				opcaoDo = s.nextInt();

			}

		} while (opcaoDo != 0);
		System.out.println("FIM");
	}
}
