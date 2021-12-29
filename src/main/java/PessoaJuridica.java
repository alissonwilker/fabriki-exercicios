
public class PessoaJuridica extends Cliente {
    //atributos
    private String cnpj;

    //métodos especiais
    public PessoaJuridica(String nome, String cnpj) {   
        super(nome);

        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }
}
