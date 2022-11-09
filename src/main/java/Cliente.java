public class Cliente {
	private String nome;
	
	protected Cliente(String cliente) {
		this.setNome(cliente);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
