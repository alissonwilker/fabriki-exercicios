package xadrez.movimentos;

import xadrez.pecas.Peca.Cor;

public class MovimentoVerticalLivre extends Movimento {
    public MovimentoVerticalLivre() {
        super(Tipo.VerticalLivre);
        deslocaLinhas = true;
        deslocaColunas = false;
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaColunas == 0;
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        return new int[] { 1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5, -6, -7 };
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    }

}
