import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contaBancaria")
public class BancoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	Integer parametroQtd = Integer.parseInt(req.getParameter("qtd"));
	String parametroTipoOperacao = req.getParameter("tipoOperacao");
	String parametroTipoCliente = req.getParameter("tipoCliente");
	PessoaFisica clientePF = new PessoaFisica("Lucas", "000111222333");
	PessoaJuridica clientePJ = new PessoaJuridica("Armazém do Souza", "11155599988874");
	ContaBancaria contaBancariaPF = new ContaBancaria(clientePF);
	ContaBancaria contaBancariaPJ = new ContaBancaria(clientePJ);
	if(parametroTipoOperacao.equals("depositar")) {
		if(parametroTipoCliente.equals("PF")) {
			contaBancariaPF.depositar(parametroQtd);
			req.setAttribute("qtd", contaBancariaPF.getSaldo());
			req.setAttribute("tipoOperacao", parametroTipoOperacao);
			req.setAttribute("tipoCliente", parametroTipoCliente);
		}else {
			contaBancariaPJ.depositar(parametroQtd);
			req.setAttribute("qtd", contaBancariaPJ.getSaldo());
			req.setAttribute("tipoOperacao", parametroTipoOperacao);
			req.setAttribute("tipoCliente", parametroTipoCliente);
		}
		
	}else {
		if(parametroTipoCliente.equals("PF")) {
			contaBancariaPF.sacar(parametroQtd);
			req.setAttribute("qtd", contaBancariaPF.getSaldo());
			req.setAttribute("tipoOperacao", parametroTipoOperacao);
			req.setAttribute("tipoCliente", parametroTipoCliente);
		} else {
			contaBancariaPJ.sacar(parametroQtd);
			req.setAttribute("qtd", contaBancariaPJ.getSaldo());
			req.setAttribute("tipoCliente", parametroTipoCliente);
			req.setAttribute("tipoOperacao", parametroTipoOperacao);
		}
		
	}
	
	RequestDispatcher reqDispatcher = req.getRequestDispatcher("resultado.jsp");
	 reqDispatcher.forward(req, resp);
}}
