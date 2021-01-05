import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int quantAtual;
		int quantMax;
		int quantMin;
		int media;

		System.out.println("Informe a quantidade atual no estoque:");
		quantAtual = teclado.nextInt();

		System.out.println("Informe a quantidade máxima no estoque:");
		quantMax= teclado.nextInt();

		System.out.println("Informe a quantidade mínima no estoque:");
		quantMin = teclado.nextInt();

		media = (quantMax + quantMin) / 2;

		if (quantAtual >= media) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
	}

}
