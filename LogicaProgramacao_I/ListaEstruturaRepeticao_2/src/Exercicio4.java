import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade, salario, maiorI = 0, menorI = 1000, mediaS, somaS = 0, quantMulheres = 0;
		char sexo;
		
		for (int i = 0; i < 300; i++) {
			System.out.println("Digite o salário:");
			salario = teclado.nextInt();
			
			System.out.println("Digite a idade:");
			idade = teclado.nextInt();
			
			System.out.println("Digite o sexo (F/M):");
			sexo = teclado.next().charAt(0);
			
			somaS = somaS + salario;
			
			if (idade > maiorI) {
				maiorI = idade;
			}
			
			if (idade < menorI) {
				menorI = idade;
			}
			
			if (sexo == 'F' && salario <= 200) {
				quantMulheres++;
			}
		}
		
		mediaS = somaS / 300;
		
		System.out.println("A média dos salários é: " + mediaS);
		System.out.println("A maior idade é: " + maiorI);
		System.out.println("A menor idade é: " + menorI);
		System.out.println("A quantidade de mulheres com salário até 200 é:" + quantMulheres);
	}

}
