public class Cliente {
	private String nome;
	
	protected Cliente(String nomeentrada) {
		this.nome = nomeentrada ;
	}
	
	public String getNome() {
		return nome;
	}
}
