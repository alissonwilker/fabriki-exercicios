/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class PessoaJuridica extends Cliente {

    private String cnpj;
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj=cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }

    
}
