public abstract class Cliente {
	
	private String nome;
	
	protected Cliente(String nome){
		this.nome = nome;
	}
	
	String getNome(){
		return nome;
	}

}