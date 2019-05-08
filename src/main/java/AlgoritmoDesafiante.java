import java.util.ArrayList;
import java.util.List;

import xadrez.Situacao;
import xadrez.Xadrez;
import xadrez.pecas.Peca;

public class AlgoritmoDesafiante implements AlgoritmoXadrez {

    @Override
    public String jogar(Xadrez xadrez) {
        List<String> movimentosXequeMateEmUmLance = procurarMovimentosXequeMateEmUmLance(xadrez);
        if (movimentosXequeMateEmUmLance.size() > 0) {
            return movimentosXequeMateEmUmLance.get(0);
        } else {
            return new xadrez.alg.AlgoritmoAleatorio().jogar(xadrez);
        }
    }

    /**
     * Procura todos os movimentos possiveis de realizar um xeque mate no oponente em um unico lance.
     * 
     * @param xadrez o xadrez.
     * @return lista com todos os movimentos de xeque mate em um unico lance encontradas no jogo.
     */
    public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
        List<String> movimentosXequeMate = new ArrayList<>();
        List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();
        for (Peca peca : pecasDoTurno) {
            List<String> movimentosValidos = peca.getMovimentosValidos(xadrez);
            for (String movimentoValido : movimentosValidos) {
                Situacao situacaoSimulada = xadrez.simularJogada(movimentoValido);
                if (situacaoSimulada == (xadrez.isTurnoBrancas() ? Situacao.Xeque_Mate_Pretas
                    : Situacao.Xeque_Mate_Brancas)) {
                    movimentosXequeMate.add(movimentoValido);
                }
            }
        }
        return movimentosXequeMate;
    }

}
