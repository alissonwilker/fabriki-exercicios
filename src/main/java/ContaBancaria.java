public class ContaBancaria {

    private int saldo;
    private Cliente cliente;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public String recuperaNome(String nome) {
        cliente = new Cliente();
        cliente.setNome(nome);
        return cliente.getNome();
    }

    public String recuperaCPF(String cpf) {
        pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf(cpf);
        return pessoaFisica.getCpf();
    }

    public String recuperaCNPJ(String cnpj) {
        pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj(cnpj);
        return pessoaJuridica.getCnpj();
    }

    public String recuperaSaldo() {
        setSaldo(0);
        return String.valueOf(getSaldo());
    }

    public String depositar(int valor) {
        setSaldo(valor);
        return String.valueOf(getSaldo());
    }

    public String sacar() {
        setSaldo(0);
        return String.valueOf(getSaldo());
    }

    public String sacar(int valor) {
        int resto = getSaldo();
        setSaldo(resto - valor);
        return String.valueOf(getSaldo());
    }

    public String depositarSacar(int deposito, int saque) {
        String valor = "";
        if (deposito >= saque) {
            depositar(deposito);
            sacar(saque);
            valor = String.valueOf(getSaldo());
        } else {
            valor = "Valor de saque excedente!";
        }

        return valor;
    }

}
