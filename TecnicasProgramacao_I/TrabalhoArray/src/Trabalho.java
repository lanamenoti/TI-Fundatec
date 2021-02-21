import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 0;
		int quantidadeAlunosTurma = 3, quantidadeAlunosCadastrados = 0;
		String alunos[] = new String[quantidadeAlunosTurma];
		double nota1[] = new double[quantidadeAlunosTurma];
		double nota2[] = new double[quantidadeAlunosTurma];
		double nota3[] = new double[quantidadeAlunosTurma];
		double mediaFinalAluno[] = new double[quantidadeAlunosTurma];
		double somaMediaAlunos = 0, mediaTurma = 0;
		int posicaoAtual = 0;
		
		while(opcao != 7) {
			
			System.out.println(" ");
			System.out.println("1 - Cadastrar aluno informando nome e média final");
			System.out.println("2 - Exibir alunos cadastrados");
			System.out.println("3 - Exibir a média da turma");
			System.out.println("4 - Exibir alunos aprovados");
			System.out.println("5 - Exibir alunos reprovados");
			System.out.println("6 - Exibir os alunos acima da média da turma");
			System.out.println("7 - Sair");
			System.out.println(" ");
			
			opcao = teclado.nextInt();
			
			if( opcao == 1) {
				if (posicaoAtual == quantidadeAlunosTurma) {
					System.out.println("A turma ja possui a capacidade máxima");
				} else {
					System.out.println("Informe o nome do aluno");
					alunos[posicaoAtual] = teclado.next();
					
					System.out.println("Informe a nota 1 do aluno");
					nota1[posicaoAtual] = teclado.nextDouble();
					
					System.out.println("Informe a nota 2 do aluno");
					nota2[posicaoAtual] = teclado.nextDouble();
					
					System.out.println("Informe a nota 3 do aluno");
					nota3[posicaoAtual] = teclado.nextDouble();
					
					mediaFinalAluno[posicaoAtual] = (nota1[posicaoAtual] + nota2[posicaoAtual] + nota3[posicaoAtual]) / 3;
				}
				
				posicaoAtual++;
				
			} else if (opcao == 2) {
				for(int i = 0; i < alunos.length; i++) {
					if( alunos[i] != null) {
						System.out.printf("%s tem media final de %.2f\n", alunos[i], mediaFinalAluno[i]);
					}
				}
			} else if (opcao == 3) {
				for (int i = 0; i < mediaFinalAluno.length; i++) {
					if (alunos[i] != null) {
						somaMediaAlunos += mediaFinalAluno[i];
						quantidadeAlunosCadastrados++;
					}
				}
				
				mediaTurma = somaMediaAlunos / quantidadeAlunosCadastrados;
				System.out.printf("A média da turma é %.2f\n", mediaTurma);
			} else if (opcao == 4) {
				for (int i = 0; i < alunos.length; i++) {
					if (mediaFinalAluno[i] >= 7) {
						System.out.printf("O aluno(a) %s está APROVADO com média %.2f\n", alunos[i], mediaFinalAluno[i] );
					} 
				}
			} else if (opcao == 5) {
				for (int i = 0; i < alunos.length; i++) {
					if (alunos[i] != null) {
						if (mediaFinalAluno[i] < 7) {
							System.out.printf("O aluno(a) %s está REAPROVADO com média %.2f\n", alunos[i], mediaFinalAluno[i] );
						} 
					}
				}
			} else if (opcao == 6) {
				for (int i = 0; i < mediaFinalAluno.length; i++) {
					if (alunos[i] != null) {
						somaMediaAlunos += mediaFinalAluno[i];
						quantidadeAlunosCadastrados++;
					}
				}
				
				mediaTurma = somaMediaAlunos / quantidadeAlunosCadastrados;
				
				for (int i = 0; i < mediaFinalAluno.length; i++) {
					if (mediaFinalAluno[i] > mediaTurma) {
						System.out.printf("O aluno(a) %s tem média %.2f  e está acima da média da turma.\n", alunos[i], mediaFinalAluno[i]);
					}
				}
			}
			
		}
	}
	
}
