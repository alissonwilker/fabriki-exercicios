public abstract class Cliente {
 private String nome;
 
 public String getNome() {
	 return nome; 
 }
 protected Cliente (String nome) {
		super();
		this.nome = nome;
	}
}
