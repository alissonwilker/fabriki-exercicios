import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;

public class TestUtil {
	public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
		List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();

		ArrayList<String> Final = new ArrayList();
		for (Peca elementopeca : pecasDoTurno) {
			List<String> Totalmovimentos = elementopeca.getMovimentosValidos(xadrez);
			for (String movimento : Totalmovimentos) {

				Situacao resultado = xadrez.simularJogada(movimento);
				boolean turno = xadrez.isTurnoBrancas();

				if (resultado == Situacao.Pretas_em_xeque_mate && turno == true) {
					Final.add(movimento);
				} else if (resultado == Situacao.Brancas_em_xeque_mate && turno == false) {
					Final.add(movimento);
				}
			}

		}

		return Final;
	}

}
