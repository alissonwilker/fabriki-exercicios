import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;

public class TestUtil {
	public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {

		List<String> movimentosdexq = new ArrayList<>();

		List<Peca> listadepecas = xadrez.recuperarPecasDoTurno();
		for (int i = 0; i < listadepecas.size(); i++) {
			List<String> movimentos = listadepecas.get(i).getMovimentosValidos(xadrez);
			for (int j = 0; j < movimentos.size(); j++) {

				Situacao situacao = xadrez.simularJogada(movimentos.get(j));
				boolean turnobrancas = xadrez.isTurnoBrancas();

				if (situacao == Situacao.Pretas_em_xeque_mate && turnobrancas) {
					movimentosdexq.add(movimentos.get(j));
				} else if (situacao == Situacao.Brancas_em_xeque_mate && !turnobrancas) {
					movimentosdexq.add(movimentos.get(j));
				}

			}
		}

		return movimentosdexq;

	}

}
