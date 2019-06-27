package xadrez.alg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import xadrez.Xadrez;

public class AlgoritmoMinimax extends AlgoritmoValorPecasPosicional {
    private Integer profundidade = 3;
    private boolean inverterSinalValorTabuleiro;
    private boolean debug = false;

    public Integer getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public void setParametros(Object... params) {
        if (params != null && params.length == 1 && params[0] != null) {
            profundidade = (Integer) params[0];
        }
    }

    @Override
    public String procurarMelhorMovimento(Xadrez xadrez) {
        inverterSinalValorTabuleiro = !xadrez.isTurnoBrancas();
        String melhorMovimento = minimaxRoot(xadrez);
        return melhorMovimento;
    }

    class MinimaxManager implements Callable<Integer> {
        private int melhorValor = MENOR_VALOR;
        private Map<String, Integer> melhoresMovimentos = new HashMap<>();
        private List<String> movimentosValidos;
        private Xadrez xadrez;

        public MinimaxManager(List<String> movimentosValidos, Xadrez xadrez) {
            this.movimentosValidos = movimentosValidos;
            this.xadrez = xadrez;
        }

        @Override
        public Integer call() throws Exception {
            MinimaxRunner minimaxRunner1 = new MinimaxRunner(movimentosValidos.subList(0, movimentosValidos.size() / 2),
                xadrez);
            MinimaxRunner minimaxRunner2 = new MinimaxRunner(
                movimentosValidos.subList(movimentosValidos.size() / 2, movimentosValidos.size()), xadrez.clonar());

            melhorValor = executarThreads(minimaxRunner1, minimaxRunner2);

            if (minimaxRunner1.melhorValor > minimaxRunner2.melhorValor) {
                melhoresMovimentos = minimaxRunner1.melhoresMovimentos;
            } else if (minimaxRunner1.melhorValor < minimaxRunner2.melhorValor) {
                melhoresMovimentos = minimaxRunner2.melhoresMovimentos;
            } else {
                melhoresMovimentos = minimaxRunner1.melhoresMovimentos;
                melhoresMovimentos.putAll(minimaxRunner2.melhoresMovimentos);
            }

            return melhorValor;
        }

    }

    class MinimaxRunner implements Callable<Integer> {
        private String offset = "";
        private int melhorValor = MENOR_VALOR;
        private Map<String, Integer> melhoresMovimentos = new HashMap<>();
        private int minimaxCount = 0;
        private List<String> movimentosValidos;
        private Xadrez xadrez;

        public MinimaxRunner(List<String> movimentosValidos, Xadrez xadrez) {
            this.movimentosValidos = movimentosValidos;
            this.xadrez = xadrez;
        }

        @Override
        public Integer call() throws Exception {
            for (String movimento : movimentosValidos) {

                minimaxCount = 0;

                xadrez.jogar(movimento, true);

                if (debug) {
                    System.out.println(Thread.currentThread().getName() + " NÍVEL: " + (offset.length() / 2 + 1) + " | MOVIMENTO: " + movimento);
                }
                offset = "  ";
                int novoValorTabuleiro = minimax(profundidade - 1, xadrez, MENOR_VALOR, MAIOR_VALOR, false);
                offset = "";
                xadrez.retornarEstadoAnterior();

                if (novoValorTabuleiro > melhorValor) {
                    melhorValor = novoValorTabuleiro;
                    melhoresMovimentos.clear();
                    melhoresMovimentos.put(movimento, minimaxCount);
                } else if (novoValorTabuleiro == melhorValor) {
                    melhoresMovimentos.put(movimento, minimaxCount);
                }
            }
            return melhorValor;
        }

        private int minimax(int profundidade, Xadrez xadrez, int alpha, int beta, boolean maximizarJogador) {
            minimaxCount++;

            if (profundidade <= 0 || xadrez.ehFimDeJogo()) {
                int valorTabuleiro = AlgoritmoValorPecasPosicional.calcularValorTabuleiro(xadrez);
                valorTabuleiro = inverterSinalValorTabuleiro ? ((-1) * valorTabuleiro) : valorTabuleiro;
                return valorTabuleiro;
            }

            List<String> movimentosValidos = xadrez.recuperarMovimentosValidosTurno();

            List<String> melhoresMovimentos = new ArrayList<String>();
            int melhorValor;
            if (maximizarJogador) {
                melhorValor = MENOR_VALOR;
                for (String movimento : movimentosValidos) {
                    xadrez.jogar(movimento, true);

                    if (debug) {
                        System.out.println(Thread.currentThread().getName() + " " + offset + "NÍVEL: " + (offset.length() / 2 + 1) + " | TURNO OPONENTE: "
                            + (!maximizarJogador ? "sim" : "não") + " | MOVIMENTO: " + movimento);
                    }
                    offset = offset + "  ";
                    int valorMovimento = minimax(profundidade - 1, xadrez, alpha, beta, false);
                    offset = offset.substring(2);
                    int temp = melhorValor;
                    if (debug) {
                        System.out.println(Thread.currentThread().getName() + " " + offset + "NÍVEL: " + (offset.length() / 2 + 1) + " | TURNO OPONENTE: "
                            + (!maximizarJogador ? "sim" : "não") + " | MOVIMENTO: " + movimento + " | VALOR: "
                            + valorMovimento);
                    }
                    melhorValor = Math.max(melhorValor, valorMovimento);
                    if (melhorValor == valorMovimento) {
                        if (temp != melhorValor) {
                            melhoresMovimentos.clear();
                        }
                        melhoresMovimentos.add(movimento);
                    }
                    xadrez.retornarEstadoAnterior();

                    alpha = Math.max(alpha, melhorValor);
                    if (beta <= alpha) {
                        break;
                    }
                }
            } else {
                melhorValor = MAIOR_VALOR;
                for (String movimento : movimentosValidos) {
                    xadrez.jogar(movimento, true);

                    if (debug) {
                        System.out.println(Thread.currentThread().getName() + " " + offset + "NÍVEL: " + (offset.length() / 2 + 1) + " | TURNO OPONENTE: "
                            + (!maximizarJogador ? "sim" : "não") + " | MOVIMENTO: " + movimento);
                    }
                    offset = offset + "  ";
                    int valorMovimento = minimax(profundidade - 1, xadrez, alpha, beta, true);

                    offset = offset.substring(2);
                    int temp = melhorValor;
                    if (debug) {
                        System.out.println(Thread.currentThread().getName() + " " + offset + "NÍVEL: " + (offset.length() / 2 + 1) + " | TURNO OPONENTE: "
                            + (!maximizarJogador ? "sim" : "não") + " | MOVIMENTO: " + movimento + " | VALOR: "
                            + valorMovimento);
                    }
                    melhorValor = Math.min(melhorValor, valorMovimento);
                    if (melhorValor == valorMovimento) {
                        if (temp != melhorValor) {
                            melhoresMovimentos.clear();
                        }
                        melhoresMovimentos.add(movimento);
                    }
                    xadrez.retornarEstadoAnterior();

                    beta = Math.min(beta, melhorValor);
                    if (beta <= alpha) {
                        break;
                    }
                }

            }

            if (debug) {
                System.out.println(Thread.currentThread().getName() + " " + offset + "NÍVEL: " + (offset.length() / 2 + 1) + " | TURNO OPONENTE: "
                    + (!maximizarJogador ? "sim" : "não") + " | MELHOR VALOR: " + melhorValor
                    + " | MELHORES MOVIMENTOS: " + melhoresMovimentos);
            }

            return melhorValor;
        }

    }

    private String minimaxRoot(Xadrez xadrez) {
        List<String> movimentosXequeMateEmUmLance = procurarMovimentosXequeMateEmUmLance(xadrez);
        if (movimentosXequeMateEmUmLance.size() > 0) {
            return movimentosXequeMateEmUmLance.get(0);
        }

        int melhorValor = 0;
        Map<String, Integer> melhoresMovimentos = null;
        List<String> movimentosValidos = xadrez.recuperarMovimentosValidosTurno();
        int tempProfundidade = profundidade;
        do {
            melhorValor = MENOR_VALOR;
            melhoresMovimentos = new HashMap<>();

            MinimaxManager minimaxManager1 = new MinimaxManager(
                movimentosValidos.subList(0, movimentosValidos.size() / 2), xadrez);
            MinimaxManager minimaxManager2 = new MinimaxManager(
                movimentosValidos.subList(movimentosValidos.size() / 2, movimentosValidos.size()), xadrez.clonar());

            melhorValor = executarThreads(minimaxManager1, minimaxManager2);

            if (minimaxManager1.melhorValor > minimaxManager2.melhorValor) {
                melhoresMovimentos = minimaxManager1.melhoresMovimentos;
            } else if (minimaxManager1.melhorValor < minimaxManager2.melhorValor) {
                melhoresMovimentos = minimaxManager2.melhoresMovimentos;
            } else {
                melhoresMovimentos = minimaxManager1.melhoresMovimentos;
                melhoresMovimentos.putAll(minimaxManager2.melhoresMovimentos);
            }
            movimentosValidos = new ArrayList<>(melhoresMovimentos.keySet());
        } while (melhoresMovimentos.keySet().size() > 1 && --profundidade > 0);
        profundidade = tempProfundidade;

//        String melhorMovimento = (String) escolherPorMinimax(melhoresMovimentos,
//            melhorValor == MENOR_VALOR ? true : false);
        String melhorMovimento = (String) escolherAleatoriamente(new ArrayList<>(melhoresMovimentos.keySet()));

        if (debug) {
            System.out.println(Thread.currentThread().getName() + " NÍVEL: 1 | MELHOR MOVIMENTO: " + melhorMovimento + " | MELHOR VALOR: " + melhorValor
                + " | MELHORES MOVIMENTOS: " + melhoresMovimentos);
        }

        return melhorMovimento;
    }

    private int executarThreads(Callable<Integer> minimaxCallable1, Callable<Integer> minimaxCallable2) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> resultadoMinimaxCallable1 = executor.submit(minimaxCallable1);
        Future<Integer> resultadoMinimaxCallable2 = executor.submit(minimaxCallable2);

        int melhorValor = 0;
        try {
            melhorValor = Math.max(resultadoMinimaxCallable1.get(), resultadoMinimaxCallable2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            System.exit(1);
        } finally {
            executor.shutdown();
        }

        return melhorValor;
    }

    private String escolherPorMinimax(Map<String, Integer> melhoresMovimentos, boolean maximizarJogadas) {
        String melhorMovimento = null;
        int melhorMinimax = maximizarJogadas ? 0 : Integer.MAX_VALUE;
        for (String movimento : melhoresMovimentos.keySet()) {
            int minimaxMovimento = melhoresMovimentos.get(movimento);
            if (maximizarJogadas) {
                if (minimaxMovimento > melhorMinimax) {
                    melhorMinimax = minimaxMovimento;
                    melhorMovimento = movimento;
                }
            } else {
                if (minimaxMovimento < melhorMinimax) {
                    melhorMinimax = minimaxMovimento;
                    melhorMovimento = movimento;
                }
            }
        }
        return melhorMovimento;
    }

}
