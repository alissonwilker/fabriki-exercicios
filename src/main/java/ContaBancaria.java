public class ContaBancaria {


    private int id;

    private int saldo = 0;


    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica; 


    public ContaBancaria() {}


    public ContaBancaria(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }


    public int getId() {
        return id;
    }

    public PessoaFisica getPessoaFisica() {
        return this.pessoaFisica;
    }


    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public ContaBancaria(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }


    public int getId() {
        return id;
    }

    public ContaBancaria getContaBancaria() {
        return this.pessoaJuridica;
    }


    public void setContaBancaria(ContaBancaria pessoaFisica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public int getSaldo() {
        return saldo;
    }


    public int depositar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
        return saldo;
    }

    public int sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        }
        return saldo;
    }

}
