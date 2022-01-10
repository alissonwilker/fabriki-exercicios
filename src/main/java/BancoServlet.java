import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/BancoServlet")

public class BancoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String nome = request.getParameter("nomeCliente");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String operacao = request.getParameter("operacao");
		String valorDeposito = request.getParameter("valorDeposito");
		String valorSaque = request.getParameter("valorSaque");

		request.setAttribute("nomeCliente", nome);
		request.setAttribute("tipoCliente", tipoCliente);
		request.setAttribute("cpfCnpj", cpfCnpj);
		request.setAttribute("operacao", operacao);
		request.setAttribute("valorDeposito", valorDeposito);
		request.setAttribute("valorSaque", valorSaque);
		
		request.getRequestDispatcher("index.html").forward(request, response);
		

	}
}
