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
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramNomeCliente = request.getParameter("nomeCliente");
		String paramTipoCliente = request.getParameter("TipoCliente");
		String paramOperacao = request.getParameter("operacao");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramValorDeposito = request.getParameter("valorDeposito");
		String paramValorSaque = request.getParameter("valorSaque");
		String resposta="";
		
		Cliente cliente = null;
		ContaBancaria contaBancaria;
	
	if(paramTipoCliente.equals("pessoaFisica")) {
		PessoaFisica cliente2 = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		cliente = cliente2;
		if (paramOperacao.equals("recuperarCpfCliente")) {						
			resposta = cliente2.getCpf();
		} else if (paramOperacao.equals("recuperarCnpjCliente")) {
			resposta = "A requisição de CNPJ não se aplica para Pessoa Física";
		}
	} else {
		PessoaJuridica cliente2 = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		cliente = cliente2;
		if (paramOperacao.equals("recuperarCnpjCliente")) {			
			resposta = cliente2.getCnpj();       
		} else if (paramOperacao.equals("recuperarCpfCliente")) {
			resposta = "A requisição de CPF não se aplica para Pessoa Jurídica";
		}
	}
	contaBancaria = new ContaBancaria(cliente);
	
	
	if (paramOperacao.equals("recuperarNomeCliente")) {
		resposta = cliente.getNome();
	} else if (paramOperacao.equals("recuperarSaldo")) {
		int saldo = contaBancaria.getSaldo();
		resposta = "O saldo da conta é " + saldo;	
	} else if (paramOperacao.equals("depositarValor")) {
		int valor = Integer.parseInt(paramValorDeposito);
		contaBancaria.depositar(valor);
		resposta = "O valor de " + valor + " foi depositado na conta.";
	} else if (paramOperacao.equals("sacarValor")) {
		int valor = Integer.parseInt(paramValorSaque);
		if (contaBancaria.sacar(valor)==contaBancaria.getSaldo()) {
			resposta = "Não foi possível fazer o saque no valor de " + paramValorSaque +".";
		} else {
			resposta = "Saque de " + paramValorSaque + " realizado com sucesso.";
		}
	} else if (paramOperacao.equals("depositarSacarValor")) {
		int valor = Integer.parseInt(paramValorDeposito);
		contaBancaria.depositar(valor);
		resposta = "O valor de " + valor + " foi depositado na conta.<br>";
		if (contaBancaria.sacar(valor)==contaBancaria.getSaldo()) {
			resposta += "Não foi possível fazer o saque no valor de " + paramValorSaque +".";
		} else {
			resposta += "Saque de " + paramValorSaque + " realizado com sucesso.";
		}
	}
		request.setAttribute("resposta", resposta);
	    RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);		
	}
}