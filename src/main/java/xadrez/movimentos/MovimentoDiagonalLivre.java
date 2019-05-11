package xadrez.movimentos;

import xadrez.pecas.Peca.Cor;

public class MovimentoDiagonalLivre extends Movimento {
    public MovimentoDiagonalLivre() {
        super(Tipo.DiagonalLivre);
        deslocaLinhas = true;
        deslocaColunas = true;
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaColunas == distanciaLinhas;
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        return new int[] { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5, -6, -7, -1, -2, -3, -4, -5, -6,
        -7 };
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] { 1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5, -6, -7, 1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5, -6,
        -7 };
    }
}
