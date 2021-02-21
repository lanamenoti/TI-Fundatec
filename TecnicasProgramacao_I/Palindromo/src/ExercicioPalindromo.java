import java.util.Scanner;

public class ExercicioPalindromo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean ehPalindromo = false;
		String palavra = "";
		String palavraInvertida = "";
		
		System.out.println("Digite uma palavra:");
		palavra = teclado.next();
		
		for (int i = palavra.length() - 1; i >= 0 ; i--) {
			palavraInvertida += palavra.charAt(i); 
		}
		
		if (palavraInvertida.equals(palavra)) {
			ehPalindromo = true;
		}
		
		System.out.println("Palavra digitada é palindromo? " + ehPalindromo);
		
	}

}
