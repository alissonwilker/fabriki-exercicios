
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramNomeCliente = request.getParameter("nomeCliente");
		String paramTipoCliente = request.getParameter("tipoCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramOperacao = request.getParameter("operacao");
		String paramDeposito = request.getParameter("valorDeposito");
		String paramSaque = request.getParameter("valorSaque");

		Cliente cliente;
		
		if (paramTipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		} else {
			cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		}
		
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		String resposta = "";
		
		int valorDeposito = 0;
		int valorSaque = 0;
		
		if (paramOperacao.equals("depositarValor") || paramOperacao.equals("sacarValor") || paramOperacao.equals("depositarSacarValor")) {
            if(paramDeposito.isEmpty() == false){
                valorDeposito = Integer.parseInt(paramDeposito);
            }
            if(paramSaque.isEmpty() == false){
                valorSaque = Integer.parseInt(paramSaque);
            }
        }
		
		switch (paramOperacao) {
		case "recuperarNomeCliente":
			resposta = cliente.getNome();
			break;
		case "recuperarCpfCliente":
			if (paramTipoCliente.equals("pessoaFisica")) {
				resposta = ((PessoaFisica)cliente).getCpf();
			}
			break;
		case "recuperarCnpjCliente":
			if (paramTipoCliente.equals("pessoaJuridica")) {
				resposta = ((PessoaJuridica)cliente).getCnpj();
			}
			break;
		case "recuperarSaldo":
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;
		case "depositarValor":
			contaBancaria.depositar(valorDeposito);
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;
		case "sacarValor":
			contaBancaria.sacar(valorSaque);
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;	
		case "depositarSacarValor":
			contaBancaria.depositar(valorDeposito);
			contaBancaria.sacar(valorSaque);
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;
		}
		
		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);
	}
	


}
