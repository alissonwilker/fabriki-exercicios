public class BancoBusiness {
    public static enum TipoCliente {
        pessoaFisica, pessoaJuridica
    }

    /**
     * Deposita um valor e em seguida saca outro valor, retornando o novo saldo.
     * @param contaBancaria A conta bancaria na qual deve ser realizada a operacao.
     * @param valorDeposito O valor a ser depositado na conta.
     * @param valorSaque O valor a ser sacado da conta.
     * @return O novo saldo apos as operacoes de deposito e saque.
     */
    public Integer depositarSacarValor(ContaBancaria contaBancaria, int valorDeposito, int valorSaque) {
		return valorSaque;
        // TODO IMPLEMENTE O CODIGO DESTE METODO.
    }

    public Integer sacarValor(ContaBancaria contaBancaria, int valorSaque) {
        if (contaBancaria != null) {
            int saldo = contaBancaria.sacar(valorSaque);
            return saldo;
        }
        return null;
    }

    public Integer depositarValor(ContaBancaria contaBancaria, int valorDeposito) {
        if (contaBancaria != null) {
            contaBancaria.depositar(valorDeposito);
            return contaBancaria.getSaldo();
        }
        return null;
    }

    public Integer recuperarSaldo(ContaBancaria contaBancaria) {
        if (contaBancaria != null) {
            int saldo = contaBancaria.getSaldo();
            return saldo;
        }
        return null;
    }

    public String recuperarCnpjCliente(ContaBancaria contaBancaria) {
        if (contaBancaria != null) {
            Cliente cliente = contaBancaria.getCliente();
            if (cliente instanceof PessoaJuridica) {
                return ((PessoaJuridica) cliente).getCnpj();
            }
        }
        return null;
    }

    /**
     * Recupera o CPF do cliente (dono) da conta bancaria.
     * @param contaBancaria A conta bancaria cujo CPF do cliente (dono) deve ser recuperado.
     * @return O CPF do cliente (dono) da conta bancaria.
     */
    public String recuperarCpfCliente(ContaBancaria contaBancaria) {
		return null;
        // TODO IMPLEMENTE O CODIGO DESTE METODO.
   }

    public String recuperarNomeCliente(ContaBancaria contaBancaria) {
        if (contaBancaria != null) {
            return contaBancaria.getCliente().getNome();
        }
        return null;
    }

    /**
     * Cria uma conta bancaria de Pessoa Fisica ou de Pessoa Juridica, de acordo com o tipo de cliente.
     * @param nomeCliente O nome do cliente (dono) da conta bancaria.
     * @param cpfCnpj O CPF ou CNPJ do cliente (dono) da conta bancaria.
     * @param tipoCliente O tipo de cliente (Pessoa Fisica ou Pessoa Juridica).
     * @return 
     */
    public ContaBancaria criarContaBancaria(String nomeCliente, String cpfCnpj, TipoCliente tipoCliente) {
		return null;
        // TODO IMPLEMENTE O CODIGO DESTE METODO.
    }
}
