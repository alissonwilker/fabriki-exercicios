import java.io.IOException;
		
		import javax.servlet.RequestDispatcher;
		import javax.servlet.ServletException;
		import javax.servlet.annotation.WebServlet;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
		
		@WebServlet("/BancoServlet")
		public class BancoServlet extends HttpServlet {
		
			private PessoaFisica pf;
			private PessoaJuridica pj;
			private String nome;
		
			private ContaBancaria conta;
			private String resposta = "";
		
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
		
				String tipoCliente = req.getParameter("tipoCliente");
				Integer valorDeposito = (req.getParameter("valorDeposito").equals(""))? 0 : Integer.parseInt(req.getParameter("valorDeposito"));
				Integer valorSaque = (req.getParameter("valorSaque").equals(""))? 0 : Integer.parseInt(req.getParameter("valorSaque"));
		
				if(tipoCliente.equals("pessoaFisica")) {
					pf = new PessoaFisica(req.getParameter("nomeCliente"), req.getParameter("cpfCnpj"));
					conta = new ContaBancaria(pf);
					nome = pf.getNome();
				}else {
					pj = new PessoaJuridica(req.getParameter("nomeCliente"), req.getParameter("cpfCnpj"));
					conta = new ContaBancaria(pj);
					nome = pj.getNome();
				}
		
				String operacao = req.getParameter("operacao");
		
				switch (operacao) {
				case "recuperarNomeCliente":
					resposta = nome;
					break;
				case "recuperarCpfCliente":
					resposta = pf.getCpf();
					break;
				case "recuperarCnpjCliente":
					resposta = pj.getCnpj();
					break;
				case "recuperarSaldo":
					resposta = ""+conta.getSaldo();
					break;
				case "depositarValor":
					conta.depositar(valorDeposito);
					resposta = ""+this.conta.getSaldo();
					break;
				case "sacarValor":
					conta.sacar(valorSaque);
					resposta = ""+this.conta.getSaldo();
					break;
				case "depositarSacarValor":
					conta.depositar(valorDeposito);
					conta.sacar(valorSaque);
					resposta = ""+this.conta.getSaldo();
					break;
		
				default:
					break;
				}
		
				req.setAttribute("resposta", resposta);
		        RequestDispatcher dispatcher = req.getRequestDispatcher("/resposta.jsp");
		        dispatcher.forward(req, resp);
			}
		}
