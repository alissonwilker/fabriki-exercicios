import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String nome = req.getParameter("nomeCliente");
		String cpf = req.getParameter("cpfCnpj");
		String cnpj = req.getParameter("cpfCnpj");
		String tipoCliente = req.getParameter("tipoCliente");
		String recuperar = req.getParameter("operacao");
		String deposito = req.getParameter("valorDeposito");
		String sacar = req.getParameter("valorSaque");

		PessoaFisica pf = new PessoaFisica(nome, cpf);
		PessoaJuridica pj = new PessoaJuridica(nome, cnpj);
		ContaBancaria conta = new ContaBancaria(0, pf, 0, 0);

		if (recuperar.equals("recuperarNomeCliente")) {
			req.setAttribute("pNome", nome);
		} 
		else if (recuperar.equals("recuperarCpfCliente")) {
			req.setAttribute("pCpf", cpf);
		} 
		else if (recuperar.equals("recuperarCnpjCliente")) {
			if (tipoCliente.equals("pessoaJuridica"))
				req.setAttribute("pCnpj", cnpj);
		} 
		else if (recuperar.equals("recuperarSaldo")) {
			req.setAttribute("pSaldo", conta.getSaldo());
		} 
		else if (recuperar.equals("depositarValor")) {
			int DepValor;
			DepValor = Integer.parseInt(deposito);
			if (DepValor > 0)
			req.setAttribute("pDeposito", conta.depositar(DepValor));
		} 
		else if (recuperar.equals("sacarValor")) {
			int SaqueValor;
			SaqueValor = Integer.parseInt(sacar);
			if (conta.getSaldo() <= SaqueValor)
				req.setAttribute("pSacar", conta.sacar(SaqueValor) - conta.getSaldo());
		}
		else if (recuperar.equals("depositarSacarValor")){ 
			 int valorDep; 
			 int valorSaq; 
			 valorDep = Integer.parseInt(deposito); 
			 valorSaq = Integer.parseInt(sacar); 
			 req.setAttribute("pDepositoSaque", conta.depositar(valorDep) + conta.sacar(valorSaq)); 
		}
		 
		RequestDispatcher dispatcher = req.getRequestDispatcher("resposta.jsp");
		dispatcher.forward(req, resp);
	}
}
