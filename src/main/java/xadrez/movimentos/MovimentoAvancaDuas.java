package xadrez.movimentos;

import xadrez.Xadrez;
import xadrez.pecas.Peca.Cor;

public class MovimentoAvancaDuas extends MovimentoPeao {
    public MovimentoAvancaDuas() {
        super(Tipo.AvancaDuas);
        deslocaLinhas = true;
        deslocaColunas = false;
    }

    @Override
    public boolean validarCasaDestinoMovimento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        boolean corPecaOrigemBranca = xadrez.get(idCasaOrigem).getCor() == Cor.BRANCA;
        int ordemLinhaOrigem = xadrez.getOrdemLinha(idCasaOrigem);

        boolean peaoNaoMovimentouAinda = corPecaOrigemBranca ? ordemLinhaOrigem == 1 : ordemLinhaOrigem == 6;

        return peaoNaoMovimentouAinda && super.validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez);
    }

    @Override
    public boolean verificarObstrucaoDeslocamento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return !validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez)
            || super.verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaColunas == 0 && distanciaLinhas == 2;
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        int deslocamentoLinha = (corPecaOrigem == Cor.BRANCA) ? 2 : -2;
        return new int[] { deslocamentoLinha };
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] { 0 };
    }

}
