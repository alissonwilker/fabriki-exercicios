public abstract class Cliente {
	
	private String nome;

	// construtor
	protected Cliente(String nome) {
		this.nome = nome;
	}

	// getter and setter
	public String getNome() {
		return nome;
	}
}
