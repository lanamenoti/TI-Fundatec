import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		
		System.out.println("Informe o valor de A:");
		A = teclado.nextInt();
		
		System.out.println("Informe o valor de B:");
		B = teclado.nextInt();
		
		System.out.println("Informe o valor de C:");
		C = teclado.nextInt();
		
		if (A > B + C) {
			System.out.println("A � maior que B + C.");
		} 
		if (B < C - 1) {
			System.out.println("B � menor que o antecessor de C.");
		} 
		if (C == A * A) {
			System.out.println("C � igual ao quadrado de A");
		} 
		if (A % 2 == 0) {
			System.out.println("A � par.");
		} else {
			System.out.println("A � �mpar.");
		}
		if (B > C + C) {
			System.out.println("B � maior que o dobro de C");
		}
	}

}
