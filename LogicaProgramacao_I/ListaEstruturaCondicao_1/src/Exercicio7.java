import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String time1;
		String time2;
		int golsTime1;
		int golsTime2;
		
		System.out.println("Informe o nome do primeiro time:");
		time1 = teclado.next();
		
		System.out.println("Informe o nome do segundo time:");
		time2 = teclado.next();
		
		System.out.println("Informe o número de gols marcados pelo primeiro time: " );
		golsTime1 = teclado.nextInt();
		
		System.out.println("Informe o número de gols marcados pelo segundo time: " );
		golsTime2 = teclado.nextInt();
		
		if (golsTime1 > golsTime2) {
			System.out.println("O vencedor da partida é: " + time1);
		} else if (golsTime1 < golsTime2) {
			System.out.println("O vencedor da partida é: " + time2);
		} else {
			System.out.println("Os times empataram");
		}
	}
	

}
