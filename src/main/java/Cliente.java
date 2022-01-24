
public abstract class Cliente {
	
	enum TipoCliente {
        pessoaFisica, pessoaJuridica
    }

    private String nome; 

    
    protected Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
