import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

/**
 * Servlet implementação da classe  BancoServlet
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processaDados(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processaDados(request, response);
	}


	public void processaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramNome = request.getParameter("nomeCliente");
		String paramTipo = request.getParameter("tipoCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramDeposito = request.getParameter("valorDeposito");
		String paramSaque = request.getParameter("valorSaque");
		String paramOperacao = request.getParameter("operacao");

        Cliente cliente;
		ContaBancaria conta;
		String resposta = "";
		if(paramTipo.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNome, paramCpfCnpj);
			conta = new ContaBancaria(cliente);
			resposta = conta.realizar(paramNome, paramTipo, paramDeposito, paramSaque, paramOperacao);
		} else if (paramTipo.equals("pessoaJuridica")) {
			cliente = new PessoaJuridica(paramNome, paramCpfCnpj);
			conta = new ContaBancaria(cliente);
			resposta = conta.realizar(paramNome, paramTipo, paramDeposito, paramSaque, paramOperacao);
		}


		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);
	}
}
