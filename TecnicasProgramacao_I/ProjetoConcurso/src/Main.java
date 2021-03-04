import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1 - Cadastrar a prova
		// 2 - Cadastrar um candidato
		// 3 - Inscrever um candidato para uma determinada prova
		// 4 - Mostrar concursos com intervalos entre datas
			// Ex.: Os concursos entre 20/01/2020 - 28/01/2020
		// 5 - Mostrar os concursos com salarios maiores que um determinado valor
			// Ex.: O usu√°rio informa R$ 2000,00 e o sistema mostra todos
		// os consursos que est√£o pagando acima deste valor
		// 6 - Mostrar os concursos de uma determinada cidade
			// Ex.: O usu√°rio informa Porto Alegre e o sistema mostra todos
		// os consursos que s√£o desta cidade
		// 7 - Mostrar os concursos com um determinado numero de vagas
		// 8 - Sair

		// Informa√ß√µes da prova
		// data (LocalDateTime)
		// local (Endereco)
		// numeroVagas (int);
		// descricao (String)
		// empresa (String);
		// salarioBase (double)

		// Informa√ß√µes do Candidato
		// nome (String);
		// cpf (String)

		Scanner teclado = new Scanner(System.in);

		String opcao = "S";
		
		BancoDeDados bancoDeDados = new BancoDeDados();

		while (opcao.equals("S")) {
			System.out.println("Deseja continuar");
			opcao = teclado.next();

			System.out.println("Informe uma opcao do menu");
			System.out.println("1 - Cadastrar prova");
			System.out.println("2 - Cadastrar um candidato");
			System.out.println("3 - Inscrever um candidato para uma determinada prova");

			int opcaoMenu = teclado.nextInt();
			
			if (opcaoMenu == 1) {
				
				int id = bancoDeDados.getProvas().size() + 1;
				
				System.out.println("Informe o ano da prova:");
				int ano = teclado.nextInt();
				
				System.out.println("Informe o mes da prova:");
				int mes = teclado.nextInt();
				
				System.out.println("Informe o dia da prova:");
				int dia = teclado.nextInt();
				
				System.out.println("Informe o hor·rio da prova:");
				int horario = teclado.nextInt();
				
				System.out.println("Informe os minutos da prova:");
				int minuto = teclado.nextInt();
				
				LocalDateTime dataProva = LocalDateTime.of(ano, mes, dia, horario, minuto);
				
				System.out.println("Informe o nome do Estado:");
				String nomeEstado = teclado.next();
				
				System.out.println("Informe a sigla do Estado:");
				String siglaEstado = teclado.next();
				
				Estado estado = new Estado(nomeEstado, siglaEstado);
				
				System.out.println("Informe o nome da Cidade:");
				String nomeCidade = teclado.next();
				
				Cidade cidade = new Cidade(nomeCidade, estado);
				
				System.out.println("Informe a rua:");
				String rua = teclado.next();
				
				System.out.println("Informe o n˙mero:");
				String numero = teclado.next();
				
				System.out.println("Informe o bairro:");
				String bairro = teclado.next();
				
				System.out.println("Informe o cep:");
				String cep = teclado.next();
				
				System.out.println("Informe o complemento:");
				String compl = teclado.next();
				
				Endereco localProva = new Endereco(rua, numero, bairro, cep, compl, cidade);
				
				System.out.println("Informe o n˙mero de vagas:");
				int numeroVagas = teclado.nextInt();
				
				System.out.println("Informe a descriÁ„o da prova:");
				String descricaoProva= teclado.next();
				
				System.out.println("Informe a empresa:");
				String empresa = teclado.next();
				
				System.out.println("Informe o sal·rio base:");
				double salarioBase = teclado.nextDouble();
				
				Prova prova = new Prova(id, dataProva, localProva, numeroVagas, descricaoProva, empresa, salarioBase);
				
				bancoDeDados.adicionarProvas(prova);
				
				for (Prova p : bancoDeDados.getProvas()) {
					System.out.println(p.getData());
					System.out.println(p.getLocal());
					System.out.println(p.getNumeroVagas());
				}
				
			} else if (opcaoMenu == 2) {
				System.out.println("Informe o nome:");
				String nome = teclado.next();
				System.out.println("Informe o CPF:");
				String cpf = teclado.next();

				Candidato candidato = new Candidato(nome, cpf);
				bancoDeDados.adicionarCandidatos(candidato);
			} else if (opcaoMenu == 3) {
				System.out.println("Informe o cpf do candidato:");
				String cpf = teclado.next();
				
				Candidato candidatoFiltrado = bancoDeDados.filtrarCandidato(cpf);
				
				if (candidatoFiltrado == null) {
					System.out.println("Candidato n„o encontrado");
				}
				
				System.out.println("Informe o id da prova:");
				int idProva = teclado.nextInt();
				
				Prova provaEncontrada = bancoDeDados.filtrarProva(idProva);
				
				if (provaEncontrada == null) {
					System.out.println("Prova n„o encontrado");
				}
				
				if (candidatoFiltrado != null && provaEncontrada != null) {
					provaEncontrada.inscreverCandidato(candidatoFiltrado);
				}
			}

		}
	}
}
