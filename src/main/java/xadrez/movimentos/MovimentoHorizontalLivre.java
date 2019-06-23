package xadrez.movimentos;

import xadrez.pecas.Peca.Cor;

public class MovimentoHorizontalLivre extends Movimento {
    public MovimentoHorizontalLivre() {
        super(Tipo.HorizontalLivre);
        deslocaLinhas = false;
        deslocaColunas = true;
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaLinhas == 0;
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        return new int[]  { 0, 0, 0, 0, 0, 0, 0,  0,  0,  0,  0,  0,  0,  0 };
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] { 1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5, -6, -7 };
    }

}
