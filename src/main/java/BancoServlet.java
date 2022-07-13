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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramNome = request.getParameter("nomeCliente");
		String paramCliente = request.getParameter("tipoCliente");
		String paramOperacao= request.getParameter("operacao");
		String paramDeposito = request.getParameter("valorDeposito");
		String paramSaque = request.getParameter("valorSaque");
		String paramCpfCnpj = request.getParameter("cpfCnpj");

		String resultado = null;

		Cliente cliente;

		if (paramCliente.equals("pessoaFisica")) {

			PessoaFisica fisica = new PessoaFisica (paramNome, paramCpfCnpj);
		    if (paramOperacao.equals("recuperarNomeCliente")){
		    	resultado = fisica.getNome();			
		    }
		    if (paramOperacao.equals("recuperarCpfCliente")) {		    	
		    	resultado = fisica.getCpf();		    	
		    }

		    cliente = fisica;
		}  else {

			PessoaJuridica juridica = new PessoaJuridica (paramNome, paramCpfCnpj);
			if (paramOperacao.equals("recuperarNomeCliente")){
				resultado = juridica.getNome();
			}
			if (paramOperacao.equals("recuperarCnpjCliente")) {
				resultado = juridica.getCnpj();
			}

			cliente = juridica;
		}

		ContaBancaria conta= new ContaBancaria(cliente);
		if (paramOperacao.equals("recuperarSaldo")) {
			resultado = ""+conta.getSaldo();

		}else if (paramOperacao.equals("depositarValor")) {

			int deposito = Integer.parseInt(paramDeposito);
			conta.depositar(deposito); 
			resultado = ""+conta.getSaldo();

		}else if (paramOperacao.equals("sacarValor")) {
			int saque = Integer.parseInt(paramSaque);
			resultado = ""+conta.sacar(saque);

		}else if (paramOperacao.equals("depositarSacarValor")) {

			int deposito = Integer.parseInt(paramDeposito);
			conta.depositar(deposito);
			int saque = Integer.parseInt(paramSaque);
			resultado = ""+conta.sacar(saque);

		}



		request.setAttribute("resposta", resultado);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);
	}

}
