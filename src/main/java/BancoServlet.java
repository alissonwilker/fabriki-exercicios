import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/BancoServlet")

public class BancoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String nome = request.getParameter("nomeCliente");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String operacao = request.getParameter("operacao");
		String valorDeposito = request.getParameter("valorDeposito");
		String valorSaque = request.getParameter("valorSaque");
		
		String resposta;
				
		PessoaJuridica cnpj = new PessoaJuridica(nome, cpfCnpj);
		
		PessoaFisica cpf = new PessoaFisica(nome, cpfCnpj);
		
		ContaBancaria conta = new ContaBancaria(cpf);
		
		if (tipoCliente == "pessoaFisica" && operacao == "operacaoRecuperarCpfCliente") {
			cpf.setCpf(cpfCnpj);
			resposta = cpf.getCpf();
			
			if (operacao.equals("recuperarNomeCliente")) {
				cpf.setNome(nome);
				resposta = cpf.getNome();
			}
		}
		
		if (tipoCliente == "pessoaJuridica" && operacao == "operacaoRecuperarCnpjCliente") {
			cnpj.setCnpj(cpfCnpj);
			resposta = cpfCnpj;
			
			if (operacao.equals("recuperarNomeCliente")) {
				cnpj.setNome(nome);
				resposta = cnpj.getNome();
			}
		}

		if (operacao == "operacaoRecuperarSaldo") {
			resposta = conta.getSaldo();
		}
		
		request.setAttribute("resposta", resposta);
		request.getRequestDispatcher("resposta.jsp").forward(request, response);

	}
}
