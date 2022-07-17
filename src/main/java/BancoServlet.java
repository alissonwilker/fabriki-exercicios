

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BancoServlet")

public class BancoServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String paramNomeCliente = request.getParameter("NomeCliente");	
		String paramtipoCliente = request.getParameter("tipoCliente");
		String paramcpfCnpj = request.getParameter("cpfCnpj");
		String paramoperacao = request.getParameter("operacao");
		int paramvalorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
		int paramvalorSaque = Integer.parseInt(request.getParameter("valorSaque"));
		
		
		if (paramtipoCliente.equals("pessoaFisica")) {
			PessoaFisica pessoaFisica = new PessoaFisica(paramNomeCliente,paramcpfCnpj);	
			ContaBancaria conta = new ContaBancaria(pessoaFisica);
			if (paramoperacao.equals("operacaoRecuperarNomeCliente")) { 			
				request.setAttribute("resposta", pessoaFisica.getNome());
				}
			if (paramoperacao.equals("operacaoRecuperarCpfCliente"))  { 
				request.setAttribute("resposta", pessoaFisica.getCpf());
				}
			if (paramoperacao.equals("recuperarSaldo")) {
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			if (paramoperacao.equals("operacaoDepositarValor")) {
				conta.depositar(paramvalorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			if (paramoperacao.equals("operacaoSacarValor")) {
				conta.sacar(paramvalorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			if (paramoperacao.equals("operacaoDepositarSacarValor")) {
				conta.depositar(paramvalorDeposito);
				conta.sacar(paramvalorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}	
		}
		
			
		if (paramtipoCliente.equals("pessoaJuridica")) {
			PessoaJuridica pessoaJuridica = new PessoaJuridica(paramNomeCliente,paramcpfCnpj);	
			ContaBancaria conta = new ContaBancaria(pessoaJuridica);
			if (paramoperacao.equals("operacaoRecuperarNomeCliente")) { 			
				request.setAttribute("resposta", pessoaJuridica.getNome());
				}
			if (paramoperacao.equals("operacaoRecuperarCpfCliente"))  { 
				request.setAttribute("resposta", pessoaJuridica.getCnpj());
				}
			if (paramoperacao.equals("recuperarSaldo")) {
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			if (paramoperacao.equals("operacaoDepositarValor")) {
				conta.depositar(paramvalorDeposito);
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			if (paramoperacao.equals("operacaoSacarValor")) {
				conta.sacar(paramvalorSaque);
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			if (paramoperacao.equals("operacaoDepositarSacarValor")) {
				conta.depositar(paramvalorDeposito);
                                conta.sacar(paramvalorSaque);
				request.setAttribute("resposta", valor); 
				}	
		}
 
}
}
