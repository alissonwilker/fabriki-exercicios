

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
		
		String paramtipoCliente = request.getParameter("tipoCliente");
		String paramoperacao = request.getParameter("operacao");
		String VALOR_DEPOSITO = request.getParameter("valorDeposito");
		String VALOR_SAQUE = request.getParameter("valorSaque");
	
		
		if (paramtipoCliente.equals("pessoaFisica")) {
			String CPF_CLIENTE = request.getParameter("cpfCnpj");
			String NOME_CLIENTE_PESSOA_FISICA = request.getParameter("nomeCliente");	
			PessoaFisica pessoaFisica = new PessoaFisica(NOME_CLIENTE_PESSOA_FISICA, CPF_CLIENTE);
			
			ContaBancaria conta = new ContaBancaria(pessoaFisica);
			
			
			if (paramoperacao.equals("recuperarNomeCliente")) { 			
				request.setAttribute("resposta", pessoaFisica.getNome());
				}
			else if (paramoperacao.equals("recuperarCpfCliente"))  { 
				request.setAttribute("resposta", pessoaFisica.getCpf());
				}
			else if (paramoperacao.equals("recuperarSaldo")) {
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			else if (paramoperacao.equals("depositarValor")) {
				conta.depositar(Integer.parseInt(VALOR_DEPOSITO));
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			else if (paramoperacao.equals("sacarValor")) {
				conta.sacar(Integer.parseInt(VALOR_SAQUE));
				request.setAttribute("resposta", conta.getSaldo()); 
				}
			else if (paramoperacao.equals("depositarSacarValor")) {
				conta.depositar(Integer.parseInt(VALOR_DEPOSITO));
				conta.sacar(Integer.parseInt(VALOR_SAQUE));
				request.setAttribute("resposta", conta.getSaldo());				
				}	
		}
		
			
		if (paramtipoCliente.equals("pessoaJuridica")) {
			String CNPJ_CLIENTE = request.getParameter("cpfCnpj");
			String NOME_CLIENTE_PESSOA_JURIDICA = request.getParameter("nomeCliente");	
			PessoaJuridica pessoaJuridica = new PessoaJuridica(NOME_CLIENTE_PESSOA_JURIDICA,CNPJ_CLIENTE);	
			ContaBancaria conta = new ContaBancaria(pessoaJuridica);
			
			
			if (paramoperacao.equals("recuperarNomeCliente")) { 			
				request.setAttribute("resposta", pessoaJuridica.getNome());
			
				}
			else if (paramoperacao.equals("recuperarCnpjCliente"))  { 
				request.setAttribute("resposta", pessoaJuridica.getCnpj());

				}
			else if (paramoperacao.equals("recuperarSaldo")) {
				request.setAttribute("resposta", conta.getSaldo()); 
				
				}
			else if (paramoperacao.equals("depositarValor")) {
				conta.depositar(Integer.parseInt(VALOR_DEPOSITO));
				request.setAttribute("resposta", conta.getSaldo());
			
				}
			else if (paramoperacao.equals("sacarValor")) {
				conta.sacar(Integer.parseInt(VALOR_SAQUE));
				request.setAttribute("resposta", conta.getSaldo()); 
				
				}
			else if (paramoperacao.equals("depositarSacarValor")) {
				conta.depositar(Integer.parseInt(VALOR_DEPOSITO));
				conta.sacar(Integer.parseInt(VALOR_SAQUE));
				request.setAttribute("resposta", conta.getSaldo()); 
				
				}	
		}
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
}
}
