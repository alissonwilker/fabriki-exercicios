import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;

public class TestUtil {
	public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {

		List<Peca> listaDePecas = xadrez.recuperarPecasDoTurno();
		List<String> pecaEmXeque = new ArrayList<>();
		for (int i = 0; i < listaDePecas.size(); i++) {
			Peca peca = listaDePecas.get(i);
			List<String> listaDeMovimentosValidos = peca.getMovimentosValidos(xadrez);
			for (int j = 0; j < listaDeMovimentosValidos.size(); j++) {
				Situacao situacao = xadrez.simularJogada(listaDeMovimentosValidos.get(j));
				if (xadrez.isTurnoBrancas() == false) {
					if (situacao == Situacao.Brancas_em_xeque_mate) {
						pecaEmXeque.add(listaDeMovimentosValidos.get(j));
					}
				} else {
					if (situacao == Situacao.Pretas_em_xeque_mate) {
						pecaEmXeque.add(listaDeMovimentosValidos.get(j));
					}
				}
			}
		}
		return pecaEmXeque;
	}
}
