public class BancoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getDados(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getDados(request, response);
	}

	public void getDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reponse = "";
        String fieldNome = request.getParameter("nomeCliente");
		String fieldTipo = request.getParameter("tipoCliente");
		String fieldCpfCnpj = request.getParameter("cpfCnpj");
		String fieldDeposito = request.getParameter("valorDeposito");
		String fieldSaque = request.getParameter("valorSaque");
		String fieldOperacao = request.getParameter("operacao");
		Cliente cliente;
		ContaBancaria conta;
		

		if(fieldTipo.equals("pessoaFisica")) {
			cliente = new PessoaFisica(fieldNome, fieldCpfCnpj);
			conta = new ContaBancaria(cliente);
			reponse = conta.realizar(fieldNome, fieldTipo, fieldDeposito, fieldSaque, fieldOperacao);
		} 
        
        if (fieldTipo.equals("pessoaJuridica")) {
			cliente = new PessoaJuridica(fieldNome, fieldCpfCnpj);
			conta = new ContaBancaria(cliente);
			reponse = conta.realizar(fieldNome, fieldTipo, fieldDeposito, fieldSaque, fieldOperacao);
		}

		request.setAttribute("resposta", reponse); 
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
		dispatcher.forward(request, response); 

	}
}
