@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		meuMetodo(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		meuMetodo(request, response);
	}

	public void meuMetodo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramNome = request.getParameter("nomeCliente");
		String paramTipo = request.getParameter("tipoCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramDeposito = request.getParameter("valorDeposito");
		String paramSaque = request.getParameter("valorSaque");
		String paramOperacao = request.getParameter("operacao");
		Cliente cliente;
		ContaBancaria conta;
		String result = "";
		if(paramTipo.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNome, paramCpfCnpj);
			conta = new ContaBancaria(cliente);
			result = conta.realizar(paramNome, paramTipo, paramDeposito, paramSaque, paramOperacao);
		} else if (paramTipo.equals("pessoaJuridica")) {
			cliente = new PessoaJuridica(paramNome, paramCpfCnpj);
			conta = new ContaBancaria(cliente);
			result = conta.realizar(paramNome, paramTipo, paramDeposito, paramSaque, paramOperacao);
		}
		
		request.setAttribute("resposta", result); /
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
		dispatcher.forward(request, response); 
		
	}
}
