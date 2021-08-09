

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BancoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Cliente cliente = null;
		String respNome = request.getParameter("nomeCliente");
		String respCPFCNPJ = request.getParameter("cpfCnpj");
		
		//DEPENDENDO TIPO FISICA/JURIDICA
		String tipoCliente = request.getParameter("tipoCliente");
		if (tipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(respNome, respCPFCNPJ);
		} else {
			cliente = new PessoaJuridica(respNome, respCPFCNPJ);
		}
		//RECUPERA VALOR APERACAO		
		String operacao = request.getParameter("operacao");
		
		//CRIA CLIENTE
		ContaBancaria conta = new ContaBancaria(cliente);
		
		//EXECUTA A OPERACAO
		if (operacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", cliente.getNome()); 
		} else if (operacao.equals("recuperarCpfCliente")) {
			request.setAttribute("resposta", ((PessoaFisica)cliente).getCpf()); 
		} else if (operacao.equals("recuperarCnpjCliente")) {
			request.setAttribute("resposta", ((PessoaJuridica)cliente).getCnpj()); 	
		} else if (operacao.equals("recuperarSaldo")) {
			request.setAttribute("resposta", conta.getSaldo()); 	
		} else if (operacao.equals("depositarValor")) {
			int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
			request.setAttribute("resposta", conta.depositar(valorDeposito)); 
		} else if (operacao.equals("sacarValor")) {
			int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
			request.setAttribute("resposta", conta.sacar(valorSaque));
		} else if (operacao.equals("depositarSacarValor")) {
			int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
			conta.depositar(valorDeposito); 
			int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
			request.setAttribute("resposta", conta.sacar(valorSaque));
		}	

		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
	    dispatcher.forward(request, response);
	}
}
