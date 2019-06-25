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
    
    public static MovimentoAvancaDuas criarMovimentoAvancaDuas() {
        return new MovimentoAvancaDuas();
    }

    public static MovimentoAvancaUma criarMovimentoAvancaUma() {
        return new MovimentoAvancaUma();
    }

    public static MovimentoCapturaDiagonal criarMovimentoCapturaDiagonal() {
        return new MovimentoCapturaDiagonal();
    }

    public static MovimentoEnPassant criarMovimentoEnPassant() {
        return new MovimentoEnPassant();
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

class MovimentoAvancaDuas extends MovimentoPeao {
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

class MovimentoAvancaUma extends MovimentoPeao {
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

class MovimentoCapturaDiagonal extends MovimentoPeao {
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
        Peca pecaOrigem = xadrez.get(idCasaOrigem);
        Peca pecaDestino = xadrez.get(idCasaDestino);

        boolean deslocamentoParaFrente = verificarDeslocamentoParaFrente(idCasaOrigem, idCasaDestino, xadrez);

        return !(pecaDestino != null
            && pecaDestino.getCor() != pecaOrigem.getCor() && deslocamentoParaFrente) || super.verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
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

class MovimentoEnPassant extends MovimentoPeao {
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
        return !validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez) || super.verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
    }

    @Override
    public boolean validarCasaDestinoMovimento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        String idCasaPeaoEnPassant = xadrez.getIdCasaPeaoEnPassant();

        if (idCasaPeaoEnPassant == null) {
            return false;
        }

        return super.validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez) && idCasaDestino.equals(idCasaPeaoEnPassant);
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
