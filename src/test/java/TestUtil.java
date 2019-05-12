import java.util.ArrayList;
import java.util.List;

import xadrez.Situacao;
import xadrez.Xadrez;
import xadrez.pecas.Peca;

public class TestUtil {
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
