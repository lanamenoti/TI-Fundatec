import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	
	private List<Prova> provas = new ArrayList<Prova>();
	

	public void adicionarCandidatos(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	public void adicionarProvas(Prova prova) {
		provas.add(prova);
	}
	
	public Candidato filtrarCandidato(String cpf) {
		for (Candidato candidato : candidatos) {
			if (candidato.getCpf().equals(cpf)) {
				return candidato;
			}
		}
		return null;
	}
	
	public Prova filtrarProva(int id) {
		for (Prova prova : provas) {
			if (prova.getId() == id) {
				return prova;
			}
		}
		return null;
	}
	
	public List<Prova> filtrarProvasPorIntervalo(LocalDateTime inicioIntervalo, LocalDateTime finalIntervalo) {
		List<Prova> provasFiltardasPorIntervalo = new ArrayList<Prova>();
		
		for (Prova prova : provas) {
			if (prova.getData().isAfter(inicioIntervalo) && prova.getData().isBefore(finalIntervalo)) {
				provasFiltardasPorIntervalo.add(prova);
			}
		}
		
		return provasFiltardasPorIntervalo;
	}
	
	public List<Prova> filtrarProvasComSalarioMaiorQue(double salario) {
		List<Prova> provasFiltardasPorSalario = new ArrayList<Prova>();
		
		for (Prova prova : provas) {
			if (prova.getSalarioBase() >= salario) {
				provasFiltardasPorSalario.add(prova);
			}
		}
		
		return provasFiltardasPorSalario;
	}
	
	public List<Prova> filtrarProvasPorCidade(String cidade) {
		List<Prova> provasFiltardasPorCidade = new ArrayList<Prova>();
		
		for (Prova prova : provas) {
			if (prova.getLocal().getCidade().getNome().equals(cidade)) {
				provasFiltardasPorCidade.add(prova);
			}
		}
		
		return provasFiltardasPorCidade;
	}
	
	public List<Prova> filtrarProvasPorNumeroDeVagas(int numeroDeVagas) {
		List<Prova> provasFiltardasPorNumeroDeVagas = new ArrayList<Prova>();
		
		for (Prova prova : provas) {
			if (prova.getNumeroVagas() == numeroDeVagas) {
				provasFiltardasPorNumeroDeVagas.add(prova);
			}
		}
		
		return provasFiltardasPorNumeroDeVagas;
	}
	
	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public List<Prova> getProvas() {
		return provas;
	}
}
