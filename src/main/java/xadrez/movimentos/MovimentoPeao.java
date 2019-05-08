package xadrez.movimentos;

import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public abstract class MovimentoPeao extends Movimento {

    public MovimentoPeao(Tipo tipo) {
        super(tipo);
    }

    @Override
    public List<String> getMovimentosValidos(String idCasaOrigem, Xadrez xadrez) {
        List<String> movimentos = super.getMovimentosValidos(idCasaOrigem, xadrez);
        List<String> movimentosARemover = new ArrayList<>();
        List<String> movimentosAAdicionar = new ArrayList<>();
        
        for (String movimentoValido : movimentos) {
            String idCasaDestino = Xadrez.getIdCasaDestino(movimentoValido);
            if (xadrez.getOrdemLinha(idCasaDestino) == 7 || xadrez.getOrdemLinha(idCasaDestino) == 0) {
                movimentosARemover.add(movimentoValido);
                movimentosAAdicionar.add(movimentoValido + "D");
                movimentosAAdicionar.add(movimentoValido + "T");
                movimentosAAdicionar.add(movimentoValido + "C");
                movimentosAAdicionar.add(movimentoValido + "B");
            }
        }
        
        movimentos.addAll(movimentosAAdicionar);
        movimentos.removeAll(movimentosARemover);
        
        return movimentos;
    }

    @Override
    public boolean validarCasaDestinoMovimento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        Peca pecaDestino = xadrez.get(idCasaDestino);

        boolean deslocamentoParaFrente = verificarDeslocamentoParaFrente(idCasaOrigem, idCasaDestino, xadrez);

        return pecaDestino == null && deslocamentoParaFrente;
    }

    protected boolean verificarDeslocamentoParaFrente(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        Peca pecaOrigem = xadrez.get(idCasaOrigem);
        boolean corPecaOrigemBranca = pecaOrigem.getCor() == Cor.BRANCA;

        int linhaOrigem = xadrez.getOrdemLinha(idCasaOrigem);
        int linhaDestino = xadrez.getOrdemLinha(idCasaDestino);
        int deslocamentoLinha = linhaDestino - linhaOrigem;

        boolean deslocamentoParaFrente = false;
        if (corPecaOrigemBranca) {
            deslocamentoParaFrente = deslocamentoLinha > 0;
        } else {
            deslocamentoParaFrente = deslocamentoLinha < 0;
        }
        return deslocamentoParaFrente;
    }

}
