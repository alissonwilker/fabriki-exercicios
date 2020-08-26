public abstract class Cliente {
	protected String nome;


	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		 this.nome = nome;
	}
}
