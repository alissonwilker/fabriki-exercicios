
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class PessoaFisica extends Cliente {
    private String cpf;
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }

    
}
