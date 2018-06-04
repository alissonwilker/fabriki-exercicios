import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;


@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String operacaoBancaria = request.getParameter("operacao");
		String tipo = request.getParameter("tipoCliente");
		String resultado = null;
		if (operacaoBancaria.equals("recuperarNomeCliente")) {
			if (tipo.equals("pessoaFisica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");
				PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa, cpf);
				resultado = pessoaFisica.getNome();
			}
			if (tipo.equals("pessoaJuridica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoa, cnpj);
				resultado = pessoaJuridica.getNome();
			}
			
		}
		if (operacaoBancaria.equals("recuperarCpfCliente")) {
			if (tipo.equals("pessoaFisica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");
				PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa, cpf);
				resultado = pessoaFisica.getCpf();
			} 
		}
		if (operacaoBancaria.equals("recuperarCnpjCliente")) {
			if (tipo.equals("pessoaJuridica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoa, cnpj);
				resultado = pessoaJuridica.getCnpj();
			}
		}
		if (operacaoBancaria.equals("recuperarSaldo")) {
			if (tipo.equals("pessoaJuridica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoa, cnpj);
				ContaBancaria cliente = new ContaBancaria(pessoaJuridica);
				resultado = "" + cliente.getSaldo();
				
			}
			if (tipo.equals("pessoaFisica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");
				PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa, cpf);
				ContaBancaria cliente = new ContaBancaria(pessoaFisica);
				resultado = "" + cliente.getSaldo();
			}
		}
		if (operacaoBancaria.equals("depositarValor")) {
			if (tipo.equals("pessoaJuridica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoa, cnpj);
				ContaBancaria cliente = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				cliente.depositar(valorDeposito);
				resultado = "" + cliente.getSaldo();
			}
			if (tipo.equals("pessoaFisica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");
				PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa, cpf);
				ContaBancaria cliente = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				cliente.depositar(valorDeposito);
				resultado = "" + cliente.getSaldo();
			}
		}
		if (operacaoBancaria.equals("sacarValor")) {
			if (tipo.equals("pessoaJuridica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoa, cnpj);
				ContaBancaria cliente = new ContaBancaria(pessoaJuridica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				cliente.sacar(valorSaque);
				resultado = "" + cliente.getSaldo();
			}
			if (tipo.equals("pessoaFisica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");
				PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa, cpf);
				ContaBancaria cliente = new ContaBancaria(pessoaFisica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				cliente.sacar(valorSaque);
				resultado = "" + cliente.getSaldo();
			}
		}
		if (operacaoBancaria.equals("depositarSacarValor")) {
			if (tipo.equals("pessoaJuridica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoa, cnpj);
				ContaBancaria cliente = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				cliente.depositar(valorDeposito);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				cliente.sacar(valorSaque);
				resultado = "" + cliente.getSaldo();
			}
			if (tipo.equals("pessoaFisica")) {
				String nomePessoa = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");
				PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa, cpf);
				ContaBancaria cliente = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				cliente.depositar(valorDeposito);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				cliente.sacar(valorSaque);
				resultado = "" + cliente.getSaldo();
			}
		}
		request.setAttribute("resposta", resultado);
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 														
		dispatcher.forward(request, response); 
	}
}
