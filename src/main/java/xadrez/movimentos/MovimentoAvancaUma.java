package xadrez.movimentos;

import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca.Cor;

public class MovimentoAvancaUma extends MovimentoPeao {
    public MovimentoAvancaUma() {
        super(Tipo.AvancaUma);
        deslocaLinhas = true;
        deslocaColunas = false;
    }

    @Override
    public boolean verificarObstrucaoDeslocamento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return !validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez)
            || super.verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaColunas == 0 && distanciaLinhas == 1;
    }

    @Override
    public List<String> getCasasIntermediarias(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return new ArrayList<String>();
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        int deslocamentoLinha = (corPecaOrigem == Cor.BRANCA) ? 1 : -1;
        return new int[] { deslocamentoLinha };
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] { 0 };
    }

}
