import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	
	private PessoaFisica pf;
	private PessoaJuridica pj;
	private ContaBancaria conta;
	//private String resposta = "";
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
				
    String nome = req.getParameter("nomeCliente");
    String tipo = req.getParameter("tipoCliente");
    //String cpfcnpj = req.getParameter("cpfCnpj");
    String op = req.getParameter("operacao");
    //Integer valor = (req.getParameter("valorDeposito").equals(""))? 0 : Integer.parseInt(req.getParameter("valorDeposito"));
	//Integer saque = (req.getParameter("valorSaque").equals(""))? 0 : Integer.parseInt(req.getParameter("valorSaque"));
        
    if(tipo.equals("pessoaFisica")) {
    	PessoaFisica pf = new PessoaFisica(nome, cpfcnpj);
    	ContaBancaria conta = new ContaBancaria(pf);
    	nome = pf.getNome();
    } else {
    	PessoaJuridica pj = new PessoaJuridica(nome, cpfcnpj);
        ContaBancaria conta = new ContaBancaria(pj);
        nome = pj.getNome();
    }
    
    switch (op) {
    
    	case "recuperarNomeCliente":
    	req.setAttribute("resposta", nome);
    	break;
    	
    	case "recuperarCpfCliente":
    	String cpf = tipo.equals("pessoaFisica") ? pf.getCpf() : null;
		req.setAttribute("resposta", cpf);
    	break;
    	
    	case "recuperarCnpjCliente":
    	String cnpj = tipo.equals("pessoaJuridica") ? pj.getCnpj() : null;
		req.setAttribute("resposta", cnpj);
    	break;
    	
    	case "recuperarSaldo":
    	int saldo = conta.getSaldo();
    	req.setAttribute("resposta", saldo);
    	break;
    	
    	case "depositarValor":
    	int valor = Integer.parseInt(req.getParameter("valorDeposito"));
		int deposito = conta.depositar(valor);
    	break;
    	
    	case "sacarValor":
    	int vsaque = Integer.parseInt(req.getParameter("valorSaque"));
		int saque = conta.sacar(vsaque);
		req.setAttribute("resposta", saque);
    	break;
    	
    	case "depositarSacarValor":
    	int vDeposito = Integer.parseInt(req.getParameter("valorDeposito"));
		int vSaque = Integer.parseInt(req.getParameter("valorSaque"));
		int depSaque = conta.depositar(vDeposito);
		depSaque = conta.sacar(vSaque);
		req.setAttribute("resposta", depSaque);
    	break;
    	
    }
          
	RequestDispatcher dispatcher = req.getRequestDispatcher("resposta.jsp");
	      
	dispatcher.forward(req, resp);
	
	}
}
