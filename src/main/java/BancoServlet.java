

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BancoServlet")

public class BancoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession(); 
		
	
		
		String NomeCliente = request.getParameter("NomeCliente");

		String tipoCliente = request.getParameter("tipoCliente");

		String cpfCnpj = request.getParameter("cpfCnpj");

		String operacao = request.getParameter("operacao");

		if (tipoCliente.equals("pessoaFisica")) {        	 
			PessoaFisica pessoaFisica = new PessoaFisica(NomeCliente,cpfCnpj);	
			
			if (operacao.equals("operacaoRecuperarNomeCliente")) { 
				request.setAttribute("resposta", pessoaFisica.getNome());
				}

			if (operacao.equals("operacaoRecuperarCpfCliente")) { 
				request.setAttribute("resposta", pessoaFisica.getCpf());
				}

			if (operacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoDepositarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoDepositarSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}
		}
		else {
			PessoaJuridica pessoaJuridica= new PessoaJuridica(NomeCliente,cpfCnpj);    	  
			
			if (operacao.equals("operacaoRecuperarNomeCliente")) { 
				request.setAttribute("resposta", pessoaJuridica.getNome()); 
				}

			if (operacao.equals("operacaoRecuperarCnpjCliente")) { 
				request.setAttribute("resposta", pessoaJuridica.getCnpj() ); 
				}
			
			if (operacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoDepositarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoDepositarSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo());
				}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
		dispatcher.forward(request, response);
	}
}
