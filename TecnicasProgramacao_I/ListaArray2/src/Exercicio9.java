import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] arrayA = new int[10];
		int somaElementosMenoresQue7 = 0, quantidadeElementosSuperioresA15 = 0, somaElementosSuperioresA7 = 0, quantidadeElementosSuperioresA7 = 0, mediaElementosSuperiorA7 = 0;
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.printf("Digite um número para posição %d do array:", i + 1);
			arrayA[i] = teclado.nextInt();
		}

		for (int i = 0; i <arrayA.length; i++) {
			if (arrayA[i] < 7) {
				somaElementosMenoresQue7 += arrayA[i];
			} else if (arrayA[i] > 7) {
				somaElementosSuperioresA7 += arrayA[i];
				quantidadeElementosSuperioresA7++;
			} 
			
			if (arrayA[i] > 15) {
				quantidadeElementosSuperioresA15++;
			}
		}
		
		mediaElementosSuperiorA7 = somaElementosSuperioresA7 / quantidadeElementosSuperioresA7;

		System.out.println("A soma de elementos armazenados neste array que são inferiores a 7 é " + somaElementosMenoresQue7);
		System.out.println("A quantidade de elementos armazenados no array que são superiores a 15 é " + quantidadeElementosSuperioresA15);
		System.out.println("A média dos elementos armazenados no array que são superiores a 7 é " + mediaElementosSuperiorA7);
	}
}
