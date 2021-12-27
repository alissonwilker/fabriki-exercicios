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
	String parametroValorDeposito = req.getParameter("valorDeposito");
	String parametroValorSaque = req.getParameter("valorSaque");
	String parametroNomeCliente = req.getParameter("nomeCliente");
	String parametroTipoOperacao = req.getParameter("operacao");
	String cpfCnpj= req.getParameter("cpfCnpj");
	String parametroTipoCliente = req.getParameter("tipoCliente");
	if(parametroValorSaque.equals("")) {
		parametroValorSaque = "0";
	}
	if(parametroValorDeposito.equals("")) {
		parametroValorDeposito = "0";
	}
	Integer saque = Integer.parseInt(parametroValorSaque);
	Integer deposito = Integer.parseInt(parametroValorDeposito);
	if(parametroTipoCliente.equals("pessoaFisica")) {
		PessoaFisica cliente = new PessoaFisica(parametroNomeCliente, cpfCnpj);
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		executarOperacao(cliente, new PessoaJuridica("", ""), contaBancaria, parametroTipoOperacao,
				saque, deposito, req, parametroTipoCliente);
	} else {
		PessoaJuridica cliente = new PessoaJuridica(parametroNomeCliente, cpfCnpj);
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		executarOperacao(new PessoaFisica(" ", ""), cliente, contaBancaria, parametroTipoOperacao,
				saque, deposito, req, parametroTipoCliente);
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
