
import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.alg.AlgoritmoXadrez;
import xadrez.pecas.Peca;

public class AlgoritmoDesafiante implements AlgoritmoXadrez {

    @Override
    public String procurarMelhorMovimento(Xadrez xadrez) {
        List<String> movimentosXequeMateEmUmLance = procurarMovimentosXequeMateEmUmLance(xadrez);
        if (movimentosXequeMateEmUmLance.size() > 0) {
            return movimentosXequeMateEmUmLance.get(0);
        } else {
            return procurarMovimentoAleatorio(xadrez);
        }
    }
    
    public static String procurarMovimentoAleatorio(Xadrez xadrez) {
        List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();

        String movimentoValido = null;
        while (movimentoValido == null) {
            int numeroAleatorio = (int) (Math.random() * pecasDoTurno.size());
            Peca peca = pecasDoTurno.get(numeroAleatorio);
            List<String> movimentosValidos = peca.getMovimentosValidos(xadrez);
            if (movimentosValidos.size() > 0) {
                numeroAleatorio = (int) (Math.random() * movimentosValidos.size());
                movimentoValido = movimentosValidos.get(numeroAleatorio);
            }
        }

        return movimentoValido;
    }
    
    public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
        List<String> movimentosXequeMate = new ArrayList<>();
        List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();
        for (Peca peca : pecasDoTurno) {
            List<String> movimentosValidos = peca.getMovimentosValidos(xadrez);
            for (String movimentoValido : movimentosValidos) {
                Situacao situacaoSimulada = xadrez.simularJogada(movimentoValido);
                if (situacaoSimulada == (xadrez.isTurnoBrancas() ? Situacao.Pretas_em_xeque_mate
                    : Situacao.Brancas_em_xeque_mate)) {
                    movimentosXequeMate.add(movimentoValido);
                }
            }
        }
        return movimentosXequeMate;
    }

}
