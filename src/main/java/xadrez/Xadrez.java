package xadrez;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import xadrez.alg.AlgoritmoXadrez;
import xadrez.movimentos.RoqueDto;
import xadrez.pecas.Bispo;
import xadrez.pecas.Cavalo;
import xadrez.pecas.Dama;
import xadrez.pecas.Peao;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;
import xadrez.pecas.Peca.Tipo;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

/**
 * Representa a logica do jogo de Xadrez.
 *
 */
public class Xadrez {
    public enum ModoJogo {
        UM_JOGADOR, DOIS_JOGADORES, SIMULADO;
    }

    /**
     * Representa as linhas do tabuleiro.
     *
     */
    public enum Linha {
        _1, _2, _3, _4, _5, _6, _7, _8;
    }

    /**
     * Representa as colunas do tabuleiro.
     *
     */
    public enum Coluna {
        A, B, C, D, E, F, G, H;
    }

    /**
     * Representa a escolha de pecas brancas ou pretas, que modifica a posicao do tabuleiro.
     *
     */
    public enum OpcaoPecas {
        BRANCA, PRETA;
    }

    private Cor turno = Cor.BRANCA;
    private OpcaoPecas opcaoPecas;
    private String idCasaPeaoEnPassant;
    private int contadorMovimentosSemCapturaOuMovimentoPeao;
    private Peca[][] tabuleiro = new Peca[8][8];
    private Situacao situacao = Situacao.Em_Andamento;
    private boolean reiBrancoMovido;
    private boolean torreBrancaAlaReiMovida;
    private boolean torreBrancaAlaDamaMovida;
    private boolean reiPretoMovido;
    private boolean torrePretaAlaReiMovida;
    private boolean torrePretaAlaDamaMovida;
    private AlgoritmoXadrez algoritmo1;
    private AlgoritmoXadrez algoritmo2;

    public Xadrez(OpcaoPecas opcaoPecas, String classeAlgoritmo1, String classeAlgoritmo2)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        this(opcaoPecas);
        carregarAlgoritmos(classeAlgoritmo1, classeAlgoritmo2);
    }

    public Xadrez(File arquivo, String classeAlgoritmo1, String classeAlgoritmo2)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException {
        this(arquivo);
        carregarAlgoritmos(classeAlgoritmo1, classeAlgoritmo2);
    }

    private void carregarAlgoritmos(String classeAlgoritmo1, String classeAlgoritmo2)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        if (classeAlgoritmo1 != null) {
            algoritmo1 = (AlgoritmoXadrez) Class.forName(classeAlgoritmo1).newInstance();
        }
        if (classeAlgoritmo2 != null) {
            algoritmo2 = (AlgoritmoXadrez) Class.forName(classeAlgoritmo2).newInstance();
        }
    }

    public Xadrez(OpcaoPecas opcaoPecas) {
        this.opcaoPecas = opcaoPecas;
        criarTabuleiro();
        atualizarSituacao(true);
    }

    private Xadrez(Peca[][] tabuleiro, OpcaoPecas opcaoPecas) {
        this.opcaoPecas = opcaoPecas;
        this.tabuleiro = tabuleiro;
    }

    public Xadrez(File arquivo) throws FileNotFoundException {
        carregarDoArquivo(arquivo);
        atualizarSituacao(true);
    }

    /**
     * Simula uma jogada e retorna a situacao do jogo depois que a jogada ocorre.
     * 
     * @param movimento
     *            o movimento de peca a ser realizado pela jogada.
     * @return a situacao do jogo apos executar a jogada.
     */
    public Situacao simularJogada(String movimento) {
        Xadrez xadrezClonado = clonar();
        xadrezClonado.jogar(movimento);
        return xadrezClonado.getSituacao();
    }

    public Xadrez clonar() {
        Peca[][] pecasClonadas = new Peca[tabuleiro.length][tabuleiro[0].length];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                if (tabuleiro[i][j] != null) {
                    pecasClonadas[i][j] = Peca.criar(tabuleiro[i][j].toString(),
                        getIdCasa(getOrdemColuna(j), getOrdemLinha(i)));
                }
            }
        }

        Xadrez xadrezClonado = new Xadrez(pecasClonadas, getOpcaoPecas());
        xadrezClonado.setIdCasaPeaoEnPassant(getIdCasaPeaoEnPassant());
        xadrezClonado.setSituacao(getSituacao());
        xadrezClonado.setTurno(getTurno());
        xadrezClonado.setContadorMovimentosSemCapturaOuMovimentoPeao(getContadorMovimentosSemCapturaOuMovimentoPeao());
        xadrezClonado.setReiBrancoMovido(isReiBrancoMovido());
        xadrezClonado.setTorreBrancaAlaDamaMovida(isTorreBrancaAlaDamaMovida());
        xadrezClonado.setTorreBrancaAlaReiMovida(isTorreBrancaAlaReiMovida());
        xadrezClonado.setReiPretoMovido(isReiPretoMovido());
        xadrezClonado.setTorrePretaAlaDamaMovida(isTorrePretaAlaDamaMovida());
        xadrezClonado.setTorrePretaAlaReiMovida(isTorrePretaAlaReiMovida());

        return xadrezClonado;
    }

    private void carregarDoArquivo(File arquivo) throws FileNotFoundException {
        Scanner scanner = new Scanner(arquivo);

        opcaoPecas = scanner.nextLine().split("=")[1].equals("BRANCA") ? OpcaoPecas.BRANCA : OpcaoPecas.PRETA;
        turno = scanner.nextLine().split("=")[1].equals("BRANCA") ? Cor.BRANCA : Cor.PRETA;
        idCasaPeaoEnPassant = scanner.nextLine().split("=")[1];
        idCasaPeaoEnPassant = idCasaPeaoEnPassant.equals("null") ? null : idCasaPeaoEnPassant;
        contadorMovimentosSemCapturaOuMovimentoPeao = Integer.valueOf(scanner.nextLine().split("=")[1]);
        setReiBrancoMovido(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setTorreBrancaAlaReiMovida(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setTorreBrancaAlaDamaMovida(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setReiPretoMovido(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setTorrePretaAlaReiMovida(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setTorrePretaAlaDamaMovida(scanner.nextLine().split("=")[1].equals("true") ? true : false);

        for (int i = 0; i <= Xadrez.Linha.values().length - 1; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiro[i][j] = Peca.criar(scanner.next(), getIdCasa(getOrdemColuna(j), getOrdemLinha(i)));
            }
        }

        scanner.close();
    }

    private int getOrdemLinha(int i) {
        return opcaoPecas == OpcaoPecas.PRETA ? i : (7 - i);
    }

    private int getOrdemColuna(int j) {
        return opcaoPecas == OpcaoPecas.BRANCA ? j : (7 - j);
    }

    private void criarTabuleiro() {
        criarPecas(8, Cor.PRETA);
        for (Coluna coluna : Coluna.values()) {
            put(new Peao(Cor.PRETA, coluna.name() + "7"));
            put(new Peao(Cor.BRANCA, coluna.name() + "2"));
        }
        criarPecas(1, Cor.BRANCA);
    }

    private void criarPecas(int ordemLinha, Cor cor) {
        put(new Torre(cor, "A" + ordemLinha));
        put(new Cavalo(cor, "B" + ordemLinha));
        put(new Bispo(cor, "C" + ordemLinha));
        put(new Dama(cor, "D" + ordemLinha));
        put(new Rei(cor, "E" + ordemLinha));
        put(new Bispo(cor, "F" + ordemLinha));
        put(new Cavalo(cor, "G" + ordemLinha));
        put(new Torre(cor, "H" + ordemLinha));
    }

    private void put(Peca peca) {
        set(peca.getIdCasa(), peca);
    }

    /**
     * Recupera uma peca pela coluna e linha associadas.
     * 
     * @param coluna
     *            a coluna em que a peca se encontra.
     * @param linha
     *            a linha em que a peca se encontra.
     * @return a peca da casa associada a coluna e a linha. Se a casa estiver vazia, o retorno sera
     *         nulo.
     */
    public Peca get(Coluna coluna, Linha linha) {
        return tabuleiro[getOrdemLinha(linha.ordinal())][getOrdemColuna(coluna.ordinal())];
    }

    public Peca get(String idCasa) {
        Coluna coluna = getColuna(idCasa);
        Linha linha = getLinha(idCasa);
        return get(coluna, linha);
    }

    private void set(Coluna coluna, Linha linha, Peca peca) {
        tabuleiro[getOrdemLinha(linha.ordinal())][getOrdemColuna(coluna.ordinal())] = peca;
    }

    private void set(String idCasa, Peca peca) {
        Coluna coluna = getColuna(idCasa);
        Linha linha = getLinha(idCasa);
        set(coluna, linha, peca);

        if (peca != null) {
            peca.setIdCasa(idCasa);
        }
    }

    public OpcaoPecas getOpcaoPecas() {
        return opcaoPecas;
    }

    public Peca[] getPecas(Linha linha) {
        return tabuleiro[linha.ordinal()];
    }

    /**
     * Realiza um movimento no tabuleiro se este for valido.
     * 
     * @param movimento
     *            o movimento a ser realizado. Por exemplo, "A7B8" ou "A7B8T", em que "A7" representa a
     *            casa de inicio do movimento, "B8" representa a casa de fim de movimento, e "T"
     *            representa a peca de promocao do Peao (neste caso, uma Torre).
     * @return true, se o movimento tiver sido executado com sucesso. false, caso contrario.
     */
    public boolean jogar(String movimento) {
        String idCasaOrigem = getIdCasaOrigem(movimento);
        String idCasaDestino = getIdCasaDestino(movimento);

        Peca pecaOrigem = get(idCasaOrigem);

        if (!validarPecaOrigemMovimento(pecaOrigem)) {
            return false;
        }

        if (pecaOrigem.validarMovimento(idCasaDestino, this)) {
            moverPeca(movimento);
            atualizarSituacao(false);
            atualizarTurno();
            return true;
        }

        return false;
    }

    private boolean validarPecaOrigemMovimento(Peca pecaOrigem) {
        return pecaOrigem != null && (pecaOrigem.getCor() == turno);
    }

    public int calcularDistanciaColunas(String casaOrigem, String casaDestino) {
        int ordemColunaOrigem = getOrdemColuna(casaOrigem);
        int ordemColunaDestino = getOrdemColuna(casaDestino);

        return Math.abs(ordemColunaDestino - ordemColunaOrigem);
    }

    public int calcularDistanciaLinhas(String casaOrigem, String casaDestino) {
        int linhaOrigem = getOrdemLinha(casaOrigem);
        int linhaDestino = getOrdemLinha(casaDestino);

        return Math.abs(linhaDestino - linhaOrigem);
    }

    public void moverPeca(String movimento) {
        String idCasaOrigem = getIdCasaOrigem(movimento);
        String idCasaDestino = getIdCasaDestino(movimento);
        Peca pecaOrigem = get(idCasaOrigem);
        Peca pecaDestino = get(idCasaDestino);

        if (pecaDestino != null || pecaOrigem.getTipo() == Tipo.Peao) {
            setContadorMovimentosSemCapturaOuMovimentoPeao(0);
        } else {
            setContadorMovimentosSemCapturaOuMovimentoPeao(getContadorMovimentosSemCapturaOuMovimentoPeao() + 1);
        }

        boolean corPecaOrigemBranca = pecaOrigem.getCor() == Cor.BRANCA;
        int linhaDestino = getOrdemLinha(idCasaDestino);
        boolean movimentoPromoverPeao = false;

        if (pecaOrigem.getTipo() == Tipo.Peao && calcularDistanciaLinhas(idCasaOrigem, idCasaDestino) == 2) {
            // peao avanca duas casas
            setIdCasaPeaoEnPassant(idCasaDestino);
        } else if (pecaOrigem.getTipo() == Tipo.Peao && calcularDistanciaColunas(idCasaOrigem, idCasaDestino) == 1
            && pecaDestino == null) {
            set(getIdCasaPeaoEnPassant(), null);
            setIdCasaPeaoEnPassant(null);
            // peao captura en passant
        } else if (pecaOrigem.getTipo() == Tipo.Peao
            && ((corPecaOrigemBranca && linhaDestino == 7) || (!corPecaOrigemBranca && linhaDestino == 0))) {
            movimentoPromoverPeao = true;
            setIdCasaPeaoEnPassant(null);
            // peao eh promovido
        } else if (pecaOrigem.getTipo() == Tipo.Rei && calcularDistanciaColunas(idCasaOrigem, idCasaDestino) == 2) {
            // movimento de roque
            RoqueDto roque = new RoqueDto(idCasaOrigem, idCasaDestino, this);
            set(roque.getIdCasaAdjacenteAoRei(), roque.getTorreRoque());
            set(roque.getIdCasaTorreRoque(), null);
            setIdCasaPeaoEnPassant(null);
        } else {
            setIdCasaPeaoEnPassant(null);
        }

        set(idCasaOrigem, null);
        set(idCasaDestino,
            movimentoPromoverPeao ? criarPecaSubstituicao(movimento, pecaOrigem.getCor(), idCasaDestino) : pecaOrigem);

        atualizarSituacaoReisETorres(idCasaOrigem);
    }

    private void atualizarSituacaoReisETorres(String idCasaOrigem) {
        switch (idCasaOrigem) {
        case "A1":
            setTorreBrancaAlaDamaMovida(true);
            break;
        case "E1":
            setReiBrancoMovido(true);
            break;
        case "H1":
            setTorreBrancaAlaReiMovida(true);
            break;
        case "A8":
            setTorrePretaAlaDamaMovida(true);
            break;
        case "E8":
            setReiPretoMovido(true);
            break;
        case "H8":
            setTorrePretaAlaReiMovida(true);
            break;
        }
    }

    public static String getIdCasaDestino(String movimento) {
        return movimento.substring(2, 4);
    }

    public static String getIdCasaOrigem(String movimento) {
        return movimento.substring(0, 2);
    }

    private Peca criarPecaSubstituicao(String movimento, Cor corPeca, String idCasa) {
        String pecaSubstituicao = movimento.length() == 5 ? movimento.substring(4) : null;

        if (pecaSubstituicao != null) {
            switch (pecaSubstituicao) {
            case "T":
                return new Torre(corPeca, idCasa);
            case "C":
                return new Cavalo(corPeca, idCasa);
            case "B":
                return new Bispo(corPeca, idCasa);
            case "D":
                return new Dama(corPeca, idCasa);
            }
        }
        return new Dama(corPeca, idCasa);
    }

    public void setIdCasaPeaoEnPassant(String idCasaPeaoEnPassant) {
        this.idCasaPeaoEnPassant = idCasaPeaoEnPassant;
    }

    public String getIdCasaPeaoEnPassant() {
        return idCasaPeaoEnPassant;
    }

    private void atualizarTurno() {
        if (!fimDeJogo()) {
            turno = isTurnoBrancas() ? Cor.PRETA : Cor.BRANCA;
        }
    }

    private void atualizarSituacao(boolean turnoAtual) {
        boolean xequeBrancas = verificarXeque(Cor.BRANCA);
        boolean xequePretas = verificarXeque(Cor.PRETA);

        if (xequeBrancas) {
            situacao = Situacao.Xeque_Brancas;
            if (verificarXequeMate(Cor.BRANCA)) {
                situacao = Situacao.Xeque_Mate_Brancas;
            }
        } else if (xequePretas) {
            situacao = Situacao.Xeque_Pretas;
            if (verificarXequeMate(Cor.PRETA)) {
                situacao = Situacao.Xeque_Mate_Pretas;
            }
        } else if (verificarEmpate(turnoAtual)) {
            situacao = Situacao.Empate;
        } else {
            situacao = Situacao.Em_Andamento;
        }
    }

    private boolean verificarEmpate(boolean turnoAtual) {
        if (verificarEmpate50Lances()) {
            return true;
        } else if (verificarEmpateInsuficienciaMaterial()) {
            return true;
        } else if (verificarEmpateAfogamento(turnoAtual)) {
            return true;
        }

        return false;
    }

    private boolean verificarEmpateAfogamento(boolean turnoAtual) {
        // afogamento (nao esta em xeque mas nao tem nenhum movimento possivel)
        if (turnoAtual) {
            return verificarEmpateAfogamento(turno);
        } else {
            return verificarEmpateAfogamento(isTurnoBrancas() ? Cor.PRETA : Cor.BRANCA);
        }
    }

    private boolean verificarEmpateAfogamento(Cor cor) {
        for (Coluna coluna : Coluna.values()) {
            for (Linha linha : Linha.values()) {
                Peca pecaOrigem = get(coluna, linha);
                if (pecaOrigem != null && pecaOrigem.getCor() == cor) {
                    if (pecaOrigem.getMovimentosValidos(this).size() > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean verificarEmpateInsuficienciaMaterial() {
        // insuficiencia material
        int contadorPecas = 0;
        int contadorCavalosBrancos = 0;
        int contadorCavalosPretos = 0;
        int contadorBisposBrancos = 0;
        int contadorBisposPretos = 0;
        for (Coluna coluna : Coluna.values()) {
            for (Linha linha : Linha.values()) {
                Peca peca = get(coluna, linha);
                if (peca != null) {
                    if (++contadorPecas > 4 || peca.getTipo() != Tipo.Rei && peca.getTipo() != Tipo.Bispo
                        && peca.getTipo() != Tipo.Cavalo) {
                        return false;
                    }
                    if (peca.getTipo() == Tipo.Bispo && peca.getCor() == Cor.BRANCA) {
                        if (++contadorBisposBrancos > 1) {
                            return false;
                        }
                    }
                    if (peca.getTipo() == Tipo.Bispo && peca.getCor() == Cor.PRETA) {
                        if (++contadorBisposPretos > 1) {
                            return false;
                        }
                    }
                    if (peca.getTipo() == Tipo.Cavalo && peca.getCor() == Cor.BRANCA) {
                        ++contadorCavalosBrancos;
                    }
                    if (peca.getTipo() == Tipo.Cavalo && peca.getCor() == Cor.PRETA) {
                        ++contadorCavalosPretos;
                    }
                }
            }
        }
        int contadorPecasBrancas = 1 + contadorBisposBrancos + contadorCavalosBrancos;
        int contadorPecasPretas = 1 + contadorBisposPretos + contadorCavalosPretos;
        if (contadorPecasBrancas > 1 && contadorPecasPretas > 1) {
            return false;
        }
        if (contadorBisposBrancos > 0 && contadorCavalosBrancos > 0
            || contadorBisposPretos > 0 && contadorCavalosPretos > 0) {
            return false;
        }

        return true;
    }

    private boolean verificarEmpate50Lances() {
        // 50 lances consecutivos sem captura ou movimento de peoes
        if (getContadorMovimentosSemCapturaOuMovimentoPeao() == 50) {
            return true;
        }

        return false;
    }

    private boolean verificarXequeMate(Cor corReiEmXeque) {
        boolean pecaPodeCapturarAmeacaRei = false;
        boolean ataquePodeSerObstruido = false;

        String casaReiEmXeque = localizar(Tipo.Rei, corReiEmXeque);
        Peca reiEmXeque = get(casaReiEmXeque);
        List<String> movimentosValidosDoRei = reiEmXeque.getMovimentosValidos(this);
        boolean reiPodeSeMoverEmSeguranca = movimentosValidosDoRei.size() != 0;

        if (!reiPodeSeMoverEmSeguranca) {
            // se houver mais de uma ameaca simultanea e o rei nao pode se mover, com certeza eh xeque-mate
            String casaAmeacaRei = estaAmeacada(casaReiEmXeque).get(0);
            List<String> casasCapturamAmeacaRei = estaAmeacada(casaAmeacaRei);
            for (String casaCapturaAmeacaRei : casasCapturamAmeacaRei) {
                Peca pecaCapturaAmeacaRei = get(casaCapturaAmeacaRei);
                pecaPodeCapturarAmeacaRei = pecaCapturaAmeacaRei.validarMovimento(casaAmeacaRei, this);
                if (pecaPodeCapturarAmeacaRei) {
                    break;
                }
            }

            if (!pecaPodeCapturarAmeacaRei) {
                Peca pecaAmeacaRei = get(casaAmeacaRei);
                List<String> casasIntermediarias = pecaAmeacaRei.getCasasIntermediarias(casaReiEmXeque, this);
                for (String casaIntermediaria : casasIntermediarias) {
                    String idCasaObstruiAtaque = podeSerAtacada(corReiEmXeque, casaIntermediaria);
                    if (idCasaObstruiAtaque != null) {
                        ataquePodeSerObstruido = true;
                    }
                }
            }

        }

        return !reiPodeSeMoverEmSeguranca && !ataquePodeSerObstruido && !pecaPodeCapturarAmeacaRei;

    }

    public String podeSerAtacada(Cor corAmeaca, String idCasaDestino) {
        for (Coluna coluna : Coluna.values()) {
            for (Linha linha : Linha.values()) {
                String idCasaOrigem = getIdCasa(coluna, linha);
                Peca pecaOrigem = get(idCasaOrigem);

                if (pecaOrigem != null && pecaOrigem.getCor() == corAmeaca
                    && pecaOrigem.validarMovimento(idCasaDestino, this)) {
                    return idCasaOrigem;
                }
            }
        }
        return null;

    }

    public List<String> estaAmeacada(String idCasaDestinoNaoNula) {
        Peca pecaOrigem = get(idCasaDestinoNaoNula);
        return estaAmeacada(pecaOrigem.getCor(), idCasaDestinoNaoNula);
    }

    public List<String> estaAmeacada(Cor corAmeacada, String idCasaDestino) {
        List<String> idsCasasQueAmeacam = new ArrayList<>();

        for (Coluna coluna : Coluna.values()) {
            for (Linha linha : Linha.values()) {
                String idCasaOrigem = getIdCasa(coluna, linha);
                Peca pecaOrigem = get(idCasaOrigem);
                if (pecaOrigem != null && pecaOrigem.verificarAmeaca(corAmeacada, idCasaDestino, this)) {
                    idsCasasQueAmeacam.add(idCasaOrigem);
                }
            }
        }
        return idsCasasQueAmeacam;
    }

    private String localizar(Tipo tipo, Cor cor) {
        for (Coluna coluna : Coluna.values()) {
            for (Linha linha : Linha.values()) {
                Peca peca = get(coluna, linha);
                if (peca != null && peca.getTipo() == tipo && peca.getCor() == cor) {
                    return getIdCasa(coluna, linha);
                }
            }
        }
        return null;
    }

    public static boolean validarMovimento(String movimento) {
        return movimento.matches("[A-H][1-8][A-H]([1-8]|[18][TCBD])")
            && !getIdCasaOrigem(movimento).equals(getIdCasaDestino(movimento));
    }

    public boolean fimDeJogo() {
        return situacao != Situacao.Xeque_Brancas && situacao != Situacao.Xeque_Pretas
            && situacao != Situacao.Em_Andamento;
    }

    /**
     * Verifica se o turno atual eh das pecas brancas.
     * 
     * @return true se a cor da vez no jogo eh das pecas brancas. false caso contrario.
     */
    public boolean isTurnoBrancas() {
        return turno == Cor.BRANCA;
    }

    /**
     * Recupera a situacao (estado atual) do jogo.
     * 
     * @return o estado atual do jogo.
     */
    public Situacao getSituacao() {
        return situacao;
    }

    private static Coluna getColuna(String idCasa) {
        return Xadrez.Coluna.valueOf(idCasa.substring(0, 1));
    }

    private static Linha getLinha(String idCasa) {
        return Xadrez.Linha.valueOf("_" + idCasa.substring(1, 2));
    }

    public int getOrdemColuna(String idCasa) {
        return getColuna(idCasa).ordinal();
    }

    public int getOrdemLinha(String idCasa) {
        return getLinha(idCasa).ordinal();
    }

    /**
     * Recupera o id da casa identificada pela ordem da coluna e pela ordem da linha no tabuleiro. Por
     * exemplo, para ordemColuna = 0 e ordemLinha = 7, o id da casa eh A8.
     * 
     * @param ordemColuna
     *            a ordem da coluna de 0 a 7 (0 para coluna A e 7 para coluna H).
     * @param ordemLinha
     *            a ordem da linha de 0 a 7 (0 para linha 1 e 7 para linha 8).
     * @return o id da casa que corresponde a coluna e a linha informadas.
     */
    public String getIdCasa(int ordemColuna, int ordemLinha) {
        return Coluna.values()[ordemColuna].name() + (ordemLinha + 1);
    }

    public String getIdCasa(Coluna coluna, Linha linha) {
        return coluna.name() + (linha.ordinal() + 1);
    }

    public String getIdCasa(String idCasa, int offsetColunas, int offsetLinhas) {
        int coluna = getOrdemColuna(idCasa) + offsetColunas;
        int linha = getOrdemLinha(idCasa) + offsetLinhas;

        if (coluna >= 0 && coluna <= 7 && linha >= 0 && linha <= 7) {
            String idCasaOffset = getIdCasa(coluna, linha);
            return idCasaOffset;
        }

        return null;
    }

    public boolean verificarXeque(Cor cor) {
        String casaRei = localizar(Tipo.Rei, cor);
        return estaAmeacada(casaRei).size() > 0;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    /**
     * Recupera o turno atual do jogo (brancas ou pretas).
     * 
     * @return o turno atual do jogo (a cor da vez).
     */
    public Cor getTurno() {
        return turno;
    }

    public void setTurno(Cor corTurno) {
        this.turno = corTurno;
    }

    public int getContadorMovimentosSemCapturaOuMovimentoPeao() {
        return contadorMovimentosSemCapturaOuMovimentoPeao;
    }

    public void setContadorMovimentosSemCapturaOuMovimentoPeao(int contadorMovimentosSemCapturaOuMovimentoPeao) {
        this.contadorMovimentosSemCapturaOuMovimentoPeao = contadorMovimentosSemCapturaOuMovimentoPeao;
    }

    @Override
    public String toString() {
        StringBuilder tabuleiroAsString = new StringBuilder();

        String EOF = System.getProperty("line.separator");
        tabuleiroAsString.append("opcao_pecas=" + opcaoPecas + EOF);
        tabuleiroAsString.append("turno=" + turno + EOF);
        tabuleiroAsString.append("id_casa_peao_en_passant=" + idCasaPeaoEnPassant + EOF);
        tabuleiroAsString
            .append("contador_movimentos_sem_captura=" + contadorMovimentosSemCapturaOuMovimentoPeao + EOF);
        tabuleiroAsString.append("rei_branco_movido=" + reiBrancoMovido + EOF);
        tabuleiroAsString.append("torre_branca_ala_rei_movida=" + torreBrancaAlaReiMovida + EOF);
        tabuleiroAsString.append("torre_branca_ala_dama_movida=" + torreBrancaAlaDamaMovida + EOF);
        tabuleiroAsString.append("rei_preto_movido=" + reiPretoMovido + EOF);
        tabuleiroAsString.append("torre_preta_ala_rei_movida=" + torrePretaAlaReiMovida + EOF);
        tabuleiroAsString.append("torre_preta_ala_dama_movida=" + torrePretaAlaDamaMovida + EOF);
        for (int i = 0; i <= tabuleiro.length - 1; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiroAsString.append(" " + (tabuleiro[i][j] != null ? tabuleiro[i][j] : "-") + " ");
            }
            tabuleiroAsString.append(EOF);
        }

        return tabuleiroAsString.toString();
    }

    public boolean isReiBrancoMovido() {
        return reiBrancoMovido;
    }

    public void setReiBrancoMovido(boolean reiBrancoMovido) {
        this.reiBrancoMovido = reiBrancoMovido;
    }

    public boolean isTorreBrancaAlaReiMovida() {
        return torreBrancaAlaReiMovida;
    }

    public void setTorreBrancaAlaReiMovida(boolean torreBrancaAlaReiMovida) {
        this.torreBrancaAlaReiMovida = torreBrancaAlaReiMovida;
    }

    public boolean isTorreBrancaAlaDamaMovida() {
        return torreBrancaAlaDamaMovida;
    }

    public void setTorreBrancaAlaDamaMovida(boolean torreBrancaAlaDamaMovida) {
        this.torreBrancaAlaDamaMovida = torreBrancaAlaDamaMovida;
    }

    public boolean isReiPretoMovido() {
        return reiPretoMovido;
    }

    public void setReiPretoMovido(boolean reiPretoMovido) {
        this.reiPretoMovido = reiPretoMovido;
    }

    public boolean isTorrePretaAlaReiMovida() {
        return torrePretaAlaReiMovida;
    }

    public void setTorrePretaAlaReiMovida(boolean torrePretaAlaReiMovida) {
        this.torrePretaAlaReiMovida = torrePretaAlaReiMovida;
    }

    public boolean isTorrePretaAlaDamaMovida() {
        return torrePretaAlaDamaMovida;
    }

    public void setTorrePretaAlaDamaMovida(boolean torrePretaAlaDamaMovida) {
        this.torrePretaAlaDamaMovida = torrePretaAlaDamaMovida;
    }

    public String proximoMovimento(ModoJogo modoJogo) {
        if (modoJogo == ModoJogo.SIMULADO) {
            return isTurnoBrancas() ? algoritmo1.jogar(this) : algoritmo2.jogar(this);
        } else if (modoJogo == ModoJogo.UM_JOGADOR && (opcaoPecas == OpcaoPecas.BRANCA && !isTurnoBrancas()
            || opcaoPecas == OpcaoPecas.PRETA && isTurnoBrancas())) {
            return algoritmo1.jogar(this);
        }
        return null;
    }

    /**
     * Recupera uma lista com todas as pecas da cor do turno (vez de jogar) presentes no tabuleiro.
     * 
     * @return todas as pecas da cor do turno presentes no tabuleiro.
     */
    public List<Peca> recuperarPecasDoTurno() {
        List<Peca> pecasDoTurno = new ArrayList<>();
        for (Coluna coluna : Coluna.values()) {
            for (Linha linha : Linha.values()) {
                Peca peca = get(coluna, linha);
                if (peca != null && peca.getCor() == getTurno()) {
                    pecasDoTurno.add(peca);
                }
            }
        }
        return pecasDoTurno;
    }

}
