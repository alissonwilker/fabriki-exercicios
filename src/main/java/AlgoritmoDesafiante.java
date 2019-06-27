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
		
		
		List<String> verificarSeEXeque = procurarMovimentosXequeMateEmUmLance2(xadrez);
		
		while (movimentoValido == null) {

			if (verificarSeEXeque != null && !verificarSeEXeque.isEmpty()) {
				movimentoValido = verificarSeEXeque.get(0);
			} else {

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

	public static List<String> procurarMovimentosXequeMateEmUmLance2(Xadrez xadrez) {

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
