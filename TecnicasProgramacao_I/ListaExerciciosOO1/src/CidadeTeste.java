
public class CidadeTeste {
	public static void main(String[] args) {
		
		Estado rs = new Estado();
		rs.setNome("Rio Grande do Sul");
		rs.setSigla("RS");
		
		
		Cidade poa = new Cidade();
		poa.setNome("Porto Alegre");
		poa.setEstado(rs);
		
		Cidade saoLeo = new Cidade();
		saoLeo.setNome("São Leopoldo");
		saoLeo.setEstado(rs);
	}

}
