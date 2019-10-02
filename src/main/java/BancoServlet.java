import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		PessoaFisica pf = null;
		PessoaJuridica pj = null;
		ContaBancaria cb = null;

		String nomeCliente = req.getParameter("nomeCliente");
		String tipoCliente = req.getParameter("tipoCliente");
		String cpfCnpj = req.getParameter("cpfCnpj");
		
		String operacao = req.getParameter("operacao");

		if (tipoCliente.equals("pessoaFisica")) {
			pf = new PessoaFisica(nomeCliente, cpfCnpj);
			cb = new ContaBancaria(pf);
		} else {
			pj = new PessoaJuridica(nomeCliente, cpfCnpj);
			cb = new ContaBancaria(pj);
		}
					
		if (operacao.equals("recuperarNomeCliente")) {
			String resposta = nomeCliente;
			req.setAttribute("resposta", resposta);
		} else if (operacao.equals("recuperarCpfCliente")) {
			String resposta = tipoCliente.equals("pessoaFisica") ? pf.getNome() : null;
			req.setAttribute("resposta", resposta);
		} else if (operacao.equals("recuperarCnpjCliente")) {
			String resposta = tipoCliente.equals("pessoaJuridica") ? pj.getNome() : null;
			req.setAttribute("resposta", resposta);
		} else if (operacao.equals("recuperarSaldo")) {
			int resposta = cb.getSaldo();
			req.setAttribute("resposta", resposta);
		} else if (operacao.equals("depositarValor")) {
			int valorDeposito = Integer.parseInt(req.getParameter("valorDeposito"));
			int resposta = cb.depositar(valorDeposito);
			req.setAttribute("resposta", resposta);
		} else if (operacao.equals("sacarValor")) {
			int valorSaque = Integer.parseInt(req.getParameter("valorSaque"));
			int resposta = cb.sacar(valorSaque);
			req.setAttribute("resposta", resposta);
		} else if (operacao.equals("depositarSacarValor")) {
			int valorDeposito = Integer.parseInt(req.getParameter("valorDeposito"));
			int valorSaque = Integer.parseInt(req.getParameter("valorSaque"));
			int valor = cb.depositar(valorDeposito);
			valor = cb.sacar(valorSaque);
			req.setAttribute("resposta", valor);
		}

		RequestDispatcher reqDispatcher = req.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(req, resp);

	}}
