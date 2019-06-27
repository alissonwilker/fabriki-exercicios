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
		List<String> MatesPossiveis = procurarMovimentosXequeMateEmUmLance(xadrez);

		String movimentoValido = null;

		if (!MatesPossiveis.isEmpty()) {

			movimentoValido = MatesPossiveis.get(0);
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

	public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
		List<Peca> pecas = xadrez.recuperarPecasDoTurno();

		ArrayList<String> XequeMate = new ArrayList<String>();

		for (Peca h : pecas) {
			List<String> Moverpeca = h.getMovimentosValidos(xadrez);

			for (String jogada : Moverpeca) {

				Situacao resultado = xadrez.simularJogada(jogada);
				boolean turno = xadrez.isTurnoBrancas();

				if (resultado == Situacao.Brancas_em_xeque_mate && turno == false) {
					XequeMate.add(jogada);
				} else if (resultado == Situacao.Pretas_em_xeque_mate && turno == true) {

					XequeMate.add(jogada);
				}
			}
		}
		return XequeMate;

	}

}
