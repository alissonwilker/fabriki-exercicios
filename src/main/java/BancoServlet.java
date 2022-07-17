

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/BancoServlet")

public class BancoServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
		String tipoCliente = request.getParameter("tipoCliente");
		String operacao = request.getParameter("operacao");
		int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
		int valorSaque = Integer.parseInt(request.getParameter("valorDeposito"));


		if (tipoCliente.equals("pessoaFisica")) {    
			String NomeCliente = request.getParameter("NomeCliente");
			String cpfCnpj = request.getParameter("cpfCnpj");
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
	
				conta.depositar(valorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
			    conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoDepositarSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				
				conta.depositar(valorDeposito);
				
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
			dispatcher.forward(request, response);
		}
		
		
		if (tipoCliente.equals("pessoaJuridica")) {  
			String NomeCliente = request.getParameter("NomeCliente");
			String cpfCnpj = request.getParameter("cpfCnpj");
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
				conta.depositar(valorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (operacao.equals("operacaoDepositarSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				conta.depositar(valorDeposito);
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo());
				}
			RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
			dispatcher.forward(request, response);
		}

	}
}
