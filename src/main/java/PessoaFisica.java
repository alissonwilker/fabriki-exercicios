public class PessoaFisica extends Cliente {

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    private final String cpf;

    public String getCpf() {
        return cpf;
    }
}
