import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1 - Cadastrar a prova
		// 2 - Cadastrar um candidato
		// 3 - Inscrever um candidato para uma determinada prova
		// 4 - Mostrar concursos com intervalos entre datas
			// Ex.: Os concursos entre 20/01/2020 - 28/01/2020
		// 5 - Mostrar os concursos com salarios maiores que um determinado valor
			// Ex.: O usuÃ¡rio informa R$ 2000,00 e o sistema mostra todos
		// os consursos que estÃ£o pagando acima deste valor
		// 6 - Mostrar os concursos de uma determinada cidade
			// Ex.: O usuÃ¡rio informa Porto Alegre e o sistema mostra todos
		// os consursos que sÃ£o desta cidade
		// 7 - Mostrar os concursos com um determinado numero de vagas
		// 8 - Sair

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
			System.out.println("4 - Mostrar concursos com intervalos entre datas");
			System.out.println("5 - Mostrar concursos com salarios maiores que um determinado valor");
			System.out.println("6 - Mostrar concursos de uma determinada cidade");
			System.out.println("7 - Mostrar os concursos com um determinado numero de vagas");
			System.out.println("8 - Mostrar todos os concursos");
			System.out.println("9 - Mostrar todos os candidatos");
			System.out.println("10 - Sair");

			
			int opcaoMenu = teclado.nextInt();
			
			if (opcaoMenu == 1) {
				
				int id = bancoDeDados.getProvas().size() + 1;
				
				System.out.println("Informe o ano da prova:");
				int ano = teclado.nextInt();
				
				System.out.println("Informe o mes da prova:");
				int mes = teclado.nextInt();
				
				System.out.println("Informe o dia da prova:");
				int dia = teclado.nextInt();
				
				System.out.println("Informe o horário da prova:");
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
				
				System.out.println("Informe o número:");
				String numero = teclado.next();
				
				System.out.println("Informe o bairro:");
				String bairro = teclado.next();
				
				System.out.println("Informe o cep:");
				String cep = teclado.next();
				
				System.out.println("Informe o complemento:");
				String compl = teclado.next();
				
				Endereco localProva = new Endereco(rua, numero, bairro, cep, compl, cidade);
				
				System.out.println("Informe o número de vagas:");
				int numeroVagas = teclado.nextInt();
				
				System.out.println("Informe a descrição da prova:");
				String descricaoProva= teclado.next();
				
				System.out.println("Informe a empresa:");
				String empresa = teclado.next();
				
				System.out.println("Informe o salário base:");
				double salarioBase = teclado.nextDouble();
				
				Prova prova = new Prova(id, dataProva, localProva, numeroVagas, descricaoProva, empresa, salarioBase);
				
				bancoDeDados.adicionarProvas(prova);
				
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
					System.out.println("Candidato não encontrado");
				}
				
				System.out.println("Informe o id da prova:");
				int idProva = teclado.nextInt();
				
				Prova provaEncontrada = bancoDeDados.filtrarProva(idProva);
				
				if (provaEncontrada == null) {
					System.out.println("Prova não encontrado");
				}
				
				if (candidatoFiltrado != null && provaEncontrada != null) {
					provaEncontrada.inscreverCandidato(candidatoFiltrado);
				}
				
			} else if (opcaoMenu == 4) {
				
				System.out.println("Informe o ano de início do intervalo que deseja filtrar:");
				int anoInicial = teclado.nextInt();
				
				System.out.println("Informe o mes de início do intervalo que deseja filtrar:");
				int mesInicial = teclado.nextInt();
				
				System.out.println("Informe o dia de início do intervalo que deseja filtrar:");
				int diaInicial = teclado.nextInt();
				
				
				LocalDateTime inicioIntervalo = LocalDateTime.of(anoInicial, mesInicial, diaInicial, 0, 0);
				
				System.out.println("Informe o ano de final do intervalo que deseja filtrar:");
				int anoFinal = teclado.nextInt();
				
				System.out.println("Informe o mes de final do intervalo que deseja filtrar:");
				int mesFinal = teclado.nextInt();
				
				System.out.println("Informe o dia de final do intervalo que deseja filtrar:");
				int diaFinal = teclado.nextInt();
				
				
				LocalDateTime finalIntervalo = LocalDateTime.of(anoFinal, mesFinal, diaFinal, 23, 59);
				
				List<Prova> provasFiltradasPorIntervalo = bancoDeDados.filtrarProvasPorIntervalo(inicioIntervalo, finalIntervalo);
				
				if (provasFiltradasPorIntervalo.size() != 0) {
					System.out.println("As provas no intervalo " + inicioIntervalo + "-" + finalIntervalo + " são:");
					
					for (Prova prova : provasFiltradasPorIntervalo) {
						System.out.println("Prova " + prova.getId() + ":");
						System.out.println(prova.getDescricao());
						System.out.println(prova.getSalarioBase());
						System.out.println("-------------------------------------------------");
					}
					
				} else {
					System.out.println("Não existem provas no intervalo " + inicioIntervalo + "-" + finalIntervalo);	
				}
				
			} else if (opcaoMenu == 5) {
				
				System.out.println("Informe um salário mínimo que deseja filtrar:");
				double salarioBuscado = teclado.nextDouble();
				
				List<Prova> provasFiltradasPorSalario = bancoDeDados.filtrarProvasComSalarioMaiorQue(salarioBuscado);
				
				if (provasFiltradasPorSalario.size() != 0) {
					System.out.println("As provas com salário maior que " + salarioBuscado + " são:");
					
					for (Prova prova : provasFiltradasPorSalario) {
						System.out.println("Prova " + prova.getId() + ":");
						System.out.println(prova.getDescricao());
						System.out.println(prova.getSalarioBase());
						System.out.println("-------------------------------------------------");
					}
					
				} else {
					System.out.println("Não existem provas com salário maior que " + salarioBuscado);	
				}
				
			} else if (opcaoMenu == 6) {
				
				System.out.println("Informe a cidade que deseja filtrar: ");
				String cidadeAEncontrar = teclado.next();
				
				List<Prova> provasFiltradasPorCidade = bancoDeDados.filtrarProvasPorCidade(cidadeAEncontrar);
				
				if (provasFiltradasPorCidade.size() != 0) {
					System.out.println("As provas da cidade " + cidadeAEncontrar + " são:");
					
					for (Prova prova : provasFiltradasPorCidade) {
						System.out.println("Prova " + prova.getId() + ":");
						System.out.println(prova.getDescricao());
						System.out.println(prova.getSalarioBase());
						System.out.println("-------------------------------------------------");
					}
					
				} else {
					System.out.println("Não existem provas na cidade " + cidadeAEncontrar);	
				}
				
			} else if (opcaoMenu == 7) {
				
				System.out.println("Informe o número de vagas que deseja filtrar:");
				int numeroDeVagasAFiltrar = teclado.nextInt();
				
				List<Prova> provasFiltradasPorNumeroDeVagas = bancoDeDados.filtrarProvasPorNumeroDeVagas(numeroDeVagasAFiltrar);
				
				if (provasFiltradasPorNumeroDeVagas.size() != 0) {
					System.out.println("As provas da cidade " + numeroDeVagasAFiltrar + " são:");
					
					for (Prova prova : provasFiltradasPorNumeroDeVagas) {
						System.out.println("Prova " + prova.getId() + ":");
						System.out.println(prova.getDescricao());
						System.out.println(prova.getSalarioBase());
						System.out.println("-------------------------------------------------");
					}
					
				} else {
					System.out.println("Não existem provas com " + numeroDeVagasAFiltrar + " número de vagas.");	
				}
				
			} else if (opcaoMenu == 8) {
				System.out.println("As provas cadastradas são:");
				
				for (Prova provaCadastrada : bancoDeDados.getProvas()) {
					System.out.println("ID da prova: " + provaCadastrada.getId());
					System.out.println("Descrição da prova: " + provaCadastrada.getDescricao());
					System.out.println("Data da prova: " + provaCadastrada.getData());
					System.out.println("-------------------------------------------------");
				}
				
			} else if (opcaoMenu == 9) {
				
				System.out.println("Os candidatos cadastrados são:");
				
				for (Candidato candidatoCadastrado : bancoDeDados.getCandidatos()) {
					System.out.println("Nome do candidato: " + candidatoCadastrado.getNome());
					System.out.println("Cpf do candidato: " + candidatoCadastrado.getCpf());
					System.out.println("-------------------------------------------------");
				}
			} else if (opcaoMenu == 10) {
				opcao = "N";
			}

		}
	}
}
