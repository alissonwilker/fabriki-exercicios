import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    enum OperacaoContaBancaria {
    	recuperarNomeCliente, recuperarCpfCliente, recuperarCnpjCliente, recuperarSaldo, 
    	depositarValor, sacarValor, depositarSacarValor
    }

    enum Tipo_de_cliente {
        pessoaFisica, pessoaJuridica
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	
        String nome_cliente = request.getParameter("nomeCliente");
        String cpf_cnpj = request.getParameter("cpfCnpj");
        String valor_deposito = request.getParameter("valorDeposito");
        String valor_saque = request.getParameter("valorSaque");

        String tipo_cliente = request.getParameter("tipoCliente");
        Tipo_de_cliente tipoCliente = Enum.valueOf(Tipo_de_cliente.class, tipo_cliente);

        String operacao_string = request.getParameter("operacao");
        OperacaoContaBancaria operacao = Enum.valueOf(OperacaoContaBancaria.class, operacao_string);

        ContaBancaria conta_bancaria = criar_conta_bancaria(nome_cliente, cpf_cnpj, tipoCliente);
        
        
        Object resposta = null;
        if(operacao == OperacaoContaBancaria.recuperarNomeCliente) {
        	resposta = conta_bancaria.getCliente().getNome();
    	} else if(operacao == OperacaoContaBancaria.recuperarCpfCliente) {
        	resposta = ((PessoaFisica) conta_bancaria.getCliente()).getCpf();
        } else if(operacao == OperacaoContaBancaria.recuperarCnpjCliente) {
        	resposta = ((PessoaJuridica) conta_bancaria.getCliente()).getCnpj();
        } else if(operacao == OperacaoContaBancaria.recuperarSaldo) {
        	resposta = conta_bancaria.getSaldo();
        } else if(operacao == OperacaoContaBancaria.depositarValor) {
        	conta_bancaria.depositar(Integer.parseInt(valor_deposito));
        	resposta = conta_bancaria.getSaldo();
        } else if(operacao == OperacaoContaBancaria.sacarValor) {
        	conta_bancaria.sacar(Integer.parseInt(valor_saque));
        	resposta = conta_bancaria.getSaldo();
        } else if(operacao == OperacaoContaBancaria.depositarSacarValor) {
        	conta_bancaria.depositar(Integer.parseInt(valor_deposito));
        	conta_bancaria.sacar(Integer.parseInt(valor_saque));
        	resposta = conta_bancaria.getSaldo();
        }
        
        request.setAttribute("resposta", resposta);
        request.getRequestDispatcher("resposta.jsp").forward(request, response);
    }

    ContaBancaria criar_conta_bancaria(String nome_cliente, String cpf_cnpj, Tipo_de_cliente tipoCliente) {
        ContaBancaria conta_bancaria;
        if (Tipo_de_cliente.pessoaFisica.equals(tipoCliente)) {
        	conta_bancaria = new ContaBancaria(new PessoaFisica(nome_cliente, cpf_cnpj));
        } else {
        	conta_bancaria = new ContaBancaria(new PessoaJuridica(nome_cliente, cpf_cnpj));
        }
        return conta_bancaria;
    }
}
