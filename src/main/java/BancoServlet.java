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
		String paramTipoCliente = request.getParameter("tipoCliente");
		String paramOperacao = request.getParameter("operacao");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramValorDeposito = request.getParameter("valorDeposito");
		String paramValorSaque = request.getParameter("valorSaque");
		String resposta="";
		
		Cliente cliente;		
	
		if(paramTipoCliente.equals("pessoaFisica")) {
			PessoaFisica clientePessoaFisica = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
			if (paramOperacao.equals("recuperarCpfCliente")) {
				resposta = clientePessoaFisica.getCpf();		
			}
			cliente = clientePessoaFisica;
		} else {
			PessoaJuridica clientePessoaJuridica = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
			if (paramOperacao.equals("recuperarCnpjCliente")) {
				resposta = clientePessoaJuridica.getCnpj();		
			}
			cliente = clientePessoaJuridica;
		}		
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		if (paramOperacao.equals("recuperarNomeCliente")) {
			resposta = cliente.getNome();
		} else if (paramOperacao.equals("recuperarSaldo")) {
			resposta += contaBancaria.getSaldo();
			
		} else if (paramOperacao.equals("depositarValor")) {
			contaBancaria.depositar(Integer.parseInt(paramValorDeposito));
			resposta += contaBancaria.getSaldo();
		} else if (paramOperacao.equals("sacarValor")) {			
			resposta += contaBancaria.sacar(Integer.parseInt(paramValorSaque));			
		} else if (paramOperacao.equals("depositarSacarValor")) {
			contaBancaria.depositar(Integer.parseInt(paramValorDeposito));
			resposta += contaBancaria.sacar(Integer.parseInt(paramValorSaque));
		}
		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);		
	}
}