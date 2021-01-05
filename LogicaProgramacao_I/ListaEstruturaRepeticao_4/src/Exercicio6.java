import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numFilhos, cont = 0, quantS1800 = 0, quantM3;
		double rendaBruta, mediaNumFilhos = 0, somaNumFilhos = 0, mediaS = 0, somaS = 0;
		char coletarInfo = 'S';
		
		while (coletarInfo == 'S') {
			System.out.println("Informe o n�mero de filhos da fam�lia:");
			numFilhos = teclado.nextInt();
			
			System.out.println("Informe a renda bruta da fam�lia:");
			rendaBruta = teclado.nextDouble();
			
			somaNumFilhos += numFilhos;
			somaS += rendaBruta;
			
			cont++;
			
			if (rendaBruta > 1800) {
				quantS1800++;
			}
			
			if (numFilhos > 3) {
				numFilhos++;
			}
			
			System.out.println("Deseja coletar mais informa��es?");
			coletarInfo = teclado.next().charAt(0);
		}
		
		mediaNumFilhos = somaNumFilhos / cont;
		mediaS = somaS / cont;
		
		System.out.println("A media do n�mero de filhos � " + mediaNumFilhos);
		System.out.println("A m�dia dos sal�rios � " + mediaS);
		System.out.println("A quantidade de fam�lias com sal�rio maior que 1800 � " + quantS1800);
		System.out.println("A quantidade de fam�lias com mais de 3 filhos � " + quantS1800);
	}

}
