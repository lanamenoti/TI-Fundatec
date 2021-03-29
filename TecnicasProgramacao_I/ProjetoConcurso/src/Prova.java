import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prova {

	private int id;
	private LocalDateTime data;
	private Endereco local;
	private int numeroVagas;
	private String descricao;
	private String empresa;
	private double salarioBase;
	private List<Candidato> candidatosInscritos = new ArrayList<>();
	
	public Prova(int id, LocalDateTime data, Endereco local, int numeroVagas, String descricao, String empresa,
			double salarioBase) {
		this.id =  id;
		this.data = data;
		this.local = local;
		this.numeroVagas = numeroVagas;
		this.descricao = descricao;
		this.empresa = empresa;
		this.salarioBase = salarioBase;
	}

	public int getId() {
		return id;
	}
	
	public LocalDateTime getData() {
		return data;
	}

	public Endereco getLocal() {
		return local;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
	public List<Candidato> getCandidatosInscritos() {
		return candidatosInscritos;
	}
	
	public void inscreverCandidato(Candidato candidato) {
		boolean candidatoInscrito = validarInscricaoCandidato(candidato);
		
		if (candidatoInscrito) {
			System.out.println("Candidato já está inscrito");
			return;
		}
		
		this.candidatosInscritos.add(candidato);
	}
	
	private boolean validarInscricaoCandidato(Candidato candidato) {
		
		for (Candidato candidatoLoop : candidatosInscritos) {
			if(candidatoLoop.getCpf().equals(candidato.getCpf())) {
				return true;
			}
		}
		
		return false;
	}
}
