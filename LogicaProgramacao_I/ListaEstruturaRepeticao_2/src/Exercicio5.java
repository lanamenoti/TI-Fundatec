import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double altura, maiorA = 0, menorA = 0, quantM = 0, altM = 0, quantP = 0, somaP = 0, mediaAM, mediaAP, quantH = 0, percHomens;
		char sexo;
		
		for (int i = 0; i < 50; i++) {
			quantP++;
			
			System.out.println("Digite uma altura:");
			altura = teclado.nextDouble();
			
			System.out.println("Digite o sexo(F/M):");
			sexo = teclado.next().charAt(0);
			
			if (i == 0) {
				maiorA = altura;
				menorA = altura;
			}
			
			if (altura > maiorA) {
				maiorA = altura;
			}
			
			if (altura < menorA) {
				menorA = altura;
			}
			
			if (sexo == 'F') {
				altM += altura;
				quantM++;
			}
			
			if (sexo == 'M') {
				quantH++;
			}
			
			somaP += altura;
		}
		
		mediaAM = altM / quantM;
		mediaAP = somaP / quantP;
		percHomens = quantH * 100 / quantP;
		
		System.out.println("A m�dia de altura da mulheres �: " + mediaAM);
		System.out.println("A m�dia de altura da popula��o �: " + mediaAP);
		System.out.println("A maior altura �: " + maiorA);
		System.out.println("A menor altura �: " + menorA);
		System.out.println("A percentual de homens na popola��o �:" + percHomens);
	}

}
