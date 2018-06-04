
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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String paramTipo = request.getParameter("tipoCliente");
		String resposta = null;
		String paramOperacao = request.getParameter("operacao");		
		if (paramOperacao.equals("recuperarNomeCliente")) {
			if (paramTipo.equals("pessoaFisica")) {
				String nome = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");			
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				resposta = pessoaFisica.getNome();
			} 			
			if (paramTipo.equals("pessoaJuridica")) {
				String nome = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");			
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				resposta = pessoaJuridica.getNome();
			}
		}	
		if (paramOperacao.equals("recuperarCpfCliente")) {
			if (paramTipo.equals("pessoaFisica")) {
				String cpf = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				resposta = pessoaFisica.getCpf();
			} 
		}			
		if (paramOperacao.equals("recuperarCnpjCliente")) {
			if (paramTipo.equals("pessoaJuridica")) {
				String cnpj = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				resposta = pessoaJuridica.getCnpj();
				} 	
		}
		if (paramOperacao.equals("recuperarSaldo")) {
			if (paramTipo.equals("pessoaFisica")) {
				String cpf = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				ContaBancaria contaPessoaFisica = new ContaBancaria(pessoaFisica);
				resposta = "Saldo de: " + contaPessoaFisica.getSaldo();
			}
			if (paramTipo.equals("pessoaJuridica")) {
				String cnpj = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				ContaBancaria contaPessoaJuridica = new ContaBancaria(pessoaJuridica);
				resposta = "Saldo de: " + contaPessoaJuridica.getSaldo();
			}
		}
		if (paramOperacao.equals("depositarValor")) {
			if (paramTipo.equals("pessoaFisica")) {
				String cpf = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				ContaBancaria contaPessoaFisica = new ContaBancaria(pessoaFisica);
				int depot = Integer.parseInt(request.getParameter("valorDeposito"));
				contaPessoaFisica.depositar(depot);
				resposta = "saldo :" +contaPessoaFisica.getSaldo();
			}
			if (paramTipo.equals("pessoaJuridica")) {
				String cnpj = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				ContaBancaria contaPessoaJuridica = new ContaBancaria(pessoaJuridica);
				int depot = Integer.parseInt(request.getParameter("valorDeposito"));
				contaPessoaJuridica.depositar(depot);
				resposta = "saldo :" +contaPessoaJuridica.getSaldo();
			}
		}
		if (paramOperacao.equals("sacarValor")) {
			if (paramTipo.equals("pessoaFisica")) {
				String cpf = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				ContaBancaria contaPessoaFisica = new ContaBancaria(pessoaFisica);
				int draw = Integer.parseInt(request.getParameter("valorSaque"));
				contaPessoaFisica.sacar(draw);
				resposta = "saldo :" +contaPessoaFisica.getSaldo();
			}
			if (paramTipo.equals("pessoaJuridica")) {
				String cnpj = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				ContaBancaria contaPessoaJuridica = new ContaBancaria(pessoaJuridica);
				int draw = Integer.parseInt(request.getParameter("valorSaque"));
				contaPessoaJuridica.sacar(draw);
				resposta = "saldo :" +contaPessoaJuridica.getSaldo();
			}
		}
		if (paramOperacao.equals("depositarSacarValor")) {
			if (paramTipo.equals("pessoaFisica")) {
				String cpf = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				ContaBancaria contaPessoaFisica = new ContaBancaria(pessoaFisica);
				int depot = Integer.parseInt(request.getParameter("valorDeposito"));
				int draw = Integer.parseInt(request.getParameter("valorSaque"));
				contaPessoaFisica.depositar(depot);
				contaPessoaFisica.sacar(draw);
				resposta = "saldo final :" +contaPessoaFisica.getSaldo();
			}
			if (paramTipo.equals("pessoaJuridica")) {
				String cnpj = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				ContaBancaria contaPessoaJuridica = new ContaBancaria(pessoaJuridica);
				int depot = Integer.parseInt(request.getParameter("valorDeposito"));
				int draw = Integer.parseInt(request.getParameter("valorSaque"));
				contaPessoaJuridica.depositar(depot);
				contaPessoaJuridica.sacar(draw);
				resposta = "saldo final :" +contaPessoaJuridica.getSaldo();
			}
		}
		request.setAttribute("resposta", resposta);
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
		dispatcher.forward(request, response);
	}
}
