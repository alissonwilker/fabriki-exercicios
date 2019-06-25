import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;

public class TestUtil {
	public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
		List<Peca> pecas = xadrez.recuperarPecasDoTurno();
		ArrayList<String> XequeMate = new ArrayList<String>();

		for (Peca h : pecas) {
			List<String> Moverpeca = h.getMovimentosValidos(xadrez);

			for (String jogada : Moverpeca) {

				Situacao resultado = xadrez.simularJogada(jogada);
				boolean turno = xadrez.isTurnoBrancas();

				if (resultado == Situacao.Brancas_em_xeque && turno == false) {
					XequeMate.add(jogada);
				} else if (resultado == Situacao.Pretas_em_xeque && turno == true) {

					XequeMate.add(jogada);
				}
			}
		}
		return XequeMate;

	}
}
