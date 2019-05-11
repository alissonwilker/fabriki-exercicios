package xadrez.movimentos;

import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public abstract class Movimento {
    public enum Tipo {
        Restrito, VerticalLivre, HorizontalLivre, DiagonalLivre, L, AvancaUma, CapturaDiagonal, AvancaDuas, EnPassant, Promover, Roque;
    }

    private Tipo tipo;

    boolean deslocaLinhas = false;
    boolean deslocaColunas = false;

    public Movimento(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public boolean validar(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        boolean causaXequeAmigo = false;
        boolean deslocamentoValido = false;
        boolean casaDestinoValida = validarCasaDestinoMovimento(idCasaOrigem, idCasaDestino, xadrez);

        if (casaDestinoValida) {
            deslocamentoValido = validarDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
            if (deslocamentoValido) {
                causaXequeAmigo = verificarXequeAmigo(idCasaOrigem, idCasaDestino, xadrez);
            }
        }

        return casaDestinoValida && deslocamentoValido && !causaXequeAmigo;
    }

    public boolean validarCasaDestinoMovimento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        Peca pecaOrigem = xadrez.get(idCasaOrigem);
        Peca pecaDestino = xadrez.get(idCasaDestino);
        return pecaDestino == null || pecaOrigem.getCor() != pecaDestino.getCor();
    }

    private boolean verificarXequeAmigo(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        Peca pecaOrigem = xadrez.get(idCasaOrigem);

        Xadrez xadrezClonado = xadrez.clonar();
        xadrezClonado.moverPeca(idCasaOrigem + idCasaDestino);

        return xadrezClonado.verificarXeque(pecaOrigem.getCor());
    }

    public boolean verificarObstrucaoDeslocamento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        List<String> casasIntermediarias = getCasasIntermediarias(idCasaOrigem, idCasaDestino, xadrez);
        for (String idCasaIntermediaria : casasIntermediarias) {
            Peca pecaObstrucao = xadrez.get(idCasaIntermediaria);
            if (pecaObstrucao != null) {
                return true;
            }
        }

        return false;
    }

    public boolean validarDeslocamento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        int distanciaColunas = xadrez.calcularDistanciaColunas(idCasaOrigem, idCasaDestino);
        int distanciaLinhas = xadrez.calcularDistanciaLinhas(idCasaOrigem, idCasaDestino);

        if (!validarDistanciasColunasLinhas(distanciaColunas, distanciaLinhas)) {
            return false;
        }

        return !verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
    }

    protected abstract boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas);

    public List<String> getMovimentosValidos(String idCasaOrigem, Xadrez xadrez) {
        List<String> movimentosValidos = new ArrayList<>();

        Peca pecaOrigem = xadrez.get(idCasaOrigem);
        Cor corPecaOrigem = pecaOrigem.getCor();

        int[] colunas = getColunasMovimentos(corPecaOrigem);
        int[] linhas = getLinhasMovimentos(corPecaOrigem);

        for (int i = 0; i < linhas.length; i++) {
            String idCasaDestino = xadrez.getIdCasa(idCasaOrigem, colunas[i], linhas[i]);
            if (idCasaDestino != null && validar(idCasaOrigem, idCasaDestino, xadrez)) {
                movimentosValidos.add(idCasaOrigem + idCasaDestino);
            }
        }

        return movimentosValidos;
    }

    protected abstract int[] getLinhasMovimentos(Cor corPecaOrigem);

    protected abstract int[] getColunasMovimentos(Cor corPecaOrigem);

    public List<String> getCasasIntermediarias(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        List<String> casasIntermediarias = new ArrayList<>();
        int distanciaLinhas = xadrez.calcularDistanciaLinhas(idCasaOrigem, idCasaDestino);
        int distanciaColunas = xadrez.calcularDistanciaColunas(idCasaOrigem, idCasaDestino);

        int linhaOrigem = xadrez.getOrdemLinha(idCasaOrigem);
        int linhaDestino = xadrez.getOrdemLinha(idCasaDestino);
        int colunaOrigem = xadrez.getOrdemColuna(idCasaOrigem);
        int colunaDestino = xadrez.getOrdemColuna(idCasaDestino);

        int offsetLinha = distanciaLinhas == 0 ? 0 : (linhaDestino - linhaOrigem) > 0 ? 1 : -1;
        int offsetColuna = distanciaColunas == 0 ? 0 : (colunaDestino - colunaOrigem) > 0 ? 1 : -1;
        for (int i = 1; i < (deslocaLinhas ? distanciaLinhas : distanciaColunas); i++) {
            colunaOrigem += offsetColuna;
            linhaOrigem += offsetLinha;
            casasIntermediarias.add(xadrez.getIdCasa(colunaOrigem, linhaOrigem));
        }
        return casasIntermediarias;
    }

}
