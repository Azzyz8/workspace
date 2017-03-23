import java.util.Scanner;

public class Quest07 {

	public void resultadosEscolares() {
		System.out.println("A nota de um aluno em uma disciplina � a m�dia aritm�tica das notas \n de suas duas avalia��es parciais. Se a m�dia do aluno for maior ou igual a sete, o aluno \n est� aprovado. Se a m�dia do aluno for menor que tr�s, o aluno est� reprovado.\n Se a m�dia do aluno for menor que sete e maior ou igual a tr�s, o aluno ir� para a recupera��o.\n Fa�a um programa em Java para ler as notas das duas avalia��es parciais e calcular a m�dia dos alunos  de  uma  determinada  disciplina   e   informar   a   situa��o   final  de   cada   aluno. \n Para   cada   aluno,  o programa dever� exibir a seguinte frase: �O aluno obteve m�dia _________ e est� _____________.� OBS: A turma possui trinta alunos.");
		String situacao = null;
		Scanner s = new Scanner(System.in);

		String nome[] = new String[2];
		float nota1[] = new float[2];
		float nota2[] = new float[2];
		float media[] = new float[2];

		for (int indice = 0; indice < nome.length; indice++) {
			System.out.println("Informe o nome do " + (indice + 1) + "� Aluno: ");
			nome[indice] = s.nextLine();
			System.out.print("Informe a nota da primeira prova do aluno:");
			nota1[indice] = s.nextFloat();
			System.out.print("Informe a nota da primeira prova do aluno:");
			nota2[indice] = s.nextFloat();
			System.out.println("===========================================");
			media[indice] = (nota1[indice] + nota2[indice]) / 2;
			s = new Scanner(System.in);
		}

		for (int i = 0; i < nome.length; i++) {

			if (media[i] >= 7) {
				situacao = "aprovado.";
			} else if (media[i] < 7 || media[i] == 3) {
				situacao = "em recupera��o.";

			}

			System.out.println("O aluno" + nome[i] + " obteve m�dia: " + media[i] + " e est� " + situacao + "");
		}
	}

}
