package estruturaCondicao;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String desejaViajar;
		String destino;
		
		System.out.println("Voc� deseja viajar:");
		desejaViajar = teclado.next();
		
		
		if (desejaViajar.equals("SIM")) {
			System.out.println("Informe seu destino:");
			destino = teclado.next();
			
			System.out.println("Voc� vai para " + destino);
			
			if (destino.equals("SAOPAULO") || destino.equals("RIO")) {
				System.out.println("Você vai viajar de avi�o");
			} else {
				System.out.println("Voc� vai de �nibus");
			}
			
		} else { 
			System.out.println("Voc� disse n�o");
		}
	}
}
