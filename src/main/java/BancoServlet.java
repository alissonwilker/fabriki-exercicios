

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String paramOperacao = req.getParameter("operacao");
		
		
		if (paramOperacao.equals("recuperarNomeCliente") ) {
			String nomeCliente = req.getParameter("nomeCliente");
			String cpfCnpj = req.getParameter("cpfCnpj");
			
			Cliente cliente = new PessoaFisica (nomeCliente, cpfCnpj);
			String resposta = cliente.getNome();
			req.setAttribute("resposta", resposta);
			
			
		}
		
		if (paramOperacao.equals("recuperarCpfCliente") ) {
			String cpf = req.getParameter("cpfCnpj");
			String resposta = cpf;
			req.setAttribute("resposta", resposta);
					
		}
		
		if (paramOperacao.equals("recuperarCnpjCliente") ) {
			String cnpj = req.getParameter("pessoaJuridica");
			String nomeCliente = req.getParameter("nomeCliente");
			PessoaJuridica cliente = new PessoaJuridica (nomeCliente, cnpj);
			String resposta = cliente.getCnpj();
			
			req.setAttribute("resposta", resposta);
					
		}
		
				
		if (paramOperacao.equals("depositarValor") ) {
			String nomeCliente = req.getParameter("nomeCliente");
			String cpfCnpj = req.getParameter("cpfCnpj");
			String paramDepositarValor = req.getParameter("valorDeposito" );
			int valorDeposito = Integer.parseInt(paramDepositarValor);
			Cliente cliente = new PessoaFisica (nomeCliente, cpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria (cliente);
			
			
			contaBancaria.depositar(valorDeposito);
			
			int resposta = valorDeposito;
			req.setAttribute("resposta", resposta);
					
		}
		
		if (paramOperacao.equals("recuperarSaldo") ) {
			String nomeCliente = req.getParameter("nomeCliente");
			String cpfCnpj = req.getParameter("cpfCnpj");
			String paramDepositarValor = req.getParameter("valorDeposito" );
			int valorDeposito = Integer.parseInt(paramDepositarValor);
			Cliente cliente = new PessoaFisica (nomeCliente, cpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria (cliente);
			contaBancaria.getSaldo();
			int resposta = valorDeposito;
			req.setAttribute("resposta", resposta);
					
		}
		
		if (paramOperacao.equals("sacarValor") ) {
			String nomeCliente = req.getParameter("nomeCliente");
			String cpfCnpj = req.getParameter("cpfCnpj");
			String paramSacarValor = req.getParameter("valorSaque" );
			int sacar  = Integer.parseInt(paramSacarValor);
			Cliente cliente = new PessoaFisica (nomeCliente, cpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria (cliente);
			
			
			contaBancaria.sacar(sacar);
			
			int resposta = sacar;
			req.setAttribute("resposta", resposta);
					
		}
		
		if (paramOperacao.equals("depositarSacarValor") ) {
			String nomeCliente = req.getParameter("nomeCliente");
			String cpfCnpj = req.getParameter("cpfCnpj");
			String paramSacarValor = req.getParameter("valorSaque" );
			String paramDepositarValor = req.getParameter("valorDeposito" );
			int valorDeposito = Integer.parseInt(paramDepositarValor);
			int sacar  = Integer.parseInt(paramSacarValor);
			Cliente cliente = new PessoaFisica (nomeCliente, cpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria (cliente);
			
			contaBancaria.depositar(valorDeposito);
			contaBancaria.sacar(sacar);
			
			int resposta = valorDeposito - sacar;
			req.setAttribute("resposta", resposta);
					
		}
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(req, resp);
	
	
	}
}
