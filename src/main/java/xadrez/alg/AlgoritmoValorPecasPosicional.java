package xadrez.alg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Coluna;
import xadrez.Xadrez.Linha;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public class AlgoritmoValorPecasPosicional extends AlgoritmoValorPecas {
    private static int[][] valorPeaoPreto = { 
    { 00, 00, 00, 00, 00, 00, 00, 00 },
    { 50, 50, 50, 50, 50, 50, 50, 50 }, 
    { 10, 10, 20, 30, 30, 20, 10, 10 },
    { 05, 05, 10, 25, 25, 10, 05, 05 }, 
    { 00, 00, 00, 20, 20, 00, 00, 00 },
    { 05, -05, -10, 00, 00, -10, -05, 05 }, 
    { 05, 10, 10, -30, -30, 10, 10, 05 },
    { 00, 00, 00, 00, 00, 00, 00, 00 } };

    private static int[][] valorPeaoBranco = inverterArray(valorPeaoPreto);

    private static int[][] valorCavalo = { 
    { -50, -40, -30, -30, -30, -30, -40, -50 },
    { -40, -20, 00, 00, 00, 00, -20, -40 }, 
    { -30, 00, 10, 15, 15, 10, 00, -30 },
    { -30, 05, 15, 20, 20, 15, 05, -30 }, 
    { -30, 00, 15, 20, 20, 15, 00, -30 },
    { -30, 05, 10, 15, 15, 10, 05, -30 }, 
    { -40, -20, 00, 05, 05, 00, -20, -40 },
    { -50, -40, -30, -30, -30, -30, -40, -50 } };

    private static int[][] valorBispoPreto = { 
    { -20, -10, -10, -10, -10, -10, -10, -20 },
    { -10, 00, 00, 00, 00, 00, 00, -10 }, 
    { -10, 00, 05, 10, 10, 05, 00, -10 },
    { -10, 05, 05, 10, 10, 05, 05, -10 }, 
    { -10, 00, 10, 10, 10, 10, 00, -10 },
    { -10, 10, 10, 10, 10, 10, 10, -10 }, 
    { -10, 05, 00, 00, 00, 00, 05, -10 },
    { -20, -10, -10, -10, -10, -10, -10, -20 } };

    private static int[][] valorBispoBranco = inverterArray(valorBispoPreto);

    private static int[][] valorTorrePreta = { 
    { 00, 00, 00, 00, 00, 00, 00, 00 },
    { 05, 10, 10, 10, 10, 10, 10, 05 }, 
    { -05, 00, 00, 00, 00, 00, 00, -05 },
    { -05, 00, 00, 00, 00, 00, 00, -05 }, 
    { -05, 00, 00, 00, 00, 00, 00, -05 },
    { -05, 00, 00, 00, 00, 00, 00, -05 }, 
    { -05, 00, 00, 00, 00, 00, 00, -05 },
    { 00, 00, 00, 05, 05, 00, 00, 00 } };

    private static int[][] valorTorreBranca = inverterArray(valorTorrePreta);

    private static int[][] valorDamaPreta = { 
    { -20, -10, -10, -05, -05, -10, -10, -20 },
    { -10, 00, 00, 00, 00, 00, 00, -10 }, 
    { -10, 00, 05, 05, 05, 05, 00, -10 },
    { -05, 00, 05, 05, 05, 05, 00, -05 }, 
    { 00, 00, 05, 05, 05, 05, 00, -05 },
    { -10, 05, 05, 05, 05, 05, 00, -10 }, 
    { -10, 00, 05, 00, 00, 00, 00, -10 },
    { -20, -10, -10, -05, -05, -10, -10, -20 } };

    private static int[][] valorDamaBranca = inverterArray(valorDamaPreta);

    private static int[][] valorReiPreto = { 
    { -30, -40, -40, -50, -50, -40, -40, -30 },
    { -30, -40, -40, -50, -50, -40, -40, -30 }, 
    { -30, -40, -40, -50, -50, -40, -40, -30 },
    { -30, -40, -40, -50, -50, -40, -40, -30 }, 
    { -20, -30, -30, -40, -40, -30, -30, -20 },
    { -10, -20, -20, -20, -20, -20, -20, -10 }, 
    { 20, 20, 00, 00, 00, 00, 20, 20 },
    { 20, 30, 10, 00, 00, 10, 30, 20 } };

    private static int[][] valorReiBranco = inverterArray(valorReiPreto);

    private static int[][] valorReiPretoFinalJogo = { 
    { -50, -40, -30, -20, -20, -30, -40, -50 },
    { -30, -20, -10,  0,  0, -10, -20, -30},
    { -30, -10, 20, 30, 30, 20, -10, -30},
    { -30, -10, 30, 40, 40, 30, -10, -30},
    { -30, -10, 30, 40, 40, 30, -10, -30},
    { -30, -10, 20, 30, 30, 20, -10, -30},
    { -30, -30,  0,  0,  0,  0, -30, -30},
    { -50, -30, -30, -30, -30, -30, -30, -50}};

    private static int[][] valorReiBrancoFinalJogo = inverterArray(valorReiPretoFinalJogo);

    protected static int calcularValorTabuleiro(Xadrez xadrez) {
        if (xadrez.getSituacao() == Situacao.Brancas_em_xeque_mate) {
            return MENOR_VALOR;
        } else if (xadrez.getSituacao() == Situacao.Pretas_em_xeque_mate) {
            return MAIOR_VALOR;
        } else if (xadrez.getSituacao() == Situacao.Empate) {
            return 0;
        }
        
        int valorTabuleiro = 0;
        for (Linha linha : Xadrez.Linha.values()) {
            for (Coluna coluna : Xadrez.Coluna.values()) {
                String idCasa = xadrez.getIdCasa(coluna, linha);
                Peca peca = xadrez.get(idCasa);
                int ordemColuna = xadrez.getOrdemColuna(idCasa);
                int ordemLinha = xadrez.getOrdemLinha(idCasa);
                valorTabuleiro += peca != null ? recuperarValorPeca(peca, ordemColuna, ordemLinha, xadrez.estaNaFaseFinalDoJogo()) : 0;
            }
        }
        return valorTabuleiro;
    }

    private static int[][] inverterArray(int[][] arrayOriginal) {
        List<int[]> arrayAsList = Arrays.asList(arrayOriginal.clone());
        Collections.reverse(arrayAsList);
        return (int[][]) arrayAsList.toArray();
    }

    public static int recuperarValorPeca(Peca peca, int ordemColuna, int ordemLinha, boolean estaEmFinalDeJogo) {
        if (peca == null) {
            return 0;
        }

        int valorAbsoluto = recuperarValorAbsoluto(peca, ordemColuna, ordemLinha, estaEmFinalDeJogo);
        return peca.getCor() == Cor.BRANCA ? valorAbsoluto : ((-1) * valorAbsoluto);
    };

    private static int recuperarValorAbsoluto(Peca peca, int ordemColuna, int ordemLinha, boolean estaEmFinalDeJogo) {
        int valorPeca = 0;
        boolean pecaBranca = peca.getCor() == Cor.BRANCA;
        switch (peca.getTipo()) {
        case Peao:
            valorPeca = getValorPeao() + (pecaBranca ? valorPeaoBranco[ordemLinha][ordemColuna] : valorPeaoPreto[ordemLinha][ordemColuna]);
            break;
        case Torre:
            valorPeca = getValorTorre() + (pecaBranca ? valorTorreBranca[ordemLinha][ordemColuna] : valorTorrePreta[ordemLinha][ordemColuna]);
            break;
        case Cavalo:
            valorPeca = getValorCavalo() + valorCavalo[ordemLinha][ordemColuna];
            break;
        case Bispo:
            valorPeca = getValorBispo() + (pecaBranca ? valorBispoBranco[ordemLinha][ordemColuna] : valorBispoPreto[ordemLinha][ordemColuna]);
            break;
        case Dama:
            valorPeca = getValorDama() + (pecaBranca ? valorDamaBranca[ordemLinha][ordemColuna] : valorDamaPreta[ordemLinha][ordemColuna]);
            break;
        case Rei:
            if (estaEmFinalDeJogo) {
                valorPeca = getValorRei() + (pecaBranca ? valorReiBrancoFinalJogo[ordemLinha][ordemColuna] : valorReiPretoFinalJogo[ordemLinha][ordemColuna]);
            } else {
                valorPeca = getValorRei() + (pecaBranca ? valorReiBranco[ordemLinha][ordemColuna] : valorReiPreto[ordemLinha][ordemColuna]);
            }
            break;
        }

        return valorPeca;
    }

}

