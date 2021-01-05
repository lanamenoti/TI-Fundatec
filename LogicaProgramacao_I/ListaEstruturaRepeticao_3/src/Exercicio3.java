import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 
		String votos;
		int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, nulos = 0, brancos = 0, total = 0;
		double percCand1, percCand2, percCand3, percCand4, percNulos, percBrancos;
		
		System.out.println("Digite o primeiro voto:");
		votos = teclado.next();
		
		while (!votos.equals("-1")) {
			if (votos.equals("1")) {
				cand1++;
				total++;
			} else if (votos.equals("2")) {
				cand2++;
				total++;
			} else if (votos.equals("3")) {
				cand3++;
				total++;
			} else if (votos.equals("4")) {
				cand4++;
				total++;
			} else if (votos.equals("N")) {
				nulos++;
				total++;
			} else {
				brancos++;
				total++;
			}
			
			System.out.println("Digite o pr�ximo voto (-1 para sair):");
			votos = teclado.next();
		}
		
		percCand1 = (cand1 * 100) / total;
		percCand2 = (cand2 * 100) / total;
		percCand3 = (cand3 * 100) / total;
		percCand4 = (cand4 * 100) / total;
		percNulos= (nulos * 100) / total;
		percBrancos = (brancos * 100) / total;
		
		System.out.printf("O total de votos do candidato 1 é %d. O percentual sobre o total é %.2f%%", cand1, percCand1);
		System.out.printf("O total de votos do candidato 2 é %d. O percentual sobre o total é %.2f%%", cand2, percCand2);
		System.out.printf("O total de votos do candidato 3 é %d. O percentual sobre o total é %.2f%%", cand3, percCand3);
		System.out.printf("O total de votos do candidato 4 é %d. O percentual sobre o total é %.2f%%", cand4, percCand4);
		System.out.printf("O total de votos nulos é %d. O percentual sobre o total é %.2f%%", nulos, percNulos);
		System.out.printf("O total de votos brancos é %d. O percentual sobre o total é %.2f%%", brancos, percBrancos);
		
		
		
		
	}

}
