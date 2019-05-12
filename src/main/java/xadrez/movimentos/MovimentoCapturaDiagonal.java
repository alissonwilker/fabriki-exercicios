package xadrez.movimentos;

import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public class MovimentoCapturaDiagonal extends MovimentoPeao {
    public MovimentoCapturaDiagonal() {
        super(Tipo.CapturaDiagonal);
        deslocaLinhas = true;
        deslocaColunas = true;
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaColunas == 1 && distanciaLinhas == 1;
    }
    
    @Override
    public boolean verificarObstrucaoDeslocamento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return super.verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez)
            || !validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez);
    }

    @Override
    public boolean validarCasaDestinoMovimento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        Peca pecaOrigem = xadrez.get(idCasaOrigem);
        Peca pecaDestino = xadrez.get(idCasaDestino);

        boolean deslocamentoParaFrente = verificarDeslocamentoParaFrente(idCasaOrigem, idCasaDestino, xadrez);

        return pecaDestino != null
            && pecaDestino.getCor() != pecaOrigem.getCor() && deslocamentoParaFrente;
    }

    @Override
    public List<String> getCasasIntermediarias(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return new ArrayList<String>();
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        int deslocamentoLinha = (corPecaOrigem == Cor.BRANCA) ? 1 : -1;
        return new int[] { deslocamentoLinha, deslocamentoLinha };
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] { 1, -1 };
    }

}
