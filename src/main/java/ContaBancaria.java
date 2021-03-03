public class ContaBancaria extends Object {
    private int saldo;
    private int id;
    private static int contador;
    private Cliente cliente;

    //Método construtor
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        ContaBancaria.contador++;
        this.id = ContaBancaria.contador;
    }

    public String realizar(String paramNome, String paramTipo, String paramDeposito, String paramSaque, String paramOperacao) {
    	String resposta = "";
    	if(paramOperacao.equals("recuperarNomeCliente")) {
    		resposta = cliente.getNome();
    	} else if (paramOperacao.equals("recuperarCpfCliente")){
    		resposta = ((PessoaFisica)cliente).getCpf();
    	} else if (paramOperacao.equals("recuperarCnpjCliente")){
    		resposta = ((PessoaJuridica)cliente).getCnpj();
    	} else if (paramOperacao.equals("recuperarSaldo")){
    		resposta = ""+getSaldo();
    	} else if (paramOperacao.equals("depositarValor")){
    		resposta = ""+depositar(Integer.parseInt(paramDeposito));
    	} else if (paramOperacao.equals("sacarValor")){
    		resposta = ""+sacar(Integer.parseInt(paramSaque));
    	} else if (paramOperacao.equals("depositarSacarValor")) {
    		depositar(Integer.parseInt(paramDeposito));
    		sacar(Integer.parseInt(paramSaque));
    		resposta = ""+getSaldo();
    	}
    	return resposta;

    }

   
    public int getId() {
        return id;
    }

   public Cliente getCliente() {
        return cliente;
    }


    public int getSaldo() {
        return saldo;
    }



    public int depositar(int valorDeposito){
        if(valorDeposito>0){
            //saída de dados
            this.saldo += valorDeposito;
            return this.saldo;
        }else{
            //saída de dados

        }
        return this.saldo;
    }

    public int sacar(int valorSaque){
        if(valorSaque>0 && valorSaque<=this.saldo){

            this.saldo -= valorSaque;
            return this.saldo;
        }
        return this.saldo;
    }


}
