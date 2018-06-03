
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")

public class BancoSerlvet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String paramTipo = request.getParameter("tipoCliente");
		String resposta = null;
		String paramOperacao = request.getParameter("operacao");
		
		// metodo 1
		if (paramOperacao.equals("recuperarNomeCliente")) {
			if (paramTipo.equals("pessoaFisica")) {
				String nome = request.getParameter("nomeCliente");
				String cpf = request.getParameter("cpfCnpj");
				
				PessoaFisica pf1 = new PessoaFisica(nome, cpf);
				resposta = pf1.getNome();

			} 
			
			if (paramTipo.equals("pessoaJuridica")) {
				String nome = request.getParameter("nomeCliente");
				String cnpj = request.getParameter("cpfCnpj");
				
				PessoaJuridica pj1 = new PessoaJuridica(nome, cnpj);
				resposta = pj1.getNome();

			}
			

		}
		// metodo 2
		if (paramOperacao.equals("recuperarCpfCliente")) {
			if (paramTipo.equals("pessoaFisica")) {

				String cpf = request.getParameter("cpfCnpj");
				String nome = request.getParameter("nomeCliente");
				PessoaFisica pf1 = new PessoaFisica(nome, cpf);
				resposta = pf1.getCpf();
			} 

			}
			// metodo 3
			if (paramOperacao.equals("recuperarCnpjCliente")) {
				if (paramTipo.equals("pessoaJuridica")) {

					String cnpj = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaJuridica pj1 = new PessoaJuridica(nome, cnpj);
					resposta = pj1.getCnpj();
				} 
			
			}
			// metodo 4
			if (paramOperacao.equals("recuperarSaldo")) {
				if (paramTipo.equals("pessoaFisica")) {

					String cpf = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaFisica pf1 = new PessoaFisica(nome, cpf);
					ContaBancaria f1 = new ContaBancaria(pf1);
					resposta = "Saldo de: " + f1.getSaldo();
				}
				if (paramTipo.equals("pessoaJuridica")) {

					String cnpj = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaJuridica pj1 = new PessoaJuridica(nome, cnpj);
					ContaBancaria j1 = new ContaBancaria(pj1);
					resposta = "Saldo de: " + j1.getSaldo();
				}
			}
			
			//metodo 5
			if (paramOperacao.equals("depositarValor")) {
				if (paramTipo.equals("pessoaFisica")) {

					String cpf = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaFisica pf1 = new PessoaFisica(nome, cpf);
					ContaBancaria f1 = new ContaBancaria(pf1);
					int depot = Integer.parseInt(request.getParameter("valorDeposito"));
					f1.depositar(depot);
					resposta = "saldo :" +f1.getSaldo();
				}
				if (paramTipo.equals("pessoaJuridica")) {

					String cnpj = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaJuridica pj1 = new PessoaJuridica(nome, cnpj);
					ContaBancaria j1 = new ContaBancaria(pj1);
					int depot = Integer.parseInt(request.getParameter("valorDeposito"));
					j1.depositar(depot);
					resposta = "saldo :" +j1.getSaldo();
				}
			}
			//metodo6
			if (paramOperacao.equals("sacarValor")) {
				if (paramTipo.equals("pessoaFisica")) {

					String cpf = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaFisica pf1 = new PessoaFisica(nome, cpf);
					ContaBancaria f1 = new ContaBancaria(pf1);
					int draw = Integer.parseInt(request.getParameter("valorSaque"));
					f1.sacar(draw);
					resposta = "saldo :" +f1.getSaldo();
				}
				if (paramTipo.equals("pessoaJuridica")) {

					String cnpj = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaJuridica pj1 = new PessoaJuridica(nome, cnpj);
					ContaBancaria j1 = new ContaBancaria(pj1);
					int draw = Integer.parseInt(request.getParameter("valorSaque"));
					j1.sacar(draw);
					resposta = "saldo :" +j1.getSaldo();
				}
			}
			//metodo 7
			if (paramOperacao.equals("depositarSacarValor")) {
				if (paramTipo.equals("pessoaFisica")) {

					String cpf = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaFisica pf1 = new PessoaFisica(nome, cpf);
					ContaBancaria f1 = new ContaBancaria(pf1);
					int depot = Integer.parseInt(request.getParameter("valorDeposito"));
					int draw = Integer.parseInt(request.getParameter("valorSaque"));
					f1.depositar(depot);
					f1.sacar(draw);
					resposta = "saldo final :" +f1.getSaldo();
				}
				if (paramTipo.equals("pessoaJuridica")) {

					String cnpj = request.getParameter("cpfCnpj");
					String nome = request.getParameter("nomeCliente");
					PessoaJuridica pj1 = new PessoaJuridica(nome, cnpj);
					ContaBancaria j1 = new ContaBancaria(pj1);
					int depot = Integer.parseInt(request.getParameter("valorDeposito"));
					int draw = Integer.parseInt(request.getParameter("valorSaque"));
					j1.depositar(depot);
					j1.sacar(draw);
					resposta = "saldo final :" +j1.getSaldo();
				}
			}

			request.setAttribute("resposta", resposta);
			RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); // .forward(request,
																							// response);

			dispatcher.forward(request, response);
		}
	
}

