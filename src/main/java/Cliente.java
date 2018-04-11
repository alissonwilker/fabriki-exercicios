
public abstract class Cliente {
	private String nome;
	
	protected Cliente(String cliente) {
		this.nome = cliente;
	
	}
	
	private String getNome(){
		return nome;
	}
}
