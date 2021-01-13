import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor, somaPositivos = 0, quantPositivos = 0, produtoNegativos = 1, quantNegativos = 0;
		char desejaSair = ' ';
		
		while (desejaSair != 'S') {
			System.out.println("Digite um valor:");
			valor = teclado.nextInt();
			
			if (valor >= 0) {
				somaPositivos += valor;
				quantPositivos++;
			} else {
				produtoNegativos *= valor;
				quantNegativos++;
			}
			
			System.out.println("Deseja sair do programa (S ou N):");
			desejaSair = teclado.next().charAt(0);
		}
		
		System.out.println("A soma dos valores positivos é: " + somaPositivos);
		System.out.println("A quantidade dos valores positivos é: " + quantPositivos);
		System.out.println("O produto dos valores negativos é: " + produtoNegativos);
		System.out.println("A quantidade dos valores negativos é: " + quantNegativos);
	}

}
