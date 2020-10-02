import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String paramNomeCliente = request.getParameter("nomeCliente");
        String paramTipoCliente = request.getParameter("tipoCliente");
        String paramCpfCnpj = request.getParameter("cpfCnpj");
        String paramOperacao = request.getParameter("operacao");
        String paramValorDeposito = request.getParameter("valorDeposito");
        String paramValorSaque = request.getParameter("valorSaque");

        Cliente cliente;
        if (paramTipoCliente.equals("pessoaFisica")) {
            cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
        } else {
            cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
        }
        ContaBancaria contaBancaria = new ContaBancaria(cliente);
        int valorS = 0;
        int valorD = 0;
        if(paramOperacao.equals("depositarValor") || paramOperacao.equals("sacarValor") || paramOperacao.equals("depositarSacarValor")){
            valorS = Integer.parseInt(paramValorSaque);
            valorD = Integer.parseInt(paramValorDeposito);
        }

        String resposta = "";
        switch (paramOperacao) {
            case "recuperarNomeCliente":
                resposta = cliente.getNome();
                break;
            case "recuperarCpfCliente":
                if (paramTipoCliente.equals("pessoaFisica")) {
                    resposta = ((PessoaFisica)cliente).getCpf();
                }
                break;
            case "recuperarCnpjCliente":
                if (paramTipoCliente.equals("pessoaJuridica")) {
                    resposta = ((PessoaJuridica)cliente).getCnpj();
                }
                break;
            case "depositarValor":
                contaBancaria.depositar(valorD);
                resposta = Integer.toString(valorD);
                break;
            case "sacarValor":
                contaBancaria.sacar(valorS);
                resposta = Integer.toString(valorS);
                break;
            case "depositarSacarValor":
                contaBancaria.depositar(valorD);
                contaBancaria.sacar(valorS);
                resposta = Integer.toString(contaBancaria.getSaldo());
                System.out.println(resposta);
                break;
            case "recuperarSaldo":
                int saldo = contaBancaria.getSaldo();
                resposta = Integer.toString(saldo);
                break;
        }

        request.setAttribute("resposta", resposta);
        RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
        reqDispatcher.forward(request, response);
    }

}
