package xadrez.movimentos;

import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca.Cor;

public class MovimentoL extends Movimento {
    public MovimentoL() {
        super(Tipo.L);
        deslocaLinhas = true;
        deslocaColunas = true;
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return (distanciaColunas == 2 && distanciaLinhas == 1) || (distanciaColunas == 1 && distanciaLinhas == 2);
    }

    @Override
    public List<String> getCasasIntermediarias(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return new ArrayList<String>();
    }
    
    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        return new int[] {1, -1, 1, -1, 2, -2, 2, -2};
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] {2, 2, -2, -2, 1, 1, -1, -1};
    }
}
