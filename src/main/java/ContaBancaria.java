import static org.junit.Assert.*;

import org.junit.Test;


public class ContaBancaria{
   
    private Cliente pessoaFisica = new PessoaFisica("Carlos", "XXX.XXX.XXX-ZZ");

  
    private Cliente pessoaJuridica = new PessoaJuridica("Eletromoveis Ltda.", "XX.XXX.XXX/0001-ZZ");

    @Test
    public void testGetSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        assertEquals(0, contaBancaria.getSaldo());
    }

    @Test
    public void testDepositarPositivo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

        int valorDeposito = 20;
        contaBancaria.depositar(valorDeposito);

        assertEquals(valorDeposito, contaBancaria.getSaldo());
    }

    
    @Test
    public void testDepositarNegativo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

        int valorDeposito = -20;
        contaBancaria.depositar(valorDeposito);

        assertEquals(0, contaBancaria.getSaldo());
    }

   
    @Test
    public void testSacarMaiorQueSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        int valorDeposito = 10;
        contaBancaria.depositar(valorDeposito);

        int valorSaque = 20;
        contaBancaria.sacar(valorSaque);

        assertEquals(valorDeposito, contaBancaria.getSaldo());
    }

    @Test
    public void testSacarMenorQueSaldo() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        int valorDeposito = 20;
        contaBancaria.depositar(valorDeposito);

        int valorSaque = 5;
        contaBancaria.sacar(valorSaque);

        assertEquals(15, contaBancaria.getSaldo());
    }

    
    @Test
    public void testCliente() {
        ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

        assertEquals(contaBancaria.getCliente(), pessoaFisica);

        ContaBancaria novaContaBancaria = new ContaBancaria(pessoaJuridica);

        assertEquals(novaContaBancaria.getCliente(), pessoaJuridica);
    }
}
