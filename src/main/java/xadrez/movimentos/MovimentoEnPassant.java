package xadrez.movimentos;

import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca.Cor;

public class MovimentoEnPassant extends MovimentoPeao {
    public MovimentoEnPassant() {
        super(Tipo.EnPassant);
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
        String idCasaPeaoEnPassant = xadrez.getIdCasaPeaoEnPassant();

        if (idCasaPeaoEnPassant == null) {
            return false;
        }

        boolean adversarioEnPassant = false;

        String idCasaVizinhaDeUmLado = xadrez.getIdCasa(idCasaOrigem, 1, 0);
        String idCasaVizinhaDoOutroLado = xadrez.getIdCasa(idCasaOrigem, -1, 0);

        if ((idCasaVizinhaDeUmLado != null && idCasaVizinhaDeUmLado.equals(idCasaPeaoEnPassant))
            || (idCasaVizinhaDoOutroLado != null && idCasaVizinhaDoOutroLado.equals(idCasaPeaoEnPassant))) {
            adversarioEnPassant = true;
        }

        return super.validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez) && adversarioEnPassant;
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
