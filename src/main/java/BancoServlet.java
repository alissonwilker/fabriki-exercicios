import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")

public class BancoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String paramNomeCliente = request.getParameter("NomeCliente");
		String paramtipoCliente = request.getParameter("tipoCliente");
		String paramcpfCnpj = request.getParameter("cpfCnpj");
		String paramoperacao = request.getParameter("operacao");

		if (paramtipoCliente.equals("pessoaFisica")) {        	 
			PessoaFisica pessoaFisica = new PessoaFisica(paramNomeCliente,paramcpfCnpj);	if (paramoperacao.equals("operacaoRecuperarNomeCliente")) { 
				request.setAttribute("resposta", pessoaFisica.getNome());
				}

			if (paramoperacao.equals("operacaoRecuperarCpfCliente")) { 
				request.setAttribute("resposta", pessoaFisica.getCpf());
				}

			if (paramoperacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (paramoperacao.equals("operacaoDepositarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (paramoperacao.equals("operacaoSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (paramoperacao.equals("operacaoDepositarSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}
		}
		else {
			PessoaJuridica pessoaJuridica= new PessoaJuridica(paramNomeCliente,paramcpfCnpj);    	  
			
			if (paramoperacao.equals("operacaoRecuperarNomeCliente")) { 
				request.setAttribute("resposta", pessoaJuridica.getNome()); 
				}

			if (paramoperacao.equals("operacaoRecuperarCnpjCliente")) { 
				request.setAttribute("resposta", pessoaJuridica.getCnpj() ); 
				}
			
			if (paramoperacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (paramoperacao.equals("operacaoDepositarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (paramoperacao.equals("operacaoSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}

			if (paramoperacao.equals("operacaoDepositarSacarValor")) {
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
