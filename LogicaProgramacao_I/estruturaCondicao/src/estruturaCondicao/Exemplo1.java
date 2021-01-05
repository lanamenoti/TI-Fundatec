package estruturaCondicao;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		
		System.out.println("Informe a nota 1:");
		nota1 = teclado.nextDouble();
		
		System.out.println("Informe a nota 2:");
		nota2 = teclado.nextDouble();
		
		System.out.println("Informe a nota 3:");
		nota3 = teclado.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
	
	
	

}
