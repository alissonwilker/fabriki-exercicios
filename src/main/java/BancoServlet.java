import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BancoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PessoaFisica pessoaFisica;
	private PessoaJuridica pessoaJuridica;
	private String nomeCliente;

	private ContaBancaria conta;
	private String resposta = "";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String tipoCliente = req.getParameter("tipoCliente");
		Integer valorDeposito = (req.getParameter("valorDeposito").equals(""))? 0 : Integer.parseInt(req.getParameter("valorDeposito"));
		Integer valorSaque = (req.getParameter("valorSaque").equals(""))? 0 : Integer.parseInt(req.getParameter("valorSaque"));

		if(tipoCliente.equals("pessoaFisica")) {
			this.pessoaFisica = new PessoaFisica(req.getParameter("nomeCliente"), req.getParameter("cpfCnpj"));
			this.conta = new ContaBancaria(this.pessoaFisica);
			this.nomeCliente = this.pessoaFisica.getNome();
		}else {
			this.pessoaJuridica = new PessoaJuridica(req.getParameter("nomeCliente"), req.getParameter("cpfCnpj"));
			this.conta = new ContaBancaria(this.pessoaJuridica);
			this.nomeCliente = this.pessoaJuridica.getNome();
		}
		
		String operacao = req.getParameter("operacao");
		
		switch (operacao) {
		case "recuperarNomeCliente":
			this.resposta = this.nomeCliente;
			break;
		case "recuperarCpfCliente":
			this.resposta = this.pessoaFisica.getCpf();
			break;
		case "recuperarCnpjCliente":
			this.resposta = this.pessoaJuridica.getCnpj();
			break;
		case "recuperarSaldo":
			this.resposta = ""+this.conta.getSaldo();
			break;
		case "depositarValor":
			this.conta.depositar(valorDeposito);
			this.resposta = ""+this.conta.getSaldo();
			break;
		case "sacarValor":
			this.conta.sacar(valorSaque);
			this.resposta = ""+this.conta.getSaldo();
			break;
		case "depositarSacarValor":
			this.conta.depositar(valorDeposito);
			this.conta.sacar(valorSaque);
			this.resposta = ""+this.conta.getSaldo();
			break;

		default:
			break;
		}

		req.setAttribute("resposta", this.resposta);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/resposta.jsp");
        dispatcher.forward(req, resp);
	}
}
