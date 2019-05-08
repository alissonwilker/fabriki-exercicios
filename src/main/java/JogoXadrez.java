
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

import xadrez.Situacao;
import xadrez.Xadrez;
import xadrez.Xadrez.ModoJogo;
import xadrez.Xadrez.OpcaoPecas;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public class JogoXadrez {
    public static Scanner entrada = new Scanner(System.in);
    public static PrintStream saida = System.out;

    private static NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
    private static Xadrez xadrez;

    public static String ANSI_RESET = "";
    public static String ANSI_RED_BOLD = "";
    public static String ANSI_GREEN = "";
    public static String ANSI_YELLOW = "";
    public static String ANSI_WHITE_BOLD_BRIGHT = "";

    public static String ANSI_CYAN_BACKGROUND = "";
    public static String ANSI_BLACK_BACKGROUND = "";

    private static boolean habilitaCores = false;

    private static double tempoJogoBrancasPartida;
    private static double tempoJogoPretasPartida;
    private static int contadorJogadasBrancasPartida;
    private static int contadorJogadasPretasPartida;
    private static int contadorPartidasBrancas;
    private static int contadorPartidasPretas;
    private static int contadorPartidasEmpatadas;
    private static long delay = 2000;
    public static int timeout = 0;
    public static long tempoTotal = 0;
    private static double analise = 0;
    private static double tempoJogoBrancas;
    private static double tempoJogoPretas;
    private static int contadorJogadasBrancas;
    private static int contadorJogadasPretas;

    private static void apresentarTabuleiro() {
        if (analise > 0) {
            return;
        }

        boolean opcaoPecasPretas = xadrez.getOpcaoPecas() == OpcaoPecas.PRETA;
        String colunas = opcaoPecasPretas ? "      H  G  F  E  D  C  B  A      " : "      A  B  C  D  E  F  G  H      ";

        saida.println();
        saida.println(ANSI_YELLOW + colunas + ANSI_RESET);
        saida.println("                                  ");
        boolean casaBranca = true;

        for (int i = 1; i <= Xadrez.Linha.values().length; i++) {
            saida.print(ANSI_YELLOW + " " + (opcaoPecasPretas ? i : (9 - i)) + "   " + ANSI_RESET);
            Peca[] linhaTabuleiro = xadrez.getPecas(Xadrez.Linha.values()[i - 1]);
            for (Peca peca : linhaTabuleiro) {
                String pecaString = habilitaCores ? " " : "-";
                if (peca != null) {
                    pecaString = peca.getCor() == Cor.BRANCA ? ANSI_WHITE_BOLD_BRIGHT + peca : ANSI_RED_BOLD + peca;
                }
                if (casaBranca) {
                    saida.print(ANSI_CYAN_BACKGROUND + " " + pecaString + " " + ANSI_RESET);
                } else {
                    saida.print(ANSI_BLACK_BACKGROUND + " " + pecaString + " " + ANSI_RESET);
                }
                casaBranca = !casaBranca;
            }
            saida.print(ANSI_YELLOW + "   " + (opcaoPecasPretas ? i : (9 - i)) + " " + ANSI_RESET);
            saida.println();
            casaBranca = !casaBranca;
        }
        saida.println("                                  ");
        saida.println(ANSI_YELLOW + colunas + ANSI_RESET);
        saida.println();
        saida.println(ANSI_GREEN + "Situação: " + xadrez.getSituacao() + ANSI_RESET);
        saida.println();
    }

    private static void executarMovimento(OpcaoPecas opcaoPecas, ModoJogo modoJogo) throws InterruptedException {
        String movimento = "";

        do {
            if (analise == 0) {
                if (xadrez.isTurnoBrancas()) {
                    saida.print(ANSI_WHITE_BOLD_BRIGHT + "BRANCAS: " + ANSI_RESET);
                } else {
                    saida.print(ANSI_RED_BOLD + "pretas: " + ANSI_RESET);
                }
            }

            long tempoJogada = System.currentTimeMillis();
            if (modoJogo != ModoJogo.SIMULADO
                && !(modoJogo == ModoJogo.UM_JOGADOR && (opcaoPecas == OpcaoPecas.BRANCA && !xadrez.isTurnoBrancas()
                    || opcaoPecas == OpcaoPecas.PRETA && xadrez.isTurnoBrancas()))) {
                tempoJogada = System.currentTimeMillis();
                movimento = entrada.nextLine().trim().toUpperCase();
                tempoJogada = System.currentTimeMillis() - tempoJogada;
            } else {
                tempoJogada = System.currentTimeMillis();
                movimento = xadrez.proximoMovimento(modoJogo);
                tempoJogada = System.currentTimeMillis() - tempoJogada;
                Thread.sleep(delay);
                if (analise == 0) {
                    saida.println(movimento);
                }
            }

            if (xadrez.isTurnoBrancas()) {
                tempoJogoBrancasPartida += tempoJogada;
            } else {
                tempoJogoPretasPartida += tempoJogada;
            }

        } while (!validarMovimento(movimento) || !processarMovimento(movimento));
    }

    private static boolean validarMovimento(String movimento) {
        if (!Xadrez.validarMovimento(movimento)) {
            saida.println(ANSI_GREEN
                + "Digite a casa de origem seguida da casa de destino (exemplos: 'E2E4', ou 'C7C8T', para promover o peão a uma Torre)."
                + ANSI_RESET);
            return false;
        }

        return true;
    }

    private static boolean processarMovimento(String movimento) {
        boolean isTurnoBrancas = xadrez.isTurnoBrancas();

        if (!xadrez.jogar(movimento)) {
            saida.println(ANSI_GREEN + "Movimento ilegal! Tente novamente." + ANSI_RESET);
            return false;
        }

        if (isTurnoBrancas) {
            contadorJogadasBrancasPartida++;
        } else {
            contadorJogadasPretasPartida++;
        }

        return true;
    }

    public static void habilitaCores() {
        ANSI_RESET = "\u001B[0m";
        ANSI_RED_BOLD = "\033[1;31m";
        ANSI_GREEN = "\u001B[32m";
        ANSI_YELLOW = "\u001B[33m";
        ANSI_WHITE_BOLD_BRIGHT = "\033[1;97m";

        ANSI_CYAN_BACKGROUND = "\u001B[46m";
        ANSI_BLACK_BACKGROUND = "\u001B[40m";

        habilitaCores = true;
    }

    public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException,
        ClassNotFoundException, InterruptedException {
        File arquivo = null;
        String algoritmo1 = null;
        String algoritmo2 = null;
        int loop = 1;
        
        try (InputStream input = new FileInputStream("xadrez.config")) {
            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            analise = Double.valueOf(prop.getProperty("analise"));
            loop = Integer.valueOf(prop.getProperty("loop"));
            timeout = Integer.valueOf(prop.getProperty("timeout"));
            delay = Long.valueOf(prop.getProperty("delay"));
            algoritmo1 = prop.getProperty("alg1");
            algoritmo2 = prop.getProperty("alg2");
        } catch (IOException ex) {
            // nada a fazer
        }
        
        for (String parametro : args) {
            if (parametro.equals("cores")) {
                habilitaCores();
            } else if (parametro.startsWith("analise=")) {
                analise = Double.valueOf(parametro.substring(8));
            } else if (parametro.startsWith("loop=")) {
                loop = Integer.valueOf(parametro.substring(5));
            } else if (parametro.startsWith("timeout=")) {
                timeout = Integer.valueOf(parametro.substring(8));
            } else if (parametro.startsWith("arquivo=")) {
                arquivo = new File(parametro.substring(8));
            } else if (parametro.startsWith("delay=")) {
                delay = Long.valueOf(parametro.substring(6));
            } else if (parametro.startsWith("alg1=")) {
                algoritmo1 = parametro.substring(5);
            } else if (parametro.startsWith("alg2=")) {
                algoritmo2 = parametro.substring(5);
            }
        }

        ModoJogo modoJogo = null;
        if (analise > 0) {
            modoJogo = Xadrez.ModoJogo.SIMULADO;
        } else {
            saida.print(
                ANSI_GREEN + "Escolha o modo de jogo [(1) 1 jogador, (2) 2 jogadores ou (3) simulado]: " + ANSI_RESET);
            modoJogo = Xadrez.ModoJogo.values()[Integer.valueOf(entrada.nextLine()) - 1];
        }

        OpcaoPecas opcaoPecas = null;
        if (arquivo == null && modoJogo != ModoJogo.SIMULADO) {
            saida.print(ANSI_GREEN + "Escolha suas peças [(1) brancas ou (2) pretas]: " + ANSI_RESET);
            opcaoPecas = Xadrez.OpcaoPecas.values()[Integer.valueOf(entrada.nextLine()) - 1];
        }
        
        tempoTotal = System.currentTimeMillis();
        
        if (timeout > 0) {
            new VerificadorTimeout().start();
        }

        for (int i = 1; i <= loop; i++) {
            tempoJogoBrancasPartida = 0;
            tempoJogoPretasPartida = 0;
            contadorJogadasBrancasPartida = 0;
            contadorJogadasPretasPartida = 0;

            if (arquivo == null) {
                xadrez = new Xadrez(opcaoPecas, algoritmo1, algoritmo2);
            } else {
                xadrez = new Xadrez(arquivo, algoritmo1, algoritmo2);
            }

            try {
                while (!xadrez.fimDeJogo()) {
                    apresentarTabuleiro();
                    executarMovimento(opcaoPecas, modoJogo);
                }
                apresentarTabuleiro();

                if (xadrez.getSituacao() == Situacao.Xeque_Mate_Brancas) {
                    contadorPartidasPretas++;
                } else if (xadrez.getSituacao() == Situacao.Xeque_Mate_Pretas) {
                    contadorPartidasBrancas++;
                } else {
                    contadorPartidasEmpatadas++;
                }

                tempoJogoBrancas += tempoJogoBrancasPartida;
                tempoJogoPretas += tempoJogoPretasPartida;
                contadorJogadasBrancas += contadorJogadasBrancasPartida;
                contadorJogadasPretas += contadorJogadasPretasPartida;
            } catch (Exception ex) {
                ex.printStackTrace(saida);
                saida.println();
                saida.println("Modo de jogo: " + modoJogo);
                saida.println("Algoritmo 1: " + algoritmo1);
                saida.println("Algoritmo 2: " + algoritmo2);
                saida.println();
                saida.println(xadrez);
            }

            if (analise == 0) {
                saida.println("Peças brancas realizaram " + contadorJogadasBrancasPartida + " jogada(s) em "
                    + formatador.format(tempoJogoBrancasPartida / (1000)) + " segundos.");
                saida.println("Peças pretas realizaram " + contadorJogadasPretasPartida + " jogada(s) em "
                    + formatador.format(tempoJogoPretasPartida / (1000)) + " segundos.");
            }
        }
        tempoTotal = System.currentTimeMillis() - tempoTotal;
        int contadorPartidas = contadorPartidasBrancas + contadorPartidasPretas;
        double percentualPartidasBrancas = contadorPartidas > 0 ? ((double) contadorPartidasBrancas / contadorPartidas)
            : 0;
        double percentualPartidasPretas = contadorPartidas > 0 ? ((double) contadorPartidasPretas / contadorPartidas)
            : 0;

        if (analise == 0) {
            saida.println();
            saida.println("---");
            saida.println();
            saida.println("Peças brancas venceram " + contadorPartidasBrancas + " ("
                + formatador.format(percentualPartidasBrancas * 100) + "%) partida(s), com tempo médio de jogada de "
                + formatador.format(contadorJogadasBrancas > 0 ? (tempoJogoBrancas / contadorJogadasBrancas) : 0)
                + " milissegundos.");
            saida.println("Peças pretas venceram " + contadorPartidasPretas + " ("
                + formatador.format(percentualPartidasPretas * 100) + "%) partida(s), com tempo médio de jogada de "
                + formatador.format(contadorJogadasPretas > 0 ? (tempoJogoPretas / contadorJogadasPretas) : 0)
                + " milissegundos.");
            saida.println("Partidas empatadas: " + contadorPartidasEmpatadas + ".");
            saida.println();
            saida.println("Tempo total: " + formatador.format(tempoTotal / (1000)) + " segundos.");
            saida.println();
        } else {
            if (contadorPartidas + contadorPartidasEmpatadas >= loop) {
                if (percentualPartidasBrancas >= analise) {
                    saida.println("BRANCAS VENCEM.");
                } else if (percentualPartidasPretas >= analise) {
                    saida.println("PRETAS VENCEM.");
                } else {
                    saida.println("VANTAGEM INSUFICIENTE.");
                }
            } else {
                saida.println("JOGADAS INSUFICIENTES.");
            }
        }

        System.exit(0);
    }

}

class VerificadorTimeout extends Thread {
    @Override
    public void run() {
        while (System.currentTimeMillis() - JogoXadrez.tempoTotal < JogoXadrez.timeout * 60 * 1000) {
            try {
                sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        JogoXadrez.saida.println("TIMEOUT.");
        System.exit(1);
    }
}
