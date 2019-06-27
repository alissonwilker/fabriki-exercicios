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
        List<String> ListaDeMates = procurarMovimentosXequeMateEmUmLance(xadrez);
        
        String movimentoValido = null;
        
       
        
        if (!ListaDeMates.isEmpty()) {
        	
        	movimentoValido = ListaDeMates.get(0);
        	
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
