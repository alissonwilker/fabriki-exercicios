import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a classe ContaBancaria.
 *
 */
public class ContaBancariaTest {
    /**
     * Um cliente pessoa física para ser dono de conta bancária.
     */
    private Cliente pessoaFisica = new PessoaFisica("Carlos", "XXX.XXX.XXX-ZZ");

    /**
     * Um cliente pessoa jurídica para ser dono de conta bancária.
     */
    private Cliente pessoaJuridica = new PessoaJuridica("Eletromoveis Ltda.", "XX.XXX.XXX/0001-ZZ");

    /**
     * Testa se o saldo está sendo retornado corretamente.
     */
    @Test
    void testGetSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        assertEquals(0, contaBancaria.getSaldo());
    }

    /**
     * Testa um depósito com valor positivo.
     */
    @Test
    void testDepositarPositivo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

        int valorDeposito = 20;
        contaBancaria.depositar(valorDeposito);

        assertEquals(valorDeposito, contaBancaria.getSaldo());
    }

    /**
     * Testa um depósito com valor negativo.
     */
    @Test
    void testDepositarNegativo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

        int valorDeposito = -20;
        contaBancaria.depositar(valorDeposito);

        assertEquals(0, contaBancaria.getSaldo());
    }

    /**
     * Testa o caso de tentar sacar um valor maior do que o saldo.
     */
    @Test
    void testSacarMaiorQueSaldo() {
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
    void testSacarMenorQueSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        int valorDeposito = 20;
        contaBancaria.depositar(valorDeposito);

        int valorSaque = 5;
        contaBancaria.sacar(valorSaque);

        assertEquals(15, contaBancaria.getSaldo());
    }

    /**
     * Testa se os identificadores (ids) das contas bancárias estão sendo atribuídos corretamente.
     */
    @Test
    void testIdentificador() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        ContaBancaria novaContaBancaria = new ContaBancaria(pessoaJuridica);
        assertEquals(contaBancaria.getId() + 1, novaContaBancaria.getId());
    }

    /**
     * Testa a associação de conta bancária com cliente e vice-versa.
     */
    @Test
    void testCliente() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        assertEquals(contaBancaria.getCliente(), pessoaFisica);
        assertTrue(pessoaFisica.getContasBancarias().contains(contaBancaria));
        assertEquals(1, pessoaFisica.getContasBancarias().size());

        ContaBancaria novaContaBancaria = new ContaBancaria(pessoaFisica);

        assertEquals(novaContaBancaria.getCliente(), pessoaFisica);
        assertTrue(pessoaFisica.getContasBancarias().contains(novaContaBancaria));
        assertEquals(2, pessoaFisica.getContasBancarias().size());

        ContaBancaria outraContaBancaria = new ContaBancaria(pessoaJuridica);

        assertEquals(outraContaBancaria.getCliente(), pessoaJuridica);
        assertTrue(pessoaJuridica.getContasBancarias().contains(outraContaBancaria));
        assertEquals(1, pessoaJuridica.getContasBancarias().size());
    }
}
