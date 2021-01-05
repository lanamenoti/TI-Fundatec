import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double notaPort;
		double notaMat;
		double notaCG;
		double media;
		
		System.out.println("Informe seu nome:");
		nome = teclado.next();
		
		System.out.println("Informe a sua nota em Português:");
		notaPort = teclado.nextDouble();
		
		System.out.println("Informe a sua nota em Matemática:");
		notaMat = teclado.nextDouble();
		
		System.out.println("Informe a sua nota em Conhecimentos Gerais:");
		notaCG = teclado.nextDouble();
		
		media = (notaCG + notaMat + notaPort) / 3;
		
		if (media >= 7 && notaMat > 5 && notaPort > 5 && notaCG > 5) {
			System.out.println(nome + " foi aprovado!");
			System.out.println("A média foi " + media);
			System.out.println("As notas foram: " + notaPort + " (em Português), " + notaMat + " (em Matemática), " + notaCG + " (em Conhecimentos Gerais).");
		} else {
			System.out.println(nome + " foi reprovado.");
			System.out.println("A média foi " + media);
			System.out.println("As notas foram: " + notaPort + " (em Português), " + notaMat + " (em Matemática), " + notaCG + " (em Conhecimentos Gerais).");
		}
	}

}
