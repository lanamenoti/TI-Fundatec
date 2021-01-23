import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] frutas = new String[10];
		String frutaAComparar;
		boolean frutaEstaNoArray = false;

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Digite uma fruta:");
			frutas[i] = teclado.next();
		}
		
		System.out.println("Digite a fruta a comparar:");
		frutaAComparar = teclado.next();

		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i].equals(frutaAComparar)) {
				frutaEstaNoArray = true;
				break;
			} else {
				frutaEstaNoArray = false;
			}
		}

		if (frutaEstaNoArray) {
			System.out.println("A fruta digitada foi encontrada no array!");
		} else {
			System.out.println("A fruta digitada não foi encontrada no array!");
		}
	}
}
