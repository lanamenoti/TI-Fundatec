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
	
	public void inscreverCandidato(Candidato candidato) {
			this.candidatosInscritos.add(candidato);
	}
}
