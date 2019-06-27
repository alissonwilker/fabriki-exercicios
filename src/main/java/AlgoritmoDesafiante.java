import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.alg.AlgoritmoXadrez;
import xadrez.pecas.Peca;

public class AlgoritmoDesafiante implements AlgoritmoXadrez {

	@Override
	public String procurarMelhorMovimento(Xadrez xadrez) {
		List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();
		String movimentoValido = null;

		List<String> xequeEmUmLance = procurarMovimentosXequeMateEmUmLance(xadrez);
		if (!xequeEmUmLance.isEmpty()) {
			movimentoValido = xequeEmUmLance.get(0);
		} else {
			while (movimentoValido == null) {
				int numeroAleatorio = (int) (Math.random() * pecasDoTurno.size());
				Peca peca = pecasDoTurno.get(numeroAleatorio);
				List<String> movimentosValidos = peca.getMovimentosValidos(xadrez);
				if (movimentosValidos.size() > 0) {
					numeroAleatorio = (int) (Math.random() * movimentosValidos.size());
					movimentoValido = movimentosValidos.get(numeroAleatorio);
				}
			}
		}

		return movimentoValido;
	}

	public List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {

		List<Peca> listaDePecas = xadrez.recuperarPecasDoTurno();
		List<String> movimentosXeques = new ArrayList();

		for (int i = 0; i < listaDePecas.size(); i++) {
			Peca peca = listaDePecas.get(i);

			List<String> movimento = peca.getMovimentosValidos(xadrez);

			for (int j = 0; j < movimento.size(); j++) {
				Situacao situacao = xadrez.simularJogada(movimento.get(j));
				if (xadrez.isTurnoBrancas()) {
					if (situacao == situacao.Pretas_em_xeque_mate) {
						movimentosXeques.add(movimento.get(j));
					}

				} else {
					if (situacao == situacao.Brancas_em_xeque_mate) {
						movimentosXeques.add(movimento.get(j));
					}
				}
			}
		}
		return movimentosXeques;
	}
}
