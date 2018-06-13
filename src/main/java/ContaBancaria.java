
/**
 * Classe de teste para a classe ContaBancaria.
 *
 */
public class ContaBancariaTest {
    /**
     * Um cliente pessoa fÃ­sica para ser dono de conta bancÃ¡ria.
     */
    private Cliente pessoaFisica = new PessoaFisica("Carlos", "XXX.XXX.XXX-ZZ");

    /**
     * Um cliente pessoa jurÃ­dica para ser dono de conta bancÃ¡ria.
     */
    private Cliente pessoaJuridica = new PessoaJuridica("Eletromoveis Ltda.", "XX.XXX.XXX/0001-ZZ");

    /**
     * Testa se o saldo estÃ¡ sendo retornado corretamente.
     */
    @Test
    public void testGetSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        assertEquals(0, contaBancaria.getSaldo());
    }

    /**
     * Testa um depÃ³sito com valor positivo.
     */
    @Test
    public void testDepositarPositivo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

        int valorDeposito = 20;
        contaBancaria.depositar(valorDeposito);

        assertEquals(valorDeposito, contaBancaria.getSaldo());
    }

    /**
     * Testa um depÃ³sito com valor negativo.
     */
    @Test
    public void testDepositarNegativo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

        int valorDeposito = -20;
        contaBancaria.depositar(valorDeposito);

        assertEquals(0, contaBancaria.getSaldo());
    }

    /**
     * Testa o caso de tentar sacar um valor maior do que o saldo.
     */
    @Test
    public void testSacarMaiorQueSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        int valorDeposito = 10;
        contaBancaria.depositar(valorDeposito);

        int valorSaque = 20;
        contaBancaria.sacar(valorSaque);

        assertEquals(valorDeposito, contaBancaria.getSaldo());
    }

    /**
     * Testa o caso de tentar sacar um valor menor do que o saldo.
     */
    @Test
    public void testSacarMenorQueSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        int valorDeposito = 20;
        contaBancaria.depositar(valorDeposito);

        int valorSaque = 5;
        contaBancaria.sacar(valorSaque);

        assertEquals(15, contaBancaria.getSaldo());
    }

    /**
     * Testa a associaÃ§Ã£o de conta bancÃ¡ria com cliente e vice-versa.
     */
    @Test
    public void testCliente() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        assertEquals(contaBancaria.getCliente(), pessoaFisica);

        ContaBancaria novaContaBancaria = new ContaBancaria(pessoaJuridica);

        assertEquals(novaContaBancaria.getCliente(), pessoaJuridica);
    }
}
