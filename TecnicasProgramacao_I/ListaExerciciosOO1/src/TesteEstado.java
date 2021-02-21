
public class TesteEstado {
	public static void main(String[] args) {
		Estado rs = new Estado();
		rs.setNome("Rio Grande do Sul");
		rs.setSigla("RS");
		
		Estado rj = new Estado();
		rj.setNome("Rio de Janeiro");
		rj.setSigla("RJ");
		
		
		System.out.println(rs.getNome());
		System.out.println(rs.getSigla());
		
		System.out.println(rj.getNome());
		System.out.println(rj.getSigla());
	}
}
