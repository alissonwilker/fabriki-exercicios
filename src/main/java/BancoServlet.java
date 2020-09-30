import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String paramNomeCliente = request.getParameter("nomeCliente");
		String paramTipoCliente = request.getParameter("tipoCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramOperacao = request.getParameter("operacao");
		String paramvalorDeposito= request.getParameter("valorDeposito");
		String paramrecuperarSaldo= request.getParameter("recuperarSaldo");
		String paramrsacarValor= request.getParameter("sacarValor");

		


		Cliente cliente;
		if (paramTipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		} else {
			cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		}
		
		ContaBancaria contabancaria =  new ContaBancaria(cliente);
		
		int deposito;
	    int saque;
	    int valor;
		String resposta = "";
		switch (paramOperacao) {
		case "recuperarNomeCliente":
			resposta = cliente.getNome();
			
			request.setAttribute("resposta", resposta);
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
			reqDispatcher.forward(request, response);
			break;
		case "recuperarCpfCliente":
			if (paramTipoCliente.equals("pessoaFisica")) {
				resposta = ((PessoaFisica)cliente).getCpf();
				request.setAttribute("resposta", resposta);
				RequestDispatcher reqDispatcher2 = request.getRequestDispatcher("resposta.jsp");
				reqDispatcher2.forward(request, response);
			}
			
			break;
		case "recuperarCnpjCliente":
			if (paramTipoCliente.equals("pessoaJuridica")) {
				resposta = ((PessoaJuridica)cliente).getCnpj();
				request.setAttribute("resposta", resposta);
				RequestDispatcher reqDispatcher3 = request.getRequestDispatcher("resposta.jsp");
				reqDispatcher3.forward(request, response);
			}
			break;	
		case "depositarValor":
			deposito = Integer.parseInt(paramvalorDeposito);
            valor = contabancaria.depositar(deposito);
            request.setAttribute("valor", valor);
    		RequestDispatcher reqDispatcher4 = request.getRequestDispatcher("resposta.jsp");
    		reqDispatcher4.forward(request, response);			
		break;
		case"recuperarSaldo":
			valor = contabancaria.getSaldo();
            request.setAttribute("valor", valor);
    		RequestDispatcher reqDispatcher5 = request.getRequestDispatcher("resposta.jsp");
    		reqDispatcher5.forward(request, response);		
			
		case "sacarValor":
			saque = Integer.parseInt(paramrsacarValor);
            valor = contabancaria.sacar(saque);
            request.setAttribute("valor", valor);
    		RequestDispatcher reqDispatcher6 = request.getRequestDispatcher("resposta.jsp");
    		reqDispatcher6.forward(request, response);			
		break;
		}
		
		
	}	
}

