package xadrez.alg;

import java.util.ArrayList;
import java.util.List;

import xadrez.Situacao;
import xadrez.Xadrez;
import xadrez.Xadrez.Linha;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public class AlgoritmoValorPecas extends AlgoritmoAleatorioMaisXequeMate {
    public static final int MAIOR_VALOR = 1000000;
    public static final int MENOR_VALOR = Math.negateExact(MAIOR_VALOR);

    @Override
    public String procurarMelhorMovimento(Xadrez xadrez) {
        List<String> movimentosXequeMateEmUmLance = procurarMovimentosXequeMateEmUmLance(xadrez);
        if (movimentosXequeMateEmUmLance.size() > 0) {
            return movimentosXequeMateEmUmLance.get(0);
        }

        int melhorValor = MENOR_VALOR;

        List<String> melhoresMovimentos = new ArrayList<>();
        List<String> movimentosValidos = xadrez.recuperarMovimentosValidosTurno();
        for (String movimento : movimentosValidos) {
            xadrez.jogar(movimento, true);
            int novoValorTabuleiro = calcularValorTabuleiro(xadrez);
            xadrez.retornarEstadoAnterior();
            novoValorTabuleiro = xadrez.isTurnoBrancas() ? novoValorTabuleiro : ((-1) * novoValorTabuleiro);

            if (novoValorTabuleiro > melhorValor) {
                melhorValor = novoValorTabuleiro;
                melhoresMovimentos.clear();
                melhoresMovimentos.add(movimento);
            } else if (novoValorTabuleiro == melhorValor) {
                melhoresMovimentos.add(movimento);
            }

        }
        String melhorMovimento = (String) escolherAleatoriamente(melhoresMovimentos);

        return melhorMovimento;
    }

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
            Peca[] pecasLinha = xadrez.getPecas(linha);
            for (Peca peca : pecasLinha) {
                valorTabuleiro += peca != null ? recuperarValorPeca(peca) : 0;
            }
        }
        return valorTabuleiro;
    }

    public static int recuperarValorPeca(Peca peca) {
        int valorPeca = 0;
        switch (peca.getTipo()) {
        case Peao:
            valorPeca = getValorPeao();
            break;
        case Torre:
            valorPeca = getValorTorre();
            break;
        case Cavalo:
            valorPeca = getValorCavalo();
            break;
        case Bispo:
            valorPeca = getValorBispo();
            break;
        case Dama:
            valorPeca = getValorDama();
            break;
        case Rei:
            valorPeca = getValorRei();
            break;
        }
        return peca.getCor() == Cor.BRANCA ? valorPeca : Math.negateExact(valorPeca);
    }

    public static int getValorRei() {
        return 20000;
    }

    public static int getValorPeao() {
        return 100;
    }

    public static int getValorBispo() {
        return 330;
    }

    public static int getValorCavalo() {
        return 320;
    }

    public static int getValorDama() {
        return 900;
    }

    public static int getValorTorre() {
        return 500;
    }
}
