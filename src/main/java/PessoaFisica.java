
public class PessoaFisica extends Cliente {
    //atributos
    private String cpf;

    //métodos especiais
    public PessoaFisica(String nome, String cpf) {
        super(nome);

        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
}
