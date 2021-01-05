package estruturaCondicao;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String desejaViajar;
		String destino;
		
		System.out.println("Você deseja viajar:");
		desejaViajar = teclado.next();
		
		
		if (desejaViajar.equals("SIM")) {
			System.out.println("Informe seu destino:");
			destino = teclado.next();
			
			System.out.println("Você vai para " + destino);
			
			if (destino.equals("SAOPAULO") || destino.equals("RIO")) {
				System.out.println("VocÃª vai viajar de avião");
			} else {
				System.out.println("Você vai de ônibus");
			}
			
		} else { 
			System.out.println("Você disse não");
		}
	}
}
