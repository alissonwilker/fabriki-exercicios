public abstract class Cliente {
    private String nome;

    protected Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

	public void setNome(String nome) {
		this.nome = nome;
	}


}
