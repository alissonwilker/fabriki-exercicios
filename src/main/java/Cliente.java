package classes;

public abstract class Cliente {

	private String nome;
	
	protected Cliente(String _nome) {
		this.nome = _nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
