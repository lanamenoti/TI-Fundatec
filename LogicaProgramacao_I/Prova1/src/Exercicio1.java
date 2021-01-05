import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String timeA;
		String timeB;
		int pontosTimeA;
		int pontosTimeB;
		int total;
		int porcTimeA;
		int porcTimeB;
		
		System.out.println("Informe o time A:");
		timeA = teclado.next();
		
		System.out.println("Informe o time B:");
		timeB = teclado.next();
		
		System.out.println("Informe os pontos do time A:");
		pontosTimeA = teclado.nextInt();
		
		System.out.println("Informe os pontos do time B:");
		pontosTimeB = teclado.nextInt();
		
		total = pontosTimeA + pontosTimeB;
		porcTimeA = (pontosTimeA * 100) / total;
		porcTimeB = (pontosTimeB * 100) / total;
		
		if (pontosTimeA > pontosTimeB) {
			System.out.printf("Time A venceu o time B por %d a %d pontos. "
					+ "Time A fez %d%% dos pontos da partida contra %d%% dos pontos para time B.", pontosTimeA, pontosTimeB, porcTimeA, porcTimeB);
		} else {
			System.out.printf("Time B venceu o time A por %d a %d pontos. "
					+ "Time B fez %d%% dos pontos da partida contra %d%% dos pontos para time A.", pontosTimeB, pontosTimeA, porcTimeB, porcTimeA);
		}
		
		
		
	}

}
