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
	            contabancaria.depositar(deposito);	
	            resposta = Integer.toString(deposito);	
	            break;
	            
			case "recuperarSaldo":
	          saldo =  contabancaria.getSaldo();	
	            resposta = Integer.toString(saldo);
	            
	           break;
	            
			case "sacarValor":
				saque = Integer.parseInt(paramvalorSaque);	
	            contabancaria.sacar(saque);	
	            resposta = Integer.toString(saque);
	            
	        break;
	            
			case "depositarSacarValor":
				deposito = Integer.parseInt(paramvalorDeposito);
				saque = Integer.parseInt(paramvalorSaque);
	            contabancaria.depositar(deposito);  
	            contabancaria.sacar(saque);	
	            resposta =  Integer.toString(contabancaria.getSaldo());
	            
	               	            
	            
	            	
		}
		
		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);
	}
}





