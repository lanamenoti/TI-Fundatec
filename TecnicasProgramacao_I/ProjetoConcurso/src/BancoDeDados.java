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
	
	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public List<Prova> getProvas() {
		return provas;
	}
}
