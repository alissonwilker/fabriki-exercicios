import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.*; 
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Contained;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


		String tipoCliente = request.getParameter("tipoCliente");

		String operacao = request.getParameter("operacao");


		HttpSession sessao = request.getSession();

		if (tipoCliente.equals("pessoaFisica")) {

			String nomePessoaFisica = request.getParameter("nomeCliente");
			String CPFpessoaFisica = request.getParameter("cpfCnpj");
			PessoaFisica pessoaFisica = new PessoaFisica(nomePessoaFisica, CPFpessoaFisica);

			if (operacao.equals("recuperarNomeCliente")) {

				request.setAttribute("resposta", pessoaFisica.getNome());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}


			if (operacao.equals("recuperarCpfCliente")) {

				request.setAttribute("resposta", pessoaFisica.getCpf());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);

			}

			if (operacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);


				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);

			}


			if (operacao.equals("depositarValor")) {

				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("sacarValor")) {

				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("depositarSacarValor")) {

				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);

				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}



		}else {

			String nomePessoaJuridica = request.getParameter("nomeCliente");
			String CPFpessoaJuridica = request.getParameter("cpfCnpj");
			PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoaJuridica, CPFpessoaJuridica);


			if (operacao.equals("recuperarNomeCliente")) {

				request.setAttribute("resposta", pessoaJuridica.getNome());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("recuperarCnpjCliente")) {

				request.setAttribute("resposta", pessoaJuridica.getCnpj());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);

			}

			if (operacao.equals("recuperarCnpjCliente")) {

				request.setAttribute("resposta", pessoaJuridica.getCnpj());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);

			}

			if (operacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);

				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);

			}


			if (operacao.equals("depositarValor")) {

				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}


			if (operacao.equals("sacarValor")) {

				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("depositarSacarValor")) {

				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);

				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.sacar(valorSaque);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

		}



		}
	}
