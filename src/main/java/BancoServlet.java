// arquivo BancoServlet.java
import java.io.IOException;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	String paramNomeCliente = req.getParameter("nomeCliente");
	String parameValorDeposito = req.getParameter("valorDeposito");
	String paramValorSaque = req.getParameter("valorSaque");
	String paramTipoOperacao = req.getParameter("operacao");
	String paramTipoCliente = req.getParameter("tipoCliente");
	String cpfCnpj= req.getParameter("cpfCnpj");
	
	if(paramValorSaque.equals("")) {
		paramValorSaque = "0";
	}
	if(parameValorDeposito.equals("")) {
		parameValorDeposito = "0";
	}
	
	Integer deposito = Integer.parseInt(parameValorDeposito);
	Integer saque = Integer.parseInt(paramValorSaque);
	
	if(paramTipoCliente.equals("pessoaFisica")) {
		PessoaFisica cliente = new PessoaFisica(paramNomeCliente, cpfCnpj);
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		executarOperacao(cliente, new PessoaJuridica("", ""), contaBancaria, paramTipoOperacao,
				saque, deposito, req, paramTipoCliente);
	} else {
		PessoaJuridica cliente = new PessoaJuridica(paramNomeCliente, cpfCnpj);
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		executarOperacao(new PessoaFisica(" ", ""), cliente, contaBancaria, paramTipoOperacao,
				saque, deposito, req, paramTipoCliente);
	}
			
	RequestDispatcher reqDispatcher = req.getRequestDispatcher("resposta.jsp");
	 reqDispatcher.forward(req, resp); 
	}
	
	protected void executarOperacao(PessoaFisica pessoaFisica, PessoaJuridica pessoaJuridica, ContaBancaria contaBancaria,
			String tipoOperacao, Integer saque, Integer deposito, HttpServletRequest req, String tipoCliente) {
		switch (tipoOperacao) {
		case "recuperarNomeCliente":
			if(tipoCliente.equals("pessoaFisica")) {
				req.setAttribute("resposta", pessoaFisica.getNome());
			} else {
				req.setAttribute("resposta", pessoaJuridica.getNome());
			}
			break;
			
		case "recuperarCpfCliente":
			
			req.setAttribute("resposta", pessoaFisica.getCpf());
			break;	
		case "recuperarCnpjCliente":
			
			req.setAttribute("resposta", pessoaJuridica.getCnpj());
			break;		
			
		case "recuperarSaldo":
			req.setAttribute("resposta", contaBancaria.getSaldo());
			break;
			
		case "depositarValor":
			
			contaBancaria.depositar(deposito);
			req.setAttribute("resposta", contaBancaria.getSaldo());
			break;
			
		case "sacarValor":
			contaBancaria.sacar(saque);
			req.setAttribute("resposta", contaBancaria.getSaldo());
			break;
			
		case "depositarSacarValor":
			contaBancaria.depositar(deposito);
			contaBancaria.sacar(saque);
			req.setAttribute("resposta", contaBancaria.getSaldo());
			break;
			
		}
	}
}
