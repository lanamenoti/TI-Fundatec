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
		
		System.out.println("Informe a sua nota em Portugu�s:");
		notaPort = teclado.nextDouble();
		
		System.out.println("Informe a sua nota em Matem�tica:");
		notaMat = teclado.nextDouble();
		
		System.out.println("Informe a sua nota em Conhecimentos Gerais:");
		notaCG = teclado.nextDouble();
		
		media = (notaCG + notaMat + notaPort) / 3;
		
		if (media >= 7 && notaMat > 5 && notaPort > 5 && notaCG > 5) {
			System.out.println(nome + " foi aprovado!");
			System.out.println("A m�dia foi " + media);
			System.out.println("As notas foram: " + notaPort + " (em Portugu�s), " + notaMat + " (em Matem�tica), " + notaCG + " (em Conhecimentos Gerais).");
		} else {
			System.out.println(nome + " foi reprovado.");
			System.out.println("A m�dia foi " + media);
			System.out.println("As notas foram: " + notaPort + " (em Portugu�s), " + notaMat + " (em Matem�tica), " + notaCG + " (em Conhecimentos Gerais).");
		}
	}

}
