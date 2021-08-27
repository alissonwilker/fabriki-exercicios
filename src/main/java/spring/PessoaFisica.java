package spring;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;


@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    
}
