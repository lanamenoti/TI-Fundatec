import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Informe o primeiro número:");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número:");
		num2 = teclado.nextInt();
		
		System.out.println("Informe o terceiro número:");
		num3 = teclado.nextInt();
		
		if (num2 > num1 && num2 < num3) {
			System.out.println(num2 + " se encontra no intervalo entre " + num1 + " e " + num3);
		} else {
			System.out.println(num2 + " não se encontra no intervalo entre " + num1 + " e " + num3);
		}
	}

}
