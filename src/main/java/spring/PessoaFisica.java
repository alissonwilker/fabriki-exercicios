package spring;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf=cpf;
    }

    public PessoaFisica(){        
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }


}
