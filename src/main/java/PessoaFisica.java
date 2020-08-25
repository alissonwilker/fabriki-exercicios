/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elizeu Neto
 */
public class PessoaFisica extends Cliente {
    //Declaração das variavéis
    private String cpf;
    
    //Método Construtor
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
    
    //Método Getters
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
}
