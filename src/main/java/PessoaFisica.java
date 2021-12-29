
public class PessoaFisica extends Cliente {
    //atributos
    private java.lang.String cpf;

    //métodos especiais
    public PessoaFisica(java.lang.String nome, String cpf) {
        super(nome);

        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
}
