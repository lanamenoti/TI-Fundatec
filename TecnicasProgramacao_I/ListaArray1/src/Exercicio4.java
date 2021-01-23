import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double[] notas = new double[20];
		double somaNotas = 0, mediaTurma;
		int quantidadeAlunosAcimaMedia = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite uma nota: ");
			notas[i] = teclado.nextDouble();
			
			somaNotas += notas[i];
		}
		
		mediaTurma = somaNotas / notas.length;
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > mediaTurma) {
				quantidadeAlunosAcimaMedia++;
			}
		}
		
		System.out.println("A média da turma é " + mediaTurma);
		System.out.println("A quantidade de alunos que obtiveram nota maior que a média da turma é " + quantidadeAlunosAcimaMedia);
	}

}
