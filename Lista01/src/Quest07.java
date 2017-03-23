import java.util.Scanner;

public class Quest07 {

	public void resultadosEscolares() {
		System.out.println("A nota de um aluno em uma disciplina é a média aritmética das notas \n de suas duas avaliações parciais. Se a média do aluno for maior ou igual a sete, o aluno \n está aprovado. Se a média do aluno for menor que três, o aluno está reprovado.\n Se a média do aluno for menor que sete e maior ou igual a três, o aluno irá para a recuperação.\n Faça um programa em Java para ler as notas das duas avaliações parciais e calcular a média dos alunos  de  uma  determinada  disciplina   e   informar   a   situação   final  de   cada   aluno. \n Para   cada   aluno,  o programa deverá exibir a seguinte frase: “O aluno obteve média _________ e está _____________.” OBS: A turma possui trinta alunos.");
		String situacao = null;
		Scanner s = new Scanner(System.in);

		String nome[] = new String[2];
		float nota1[] = new float[2];
		float nota2[] = new float[2];
		float media[] = new float[2];

		for (int indice = 0; indice < nome.length; indice++) {
			System.out.println("Informe o nome do " + (indice + 1) + "º Aluno: ");
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
				situacao = "em recuperação.";

			}

			System.out.println("O aluno" + nome[i] + " obteve média: " + media[i] + " e está " + situacao + "");
		}
	}

}
