import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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
        
        String resposta = "";

        int valorDeposito = 0;
        int valorSaque = 0;
        if (paramOperacao.equals("depositarValor") || paramOperacao.equals("sacarValor") || paramOperacao.equals("depositarSacarValor")) {
            if(paramValorDeposito.isEmpty() == false){
                valorDeposito = Integer.parseInt(paramValorDeposito);
            }
            if(paramValorSaque.isEmpty() == false){
                valorSaque = Integer.parseInt(paramValorSaque);
            }
        }
        switch (paramOperacao) {
            case "recuperarNomeCliente":
                resposta = cliente.getNome();
                break;
            case "recuperarCpfCliente":
                if (cliente instanceof PessoaFisica) {
                    resposta = ((PessoaFisica) cliente).getCpf(); //parêntese p/conversão de cliente p/PessoaFisica
                } else {
                    resposta = "Não é Pessoa Física, selecione CNPJ";
                }
                break;
            case "recuperarCnpjCliente":
                if (cliente instanceof PessoaJuridica) {
                    resposta = ((PessoaJuridica) cliente).getCnpj(); //parêntese p/conversão de cliente p/PessoaJuridica
                } else {
                    resposta = "Não é Pessoa Jurídica, selecione CPF";
                }
                break;
            case "recuperarSaldo":
                resposta = Integer.toString(contaBancaria.getSaldo());
                break;
            case "depositarValor":
                contaBancaria.depositar(valorDeposito);
                resposta = Integer.toString(contaBancaria.getSaldo());
                break;
            case "sacarValor":
                contaBancaria.sacar(valorSaque);
                resposta = Integer.toString(contaBancaria.getSaldo());
                break;
            case "depositarSacarValor":
                contaBancaria.depositar(valorDeposito);
                contaBancaria.sacar(valorSaque);
                resposta = Integer.toString(contaBancaria.getSaldo());
                break;
        }

        request.setAttribute("resposta", resposta);
        RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
        reqDispatcher.forward(request, response);
    }

}
