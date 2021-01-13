import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nomeAluno, nomeMaiorMedia = " ", nomeMenorMedia = " ";
		double nota1, nota2, nota3, mediaAluno, mediaTurma, somaMedias = 0, quantAlunos = 0, maiorMedia = 0, menorMedia = 101;
		char desejaSair = ' ';
		
		while (desejaSair != 'S') {
			System.out.println("Digite o nome do aluno:");
			nomeAluno = teclado.next();
			
			System.out.println("Digite a primeira nota:");
			nota1 = teclado.nextDouble();
			
			System.out.println("Digite a segunda nota:");
			nota2 = teclado.nextDouble();
			
			System.out.println("Digite a terceira nota:");
			nota3 = teclado.nextDouble();
			
			mediaAluno = (nota1 + nota2 + nota3) / 3;
			somaMedias += mediaAluno;
			quantAlunos++;
			
			if (mediaAluno > maiorMedia) {
				maiorMedia = mediaAluno;
				nomeMaiorMedia = nomeAluno;
			}
			
			if (mediaAluno < menorMedia) {
				menorMedia = mediaAluno;
				nomeMenorMedia = nomeAluno;
			}
		
			System.out.println("Deseja sair (S ou N)?");
			desejaSair = teclado.next().charAt(0);
		}
		
		mediaTurma = somaMedias / quantAlunos;
		
		System.out.printf("O aluno de maior média foi %s e seu média foi %.2f\n", nomeMaiorMedia, maiorMedia);
		System.out.printf("O aluno de menor média foi %s e seu média foi %.2f\n", nomeMenorMedia, menorMedia);
		System.out.println("A média aristmética da turma é: " + mediaTurma);
		
	}

}
