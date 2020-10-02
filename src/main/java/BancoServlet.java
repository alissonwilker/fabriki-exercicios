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
		String paramvalorDeposito = request.getParameter("valorDeposito");
		String paramvalorSaque = request.getParameter("valorSaque");

		


		int deposito;
		int saldo;
		int saque;
		Cliente cliente;
		if (paramTipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		} else {
			cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		}
		ContaBancaria contabancaria = new ContaBancaria(cliente);


		String resposta = "";
		int respostaint = 0;
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
			case "depositarValor":
				deposito = Integer.parseInt(paramvalorDeposito);
				 respostaint    = contabancaria.depositar(deposito);
	         
	            break;
	            
			case "recuperarSaldo":
	          	
	            respostaint =  contabancaria.getSaldo();
	            
	           break;
	            
			case "sacarValor":
				saque = Integer.parseInt(paramvalorSaque);
	           
	            respostaint =  contabancaria.sacar(saque);	
	            
	        break;
	            
			case "depositarSacarValor":
				deposito = Integer.parseInt(paramvalorDeposito);
	             
				saque = Integer.parseInt(paramvalorSaque);
	           
	            respostaint =  contabancaria.depositar(deposito) +  contabancaria.sacar(saque);
	            
	               	            
	            
	            
		}
		
		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);
		
		request.setAttribute("resposta", respostaint);
		RequestDispatcher reqDispatcher2 = request.getRequestDispatcher("respostaint.jsp");
		reqDispatcher2.forward(request, response);
	}
}
