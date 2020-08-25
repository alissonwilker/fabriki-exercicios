/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elizeu Neto
 */
public class PessoaJuridica extends Cliente {
    //Declaração das variavéis
    private String cnpj;
    
    //Método construtor
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
    
    //Métodos Getter
    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
}
