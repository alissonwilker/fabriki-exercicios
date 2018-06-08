
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String parNome = request.getParameter("nomeCliente");
		String parTipoCliente = request.getParameter("tipoCliente");
		String parCpf_Cnpj = request.getParameter("cpfCnpj");
		String parOp = request.getParameter("operacao");
		int parValueDep = Integer.parseInt(request.getParameter("valorDeposito"));
		int parValueSaq = Integer.parseInt(request.getParameter("valorSaque"));
		
	Cliente cliente = null;
	
	if(parTipoCliente.equals("pessoaJuridica")) {
		cliente = new PessoaJuridica(parNome,parCpf_Cnpj);
	}else {
		cliente = new PessoaFisica(parNome,parCpf_Cnpj);
	}
	
	ContaBancaria contaBancaria = new ContaBancaria(cliente);
	Object resposta;
	
	switch(parOp) {
	
	case "recuperarNomeCliente": resposta = contaBancaria.getCliente().getNome();break;
	case "recuperarSaldo":resposta =  contaBancaria.getSaldo();break;
	case "depositarValor": resposta = contaBancaria.depositar();break;
	case "operacaoSacarValor":resposta = contaBancaria.sacar();break;
	case "depositarSacarValor": resposta = contaBancaria.depositar();resposta +=contaBancaria.sacar();break;
	case "recuperarCpfCliente":resposta = contaBancaria.getCiente().getCpf();break;
	case "recuperarCnpjCliente":resposta =contaBancaria.getCiente().getCnpj();break;
	
	}
	
	request.setAttribute("resposta",resposta);
		RequestDispatcher rd =request.getRequestDispatcher("resposta.jsp");
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

