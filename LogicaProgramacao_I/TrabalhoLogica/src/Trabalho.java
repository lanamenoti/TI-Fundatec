import java.util.Scanner;

public class Trabalho {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao = 0, quantAbaixoMedia = 0, quantAcimaMedia = 0;
		double media, maiorMedia = 0, menorMedia = 11, nota1, nota2, nota3, percAprovados = 0, percReprovados = 0;
		String nomeAluno = " ", nomeAlunoMaior = " ", nomeAlunoMenor = " ";

		while (opcao != 5) {
			
			media = -1;
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("1 - Cadastrar nova nota de aluno");
			System.out.println("2 - Ver a maior e menor media");
			System.out.println("3 - Ver a quantidade de alunos acima e abaixo da media");
			System.out.println("4 - Ver o percentual de alunos aprovados e reprovados");
			System.out.println("5 - Sair");
			System.out.println("-----------------------------------------------------------");
			
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do aluno:");
				nomeAluno = teclado.next();
				
				System.out.println("Informe a primeira nota:");
				nota1 = teclado.nextDouble();
				
				System.out.println("Informe a segunda nota:");
				nota2 = teclado.nextDouble();
				
				System.out.println("Informe a terceira nota:");
				nota3 = teclado.nextDouble();
				
				media = (nota1 + nota2 + nota3) / 3;
				
				break;
			case 2:
				System.out.printf("%s teve a maior média: %.2f\n",nomeAlunoMaior, maiorMedia);
				
				System.out.printf("%s teve a maior média: %.2f\n",nomeAlunoMenor, menorMedia);
				
				break;
			case 3:
				System.out.println("Quantidade de alunos abaixo da média: " + quantAbaixoMedia);
				
				System.out.println("Quantidade de alunos acima da média: " + quantAcimaMedia);
				
				break;
			case 4:
				System.out.printf("Percentual de alunos abaixo da média: %.2f%%\n", percReprovados);
				
				System.out.printf("Percentual de alunos acima da média: %.2f%%\n", percAprovados);
				
				break;

			default:
				break;
			}
			
			if (media > maiorMedia) {
				maiorMedia = media;
				nomeAlunoMaior = nomeAluno;
			}
			
			if (media < menorMedia) {
				if (media == -1) {
					continue;
				}
				menorMedia = media;
				nomeAlunoMenor = nomeAluno;
			}
			
			if (media >= 7) {
				quantAcimaMedia++;
			} 
			if (media >= 0 && media < 7) {
				quantAbaixoMedia++;
			}
			
			
			percAprovados = (quantAcimaMedia * 100) / (quantAbaixoMedia + quantAcimaMedia);
			percReprovados = (quantAbaixoMedia * 100) / (quantAbaixoMedia + quantAcimaMedia);
		}
	}
}
