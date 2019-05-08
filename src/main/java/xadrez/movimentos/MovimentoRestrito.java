package xadrez.movimentos;

import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca.Cor;

public class MovimentoRestrito extends Movimento {
    public MovimentoRestrito() {
        super(Tipo.Restrito);
        deslocaLinhas = true;
        deslocaColunas = true;
     }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaColunas <= 1 && distanciaLinhas <= 1;
    }

    @Override
    public List<String> getCasasIntermediarias(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return new ArrayList<String>();
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        return new int[] {1, 1, 1, 0, 0, -1, -1, -1};
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] {-1, 0, 1, -1, 1, -1, 0, 1};
    }

}
