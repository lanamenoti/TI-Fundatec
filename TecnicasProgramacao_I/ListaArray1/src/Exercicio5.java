import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double[] numeros = new double[5];
		double numero;
		int contador = 0, quantidadePares = 0, quantidadeImpares = 0;

		while (contador < numeros.length) {
			System.out.println("Digite um numero:");
			numero = teclado.nextDouble();
			
			if (numero > 100 && numero < 500) {
				numeros[contador] = numero;
				
				if (numeros[contador] % 2 == 0) {
					quantidadePares++;
				} else {
					quantidadeImpares++;
				}
				
				contador++;
			} else {
				System.out.println("Número inválido");
			}
		}
		
		System.out.println("A quantidade de pares é: " + quantidadePares);
		System.out.println("A quantidade de ímpares é: " + quantidadeImpares);
	}
}
