public class PessoaJuridica extends Cliente {

    private String cpf;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cpf;
    }

    public void setCnpj(String cnpj) {
        this.cnpj= cnpj;
    }
}
