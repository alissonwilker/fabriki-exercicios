package xadrez.alg;

import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca;

public class AlgoritmoAleatorio implements AlgoritmoXadrez {

    @Override
    public String jogar(Xadrez xadrez) {
        List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();
        
        String movimentoValido = null;
        while (movimentoValido == null) {
            int numeroAleatorio = (int) (Math.random() * pecasDoTurno.size());
            Peca peca = pecasDoTurno.get(numeroAleatorio);
            List<String> movimentosValidos = peca.getMovimentosValidos(xadrez);
            if (movimentosValidos.size() > 0) {
                numeroAleatorio = (int) (Math.random() * movimentosValidos.size());
                movimentoValido = movimentosValidos.get(numeroAleatorio);
            }
        }
        
        return movimentoValido;
    }

}
