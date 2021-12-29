
public abstract class Cliente {
    //atributos
    private String nome;

    //métodos especiais


    protected Cliente(java.lang.String nome) {
    	this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
