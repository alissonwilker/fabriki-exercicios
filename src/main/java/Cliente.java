public abstract class Cliente {
			
	private String nome;
	
	protected Cliente(String nomeCliente){
		nome = nomeCliente;
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
} 
