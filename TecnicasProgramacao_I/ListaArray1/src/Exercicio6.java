import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite o valor de N:");
		N = teclado.nextInt();
		
		double[] arrayA = new double[N];
		double[] arrayB = new double[N];
		double[] resultadoMultiplicacao = new double[N];
	
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Digite um valor para array A: ");
			arrayA[i] = teclado.nextDouble();
			
			System.out.println("Digite um valor para array B: ");
			arrayB[i] = teclado.nextDouble();
		}
		
		for (int i = 0; i < resultadoMultiplicacao.length; i++) {
			resultadoMultiplicacao[i] = arrayA[i] * arrayB[i];
		}
		
		for (int i = 0; i < resultadoMultiplicacao.length; i++) {
			System.out.println(resultadoMultiplicacao[i]);
		}
	}
}
