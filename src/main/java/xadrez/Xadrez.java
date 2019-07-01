package xadrez;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import xadrez.Xadrez.Situacao;
import xadrez.alg.AlgoritmoAleatorio;
import xadrez.alg.AlgoritmoXadrez;
import xadrez.movimentos.RoqueDto;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;
import xadrez.pecas.Peca.Tipo;

/**
 * Representa a logica do jogo de Xadrez.
 *
 */
public class Xadrez {
    public enum Situacao {
        Brancas_em_xeque("Brancas em xeque"), Pretas_em_xeque("Pretas em xeque"), Brancas_em_xeque_mate(
            "Brancas em xeque-mate"), Pretas_em_xeque_mate("Pretas em xeque-mate"), Empate, Em_andamento("Em andamento");

        private String descricao;

        private Situacao() {
        }

        private Situacao(String descricao) {
            this.descricao = descricao;
        }

        @Override
        public String toString() {
            return descricao != null ? descricao : name();
        }
    }
    
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
    private Situacao situacao = Situacao.Em_andamento;
    private boolean roqueAlaReiBrancoPossivel = true;
    private boolean roqueAlaDamaBrancaPossivel = true;
    private boolean roqueAlaReiPretoPossivel = true;
    private boolean roqueAlaDamaPretaPossivel = true;
    private int contadorJogadasCompletas = 1;
    private AlgoritmoXadrez algoritmo1;
    private AlgoritmoXadrez algoritmo2;
    private Map<String, Integer> historicoPosicoes = new HashMap<>();
    private boolean damaPretaCapturada = true;
    private boolean damaBrancaCapturada = true;
    private String idCasaReiBranco = null;
    private String idCasaReiPreto = null;
    private String fenCode = null;
    private String representacaoString = null;
    private Set<String> casasQueAmeacamRei = new HashSet<>();
    private List<Estado> historicoEstados = new ArrayList<>();
    private String ultimoMovimento = null;

    // Construtor usado pela API
    public Xadrez() {
        this(OpcaoPecas.BRANCA);
    }

    // Construtor usado para clonar.
    private Xadrez(Peca[][] tabuleiro, OpcaoPecas opcaoPecas) {
        this.opcaoPecas = opcaoPecas;
        this.tabuleiro = tabuleiro;
    }

    private Xadrez(OpcaoPecas opcaoPecas, String classeAlgoritmo1, String classeAlgoritmo2) {
        this(opcaoPecas);
        carregarAlgoritmos(classeAlgoritmo1, classeAlgoritmo2);
    }

    public Xadrez(OpcaoPecas opcaoPecas, String classeAlgoritmo1, String classeAlgoritmo2, Object... params) {
        this(opcaoPecas, classeAlgoritmo1, classeAlgoritmo2);
        configurarAlgoritmos(params);
    }

    public Xadrez(OpcaoPecas opcaoPecas) {
        this.opcaoPecas = opcaoPecas != null ? opcaoPecas : OpcaoPecas.BRANCA;
        criarTabuleiro();
        atualizarSituacaoInicial();
        registrarPosicaoInicial();
    }

    public Xadrez(File arquivo, String classeAlgoritmo1, String classeAlgoritmo2)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException {
        this(arquivo);
        carregarAlgoritmos(classeAlgoritmo1, classeAlgoritmo2);
    }

    public Xadrez(File arquivo, String classeAlgoritmo1, String classeAlgoritmo2, Object... params)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException {
        this(arquivo, classeAlgoritmo1, classeAlgoritmo2);
        configurarAlgoritmos(params);
    }

    public Xadrez(File arquivo) throws FileNotFoundException {
        carregarDoArquivo(arquivo);
        atualizarSituacaoInicial();
        registrarPosicaoInicial();
    }

    public Xadrez(Scanner scanner, String classeAlgoritmo1, String classeAlgoritmo2, Object... params) {
        carregar(scanner);
        atualizarSituacaoInicial();
        registrarPosicaoInicial();
        carregarAlgoritmos(classeAlgoritmo1, classeAlgoritmo2);
        configurarAlgoritmos(params);
    }

    private void carregarAlgoritmos(String classeAlgoritmo1, String classeAlgoritmo2) {
        try {
            if (classeAlgoritmo1 != null) {
                algoritmo1 = (AlgoritmoXadrez) Class.forName(classeAlgoritmo1).newInstance();
            } else {
                algoritmo1 = new AlgoritmoAleatorio();
            }
            if (classeAlgoritmo2 != null) {
                algoritmo2 = (AlgoritmoXadrez) Class.forName(classeAlgoritmo2).newInstance();
            } else {
                algoritmo2 = new AlgoritmoAleatorio();
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void configurarAlgoritmos(Object... params) {
        Object[] paramsAlg1 = new Object[params.length / 2];
        Object[] paramsAlg2 = new Object[params.length / 2];
        for (int i = 0; i < params.length / 2; i++) {
            paramsAlg1[i] = params[i];
            paramsAlg2[i] = params[i + params.length / 2];
        }
        algoritmo1.setParametros(paramsAlg1);
        algoritmo2.setParametros(paramsAlg2);
    }

    public void registrarPosicaoInicial() {
        registrarPosicao(false);
    }

    public void registrarPosicao() {
        registrarPosicao(true);
    }

    public void registrarPosicao(boolean trocarTurno) {
        if (trocarTurno) {
            atualizarTurno();
        }
        String posicaoAtual = getPosicao();
        Integer numeroOcorrenciasPosicaoAtual = historicoPosicoes.get(posicaoAtual);
        if (numeroOcorrenciasPosicaoAtual == null) {
            historicoPosicoes.put(posicaoAtual, 1);
        } else {
            historicoPosicoes.put(posicaoAtual, ++numeroOcorrenciasPosicaoAtual);
        }

        if (trocarTurno) {
            historicoEstados.get(historicoEstados.size() - 1).setPosicaoAtual(posicaoAtual);
            atualizarTurno();
        }
    }

    /**
     * Simula uma jogada e retorna a situacao do jogo depois que a jogada ocorre.
     * 
     * @param movimento
     *            o movimento de peca a ser realizado pela jogada.
     * @return a situacao do jogo apos executar a jogada.
     */
    public Situacao simularJogada(String movimento) {
        boolean jogou = jogar(movimento);
        Situacao situacaoFutura = getSituacao();
        if (jogou) {
            retornarEstadoAnterior();
        }
        return situacaoFutura;
    }

    public void carregar(Scanner scanner) {
        opcaoPecas = scanner.nextLine().split("=")[1].equals("BRANCA") ? OpcaoPecas.BRANCA : OpcaoPecas.PRETA;
        turno = scanner.nextLine().split("=")[1].equals("BRANCA") ? Cor.BRANCA : Cor.PRETA;
        idCasaPeaoEnPassant = scanner.nextLine().split("=")[1];
        idCasaPeaoEnPassant = idCasaPeaoEnPassant.equals("null") ? null : idCasaPeaoEnPassant;
        contadorMovimentosSemCapturaOuMovimentoPeao = Integer.valueOf(scanner.nextLine().split("=")[1]);
        setRoqueAlaReiBrancoPossivel(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setRoqueAlaDamaBrancaPossivel(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setRoqueAlaReiPretoPossivel(scanner.nextLine().split("=")[1].equals("true") ? true : false);
        setRoqueAlaDamaPretaPossivel(scanner.nextLine().split("=")[1].equals("true") ? true : false);

        for (int i = 0; i <= Xadrez.Linha.values().length - 1; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                String idCasaPeca = getIdCasa(getOrdemColuna(j), getOrdemLinha(i));
                tabuleiro[i][j] = Peca.criar(scanner.next(), idCasaPeca);

                if (tabuleiro[i][j] != null && tabuleiro[i][j].getTipo() == Peca.Tipo.Rei) {
                    if (tabuleiro[i][j].getCor() == Cor.BRANCA) {
                        idCasaReiBranco = idCasaPeca;
                    } else {
                        idCasaReiPreto = idCasaPeca;
                    }
                }

                if (tabuleiro[i][j] != null && tabuleiro[i][j].getTipo() == Peca.Tipo.Dama) {
                    if (tabuleiro[i][j].getCor() == Cor.BRANCA) {
                        damaBrancaCapturada = false;
                    } else {
                        damaPretaCapturada = false;
                    }
                }
            }
        }
        scanner.close();
    }

    public void carregarDaRepresentacaoString() {
        carregar(new Scanner(getRepresentacaoString()));
    }

    public void carregarDoArquivo(File arquivo) throws FileNotFoundException {
        carregar(new Scanner(arquivo));
    }

    public int getOrdemLinha(int i) {
        return opcaoPecas == OpcaoPecas.PRETA ? i : (7 - i);
    }

    public int getOrdemColuna(int j) {
        return opcaoPecas == OpcaoPecas.BRANCA ? j : (7 - j);
    }

    private void criarTabuleiro() {
        criarPecas(8, Cor.PRETA);
        for (Coluna coluna : Coluna.values()) {
            put(Peca.criar(Tipo.Peao, Cor.PRETA, coluna.name() + "7"));
            put(Peca.criar(Tipo.Peao, Cor.BRANCA, coluna.name() + "2"));
        }
        criarPecas(1, Cor.BRANCA);

        idCasaReiBranco = "E1";
        idCasaReiPreto = "E8";
        damaBrancaCapturada = false;
        damaPretaCapturada = false;
    }

    private void criarPecas(int ordemLinha, Cor cor) {
        put(Peca.criar(Tipo.Torre, cor, "A" + ordemLinha));
        put(Peca.criar(Tipo.Cavalo, cor, "B" + ordemLinha));
        put(Peca.criar(Tipo.Bispo, cor, "C" + ordemLinha));
        put(Peca.criar(Tipo.Dama, cor, "D" + ordemLinha));
        put(Peca.criar(Tipo.Rei, cor, "E" + ordemLinha));
        put(Peca.criar(Tipo.Bispo, cor, "F" + ordemLinha));
        put(Peca.criar(Tipo.Cavalo, cor, "G" + ordemLinha));
        put(Peca.criar(Tipo.Torre, cor, "H" + ordemLinha));
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

            if (peca.getTipo() == Peca.Tipo.Rei) {
                if (peca.getCor() == Cor.BRANCA) {
                    setIdCasaReiBranco(idCasa);
                } else {
                    setIdCasaReiPreto(idCasa);
                }
            }
        }
    }

    public OpcaoPecas getOpcaoPecas() {
        return opcaoPecas;
    }

    public void setOpcaoPecas(OpcaoPecas opcaoPecas) {
        this.opcaoPecas = opcaoPecas;
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
        return jogar(movimento, false);
    }

    public boolean jogar(String movimento, boolean naoValidar) {
        if (naoValidar || validarMovimento(movimento)) {
            moverPeca(movimento);
            registrarPosicao();
            atualizarSituacao(movimento);
            atualizarTurno();
            return true;
        }

        return false;
    }

    private void registrarEstado(String idCasaOrigem, String idCasaDestino, Peca pecaOrigem, Peca pecaDestino) {
        Estado estadoAnterior = new Estado();
        estadoAnterior.setContadorMovimentosSemCapturaOuMovimentoPeao(contadorMovimentosSemCapturaOuMovimentoPeao);
        estadoAnterior.setContadorJogadasCompletas(contadorJogadasCompletas);
        estadoAnterior.setDamaBrancaCapturada(damaBrancaCapturada);
        estadoAnterior.setDamaPretaCapturada(damaPretaCapturada);
        estadoAnterior.setIdCasaDestino(idCasaDestino);
        estadoAnterior.setIdCasaOrigem(idCasaOrigem);
        estadoAnterior.setIdCasaPeaoEnPassant(idCasaPeaoEnPassant);
        estadoAnterior.setIdCasaReiBranco(idCasaReiBranco);
        estadoAnterior.setIdCasaReiPreto(idCasaReiPreto);
        estadoAnterior.setRoqueAlaDamaBrancaPossivel(roqueAlaDamaBrancaPossivel);
        estadoAnterior.setRoqueAlaDamaPretaPossivel(roqueAlaDamaPretaPossivel);
        estadoAnterior.setRoqueAlaReiBrancoPossivel(roqueAlaReiBrancoPossivel);
        estadoAnterior.setRoqueAlaReiPretoPossivel(roqueAlaReiPretoPossivel);
        estadoAnterior.setSituacao(situacao);
        estadoAnterior.setTurno(turno);
        estadoAnterior.setUltimoMovimento(ultimoMovimento);

        estadoAnterior.setPecaDestino(pecaDestino); // objeto
        estadoAnterior.setPecaOrigem(pecaOrigem); // objeto
        estadoAnterior.setCasasQueAmeacamRei(new HashSet<>(casasQueAmeacamRei)); // objeto
        if (idCasaPeaoEnPassant != null) {
            Peca peaoEnPassant = get(
                getIdCasa(getIdCasaPeaoEnPassant(), 0, getIdCasaPeaoEnPassant().endsWith("3") ? 1 : -1));
            estadoAnterior.setPeaoEnPassant(peaoEnPassant); // objeto
        }

        historicoEstados.add(estadoAnterior);
    }

    public void retornarEstadoAnterior() {
        if (historicoEstados.size() == 0) {
            return;
        }

        Estado estadoAnterior = historicoEstados.get(historicoEstados.size() - 1);
        contadorMovimentosSemCapturaOuMovimentoPeao = estadoAnterior.getContadorMovimentosSemCapturaOuMovimentoPeao();
        contadorJogadasCompletas = estadoAnterior.getContadorJogadasCompletas();
        damaBrancaCapturada = estadoAnterior.isDamaBrancaCapturada();
        damaPretaCapturada = estadoAnterior.isDamaPretaCapturada();
        idCasaPeaoEnPassant = estadoAnterior.getIdCasaPeaoEnPassant();
        if (idCasaPeaoEnPassant != null) {
            set(getIdCasa(getIdCasaPeaoEnPassant(), 0, getIdCasaPeaoEnPassant().endsWith("3") ? 1 : -1),
                estadoAnterior.getPeaoEnPassant()); // objeto
        }
        idCasaReiBranco = estadoAnterior.getIdCasaReiBranco();
        idCasaReiPreto = estadoAnterior.getIdCasaReiPreto();
        roqueAlaDamaBrancaPossivel = estadoAnterior.isRoqueAlaDamaBrancaPossivel();
        roqueAlaDamaPretaPossivel = estadoAnterior.isRoqueAlaDamaPretaPossivel();
        roqueAlaReiBrancoPossivel = estadoAnterior.isRoqueAlaReiBrancoPossivel();
        roqueAlaReiPretoPossivel = estadoAnterior.isRoqueAlaReiPretoPossivel();
        situacao = estadoAnterior.getSituacao();
        turno = estadoAnterior.getTurno();
        ultimoMovimento = estadoAnterior.getUltimoMovimento();

        set(estadoAnterior.getIdCasaDestino(), estadoAnterior.getPecaDestino()); // objeto
        set(estadoAnterior.getIdCasaOrigem(), estadoAnterior.getPecaOrigem()); // objeto
        casasQueAmeacamRei = estadoAnterior.getCasasQueAmeacamRei(); // objeto

        String posicao = estadoAnterior.getPosicaoAtual();
        Integer numOcorrenciasPosicao = historicoPosicoes.get(posicao);
        if (numOcorrenciasPosicao != null) {
            if (numOcorrenciasPosicao > 1) {
                historicoPosicoes.put(posicao, --numOcorrenciasPosicao);
            } else {
                historicoPosicoes.remove(posicao);
            }
        }

        RoqueDto roqueAnterior = estadoAnterior.getRoque(); // objeto
        if (roqueAnterior != null) {
            set(roqueAnterior.getIdCasaAdjacenteAoRei(), null);
            set(roqueAnterior.getIdCasaTorreRoque(), roqueAnterior.getTorreRoque());
        }

        historicoEstados.remove(estadoAnterior);
    }

    public List<Estado> getHistoricoEstados() {
        return historicoEstados;
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

        registrarEstado(idCasaOrigem, idCasaDestino, pecaOrigem, pecaDestino);

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
            setIdCasaPeaoEnPassant(getIdCasa(idCasaDestino, 0, idCasaDestino.endsWith("4") ? -1 : 1));
        } else if (pecaOrigem.getTipo() == Tipo.Peao && calcularDistanciaColunas(idCasaOrigem, idCasaDestino) == 1
            && pecaDestino == null) {
            // peao captura en passant
            set(getIdCasa(getIdCasaPeaoEnPassant(), 0, getIdCasaPeaoEnPassant().endsWith("3") ? 1 : -1), null);
            setIdCasaPeaoEnPassant(null);
        } else if (pecaOrigem.getTipo() == Tipo.Peao
            && ((corPecaOrigemBranca && linhaDestino == 7) || (!corPecaOrigemBranca && linhaDestino == 0))) {
            // peao eh promovido
            movimentoPromoverPeao = true;
            setIdCasaPeaoEnPassant(null);
        } else if (pecaOrigem.getTipo() == Tipo.Rei && calcularDistanciaColunas(idCasaOrigem, idCasaDestino) == 2) {
            // movimento de roque
            RoqueDto roque = new RoqueDto(idCasaOrigem, idCasaDestino, this);
            historicoEstados.get(historicoEstados.size() - 1).setRoque(roque); // objeto

            set(roque.getIdCasaAdjacenteAoRei(), roque.getTorreRoque());
            set(roque.getIdCasaTorreRoque(), null);
            setIdCasaPeaoEnPassant(null);
        } else {
            setIdCasaPeaoEnPassant(null);
        }

        set(idCasaOrigem, null);
        set(idCasaDestino,
            movimentoPromoverPeao ? criarPecaSubstituicao(movimento, pecaOrigem.getCor(), idCasaDestino) : pecaOrigem);

        if (!isTurnoBrancas()) {
            contadorJogadasCompletas++;
        }

        atualizarSituacaoReisETorres(idCasaOrigem);

        setUltimoMovimento(movimento);
    }

    private void atualizarSituacaoReisETorres(String idCasaOrigem) {
        switch (idCasaOrigem) {
        case "A1":
            setRoqueAlaDamaBrancaPossivel(false);
            break;
        case "E1":
            setRoqueAlaReiBrancoPossivel(false);
            setRoqueAlaDamaBrancaPossivel(false);
            break;
        case "H1":
            setRoqueAlaReiBrancoPossivel(false);
            break;
        case "A8":
            setRoqueAlaDamaPretaPossivel(false);
            break;
        case "E8":
            setRoqueAlaReiPretoPossivel(false);
            setRoqueAlaDamaPretaPossivel(false);
            break;
        case "H8":
            setRoqueAlaReiPretoPossivel(false);
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
                return Peca.criar(Tipo.Torre, corPeca, idCasa);
            case "C":
                return Peca.criar(Tipo.Cavalo, corPeca, idCasa);
            case "B":
                return Peca.criar(Tipo.Bispo, corPeca, idCasa);
            case "D":
                return Peca.criar(Tipo.Dama, corPeca, idCasa);
            }
        }
        return Peca.criar(Tipo.Dama, corPeca, idCasa);
    }

    public void setIdCasaPeaoEnPassant(String idCasaPeaoEnPassant) {
        this.idCasaPeaoEnPassant = idCasaPeaoEnPassant;
    }

    public String getIdCasaPeaoEnPassant() {
        return idCasaPeaoEnPassant;
    }

    private void atualizarTurno() {
        if (!ehFimDeJogo()) {
            turno = isTurnoBrancas() ? Cor.PRETA : Cor.BRANCA;
        }
    }

    private void atualizarSituacaoInicial() {
        atualizarSituacao(true, null);
    }

    private void atualizarSituacao(String movimento) {
        atualizarSituacao(false, movimento);
    }

    private void atualizarSituacao(boolean turnoAtual, String movimento) {
        boolean xequeBrancas = false;
        boolean xequePretas = false;

        // se inicio de jogo
        if (turnoAtual) {
            // nao eh possivel xeque em ambos os reis
            xequeBrancas = analisarXeque(Cor.BRANCA);
            if (!xequeBrancas) {
                xequePretas = analisarXeque(Cor.PRETA);
            }
        } else {
            // se as brancas jogaram, a jogada era valida e nao gerou xeque nas brancas
            if (isTurnoBrancas()) {
                xequePretas = analisarXeque(movimento, false);
            } else {
                xequeBrancas = analisarXeque(movimento, false);
            }
        }

        situacao = Situacao.Em_andamento;

        if (xequeBrancas) {
            situacao = Situacao.Brancas_em_xeque;
            if (verificarXequeMate(Cor.BRANCA)) {
                situacao = Situacao.Brancas_em_xeque_mate;
            }
        } else if (xequePretas) {
            situacao = Situacao.Pretas_em_xeque;
            if (verificarXequeMate(Cor.PRETA)) {
                situacao = Situacao.Pretas_em_xeque_mate;
            }
        }

        if (situacao != Situacao.Brancas_em_xeque_mate && situacao != Situacao.Pretas_em_xeque_mate) {
            if (verificarEmpate(turnoAtual)) {
                situacao = Situacao.Empate;
            }
        }
    }

    private boolean verificarEmpate(boolean turnoAtual) {
        if (verificarEmpate50Lances()) {
            return true;
        } else if (verificarEmpateTresPosicoes()) {
            return true;
        } else if (verificarEmpateInsuficienciaMaterial()) {
            return true;
        } else if (verificarEmpateAfogamento(turnoAtual)) {
            return true;
        }

        return false;
    }

    private boolean verificarEmpateTresPosicoes() {
        atualizarTurno();
        Integer numeroOcorrenciasPosicaoAtual = historicoPosicoes.get(this.getPosicao());
        atualizarTurno();
        if (numeroOcorrenciasPosicaoAtual != null && numeroOcorrenciasPosicaoAtual >= 3) {
            return true;
        }
        return false;
    }

    public String getPosicao() {
        int temp = this.contadorMovimentosSemCapturaOuMovimentoPeao;
        contadorMovimentosSemCapturaOuMovimentoPeao = 0;
        String posicao = toString();
        contadorMovimentosSemCapturaOuMovimentoPeao = temp;
        return posicao;
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
        boolean bispoBrancoCasaPreta = false;
        boolean bispoPretoCasaPreta = false;
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
                        bispoBrancoCasaPreta = verificarSePecaEstaNaCasaPreta(peca);
                    }
                    if (peca.getTipo() == Tipo.Bispo && peca.getCor() == Cor.PRETA) {
                        if (++contadorBisposPretos > 1) {
                            return false;
                        }
                        bispoPretoCasaPreta = verificarSePecaEstaNaCasaPreta(peca);
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
        if (contadorPecasBrancas == 2 && contadorPecasPretas == 2 && contadorBisposBrancos == 1
            && contadorBisposPretos == 1
            && (bispoBrancoCasaPreta && bispoPretoCasaPreta || !bispoBrancoCasaPreta && !bispoPretoCasaPreta)) {
            return true;
        }
        if (contadorPecasBrancas > 1 && contadorPecasPretas > 1) {
            return false;
        }
        if (contadorBisposBrancos > 0 && contadorCavalosBrancos > 0
            || contadorBisposPretos > 0 && contadorCavalosPretos > 0) {
            return false;
        }

        return true;
    }

    private boolean verificarSePecaEstaNaCasaPreta(Peca peca) {
        boolean pecaEstaNaCasaPreta = false;
        int ordemColuna = getOrdemColuna(peca.getIdCasa());
        int ordemLinha = getOrdemLinha(peca.getIdCasa());
        pecaEstaNaCasaPreta = ordemColuna % 2 == 0 && ordemLinha % 2 == 0
            || ordemColuna % 2 == 1 && ordemLinha % 2 == 1;
        return pecaEstaNaCasaPreta;
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

        String casaReiEmXeque = corReiEmXeque == Cor.BRANCA ? idCasaReiBranco : idCasaReiPreto;
        Peca reiEmXeque = get(casaReiEmXeque);
        List<String> movimentosValidosDoRei = reiEmXeque.getMovimentosValidos(this);
        boolean reiPodeSeMoverEmSeguranca = movimentosValidosDoRei.size() != 0;

        if (!reiPodeSeMoverEmSeguranca) {
            // se houver mais de uma ameaca simultanea e o rei nao pode se mover, com certeza eh xeque-mate
            if (casasQueAmeacamRei.size() > 1) {
                return true;
            }

            String casaAmeacaRei = casasQueAmeacamRei.iterator().next();
            Set<String> casasCapturamAmeacaRei = estaAmeacada(casaAmeacaRei);
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

    public Set<String> estaAmeacada(String idCasaDestinoNaoNula) {
        Peca pecaOrigem = get(idCasaDestinoNaoNula);
        return estaAmeacada(pecaOrigem.getCor(), idCasaDestinoNaoNula);
    }

    public Set<String> estaAmeacada(Cor corAmeacada, String idCasaDestino) {
        Set<String> idsCasasQueAmeacam = new HashSet<>();

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

    public static boolean validarEntrada(String movimento) {
        return movimento.matches("[A-H][1-8][A-H]([1-8]|[18][TCBD])")
            && !getIdCasaOrigem(movimento).equals(getIdCasaDestino(movimento));
    }

    public boolean validarMovimento(String movimento) {
        if (ehFimDeJogo()) {
            return false;
        }

        String idCasaOrigem = getIdCasaOrigem(movimento);
        String idCasaDestino = getIdCasaDestino(movimento);

        Peca pecaOrigem = get(idCasaOrigem);

        if (!validarPecaOrigemMovimento(pecaOrigem)) {
            return false;
        }

        return pecaOrigem.validarMovimento(idCasaDestino, this);

    }

    public boolean ehFimDeJogo() {
        return situacao == Situacao.Brancas_em_xeque_mate || situacao == Situacao.Pretas_em_xeque_mate
            || situacao == Situacao.Empate;
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

    public List<String> getCasasNaDirecao(String idCasaOrigem, String idCasaDestino, boolean ateCasaDestino) {
        List<String> casasNaDirecao = new ArrayList<>();
        int distanciaLinhas = calcularDistanciaLinhas(idCasaOrigem, idCasaDestino);
        int distanciaColunas = calcularDistanciaColunas(idCasaOrigem, idCasaDestino);

        if (distanciaColunas == distanciaLinhas || distanciaColunas == 0 || distanciaLinhas == 0) {
            int linhaOrigem = getOrdemLinha(idCasaOrigem);
            int linhaDestino = getOrdemLinha(idCasaDestino);
            int colunaOrigem = getOrdemColuna(idCasaOrigem);
            int colunaDestino = getOrdemColuna(idCasaDestino);

            int offsetLinha = distanciaLinhas == 0 ? 0 : (linhaDestino - linhaOrigem) > 0 ? 1 : -1;
            int offsetColuna = distanciaColunas == 0 ? 0 : (colunaDestino - colunaOrigem) > 0 ? 1 : -1;

            String idCasa = idCasaOrigem;
            while (idCasa != null) {
                idCasa = getIdCasa(idCasa, offsetColuna, offsetLinha);
                if (idCasa != null) {
                    if (ateCasaDestino && idCasa.equals(idCasaDestino)) {
                        break;
                    }
                    casasNaDirecao.add(idCasa);
                }
            }
        }

        return casasNaDirecao;
    }

    public boolean analisarXeque(String movimento, boolean xequeAmigo) {
        casasQueAmeacamRei = new HashSet<String>();

        String idCasaOrigem = getIdCasaOrigem(movimento);
        String idCasaDestino = getIdCasaDestino(movimento);

        Peca pecaDestino = get(idCasaDestino);
        
        //movimento de roque
        if (pecaDestino.getTipo() == Tipo.Rei && calcularDistanciaColunas(idCasaOrigem, idCasaDestino) == 2) {
            String idCasaAdjacenteAoRei = null;
            if (idCasaDestino.toUpperCase().startsWith("C")) {
                idCasaAdjacenteAoRei = "D" + idCasaDestino.substring(1);
            } else {
                idCasaAdjacenteAoRei = "F" + idCasaDestino.substring(1);
            }
            pecaDestino = get(idCasaAdjacenteAoRei);
        }

        String idCasaRei = null;
        if (xequeAmigo) {
            idCasaRei = pecaDestino.getCor() == Cor.BRANCA ? idCasaReiBranco : idCasaReiPreto;
        } else {
            idCasaRei = pecaDestino.getCor() == Cor.BRANCA ? idCasaReiPreto : idCasaReiBranco;
        }

        if (!xequeAmigo) {
            if (pecaDestino.verificarAmeaca(null, idCasaRei, this)) {
                casasQueAmeacamRei.add(idCasaDestino);
            }
        }

        List<String> casasNaDirecao = getCasasNaDirecao(idCasaRei, idCasaOrigem, false);
        for (String casaNaDirecao : casasNaDirecao) {
            Peca peca = get(casaNaDirecao);
            if (peca != null) {
                if (peca.verificarAmeaca(null, idCasaRei, this)) {
                    casasQueAmeacamRei.add(casaNaDirecao);
                }
                break;
            }
        }

        return casasQueAmeacamRei.size() > 0;
    }

    public boolean analisarXeque(Cor cor) {
        String casaRei = cor == Cor.BRANCA ? idCasaReiBranco : idCasaReiPreto;

        if ((casasQueAmeacamRei = estaAmeacada(casaRei)).size() > 0) {
            return true;
        }

        return false;
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
        tabuleiroAsString.append("roque_ala_rei_branco_possivel=" + roqueAlaReiBrancoPossivel + EOF);
        tabuleiroAsString.append("roque_ala_dama_branca_possivel=" + roqueAlaDamaBrancaPossivel + EOF);
        tabuleiroAsString.append("roque_ala_rei_preto_possivel=" + roqueAlaReiPretoPossivel + EOF);
        tabuleiroAsString.append("roque_ala_dama_preta_possivel=" + roqueAlaDamaPretaPossivel + EOF);
        for (int i = 0; i <= tabuleiro.length - 1; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiroAsString.append(" " + (tabuleiro[i][j] != null ? tabuleiro[i][j] : "-") + " ");
            }
            tabuleiroAsString.append(EOF);
        }

        return tabuleiroAsString.toString();
    }

    public boolean isRoqueAlaReiBrancoPossivel() {
        return roqueAlaReiBrancoPossivel;
    }

    public void setRoqueAlaReiBrancoPossivel(boolean roqueAlaReiBrancoPossivel) {
        this.roqueAlaReiBrancoPossivel = roqueAlaReiBrancoPossivel;
    }

    public boolean isRoqueAlaDamaBrancaPossivel() {
        return roqueAlaDamaBrancaPossivel;
    }

    public void setRoqueAlaDamaBrancaPossivel(boolean roqueAlaDamaBrancaPossivel) {
        this.roqueAlaDamaBrancaPossivel = roqueAlaDamaBrancaPossivel;
    }

    public boolean isRoqueAlaReiPretoPossivel() {
        return roqueAlaReiPretoPossivel;
    }

    public void setRoqueAlaReiPretoPossivel(boolean roqueAlaReiPretoPossivel) {
        this.roqueAlaReiPretoPossivel = roqueAlaReiPretoPossivel;
    }

    public boolean isRoqueAlaDamaPretaPossivel() {
        return roqueAlaDamaPretaPossivel;
    }

    public void setRoqueAlaDamaPretaPossivel(boolean roqueAlaDamaPretaPossivel) {
        this.roqueAlaDamaPretaPossivel = roqueAlaDamaPretaPossivel;
    }

    public String procurarMelhorMovimento(ModoJogo modoJogo) {
        String melhorMovimento = null;
        if (!ehFimDeJogo()) {
            if (modoJogo == ModoJogo.SIMULADO) {
                melhorMovimento = isTurnoBrancas() ? algoritmo1.procurarMelhorMovimento(this)
                    : algoritmo2.procurarMelhorMovimento(this);
            } else if (modoJogo == ModoJogo.UM_JOGADOR && (opcaoPecas == OpcaoPecas.BRANCA && !isTurnoBrancas()
                || opcaoPecas == OpcaoPecas.PRETA && isTurnoBrancas())) {
                melhorMovimento = algoritmo1.procurarMelhorMovimento(this);
            }
        }
        return melhorMovimento;
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

    public List<String> recuperarMovimentosValidosTurno() {
        List<String> movimentosValidosTurno = new ArrayList<>();
        List<Peca> pecasDoTurno = recuperarPecasDoTurno();
        for (Peca peca : pecasDoTurno) {
            movimentosValidosTurno.addAll(peca.getMovimentosValidos(this));
        }
        return movimentosValidosTurno;
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
        xadrezClonado.setRoqueAlaDamaBrancaPossivel(isRoqueAlaDamaBrancaPossivel());
        xadrezClonado.setRoqueAlaReiBrancoPossivel(isRoqueAlaReiBrancoPossivel());
        xadrezClonado.setRoqueAlaDamaPretaPossivel(isRoqueAlaDamaPretaPossivel());
        xadrezClonado.setRoqueAlaReiPretoPossivel(isRoqueAlaReiPretoPossivel());
        xadrezClonado.historicoPosicoes.putAll(this.historicoPosicoes);
        xadrezClonado.setDamaBrancaCapturada(isDamaBrancaCapturada());
        xadrezClonado.setDamaPretaCapturada(isDamaPretaCapturada());
        xadrezClonado.setIdCasaReiBranco(getIdCasaReiBranco());
        xadrezClonado.setIdCasaReiPreto(getIdCasaReiPreto());
        xadrezClonado.setCasasQueAmeacamRei(new HashSet<>(getCasasQueAmeacamRei()));
        xadrezClonado.setContadorJogadasCompletas(getContadorJogadasCompletas());
        xadrezClonado.setUltimoMovimento(getUltimoMovimento());

        return xadrezClonado;
    }

    public String calcularFenCode() {
        StringBuffer fenCode = new StringBuffer();
        Linha[] linhas = Linha.values();
        for (int i = (linhas.length - 1); i >= 0; i--) {
            Linha linha = linhas[i];
            for (Coluna coluna : Coluna.values()) {
                Peca peca = get(coluna, linha);
                fenCode.append(peca != null ? peca.getFenCode() : "-");
            }
            if (i != 0) {
                fenCode.append("/");
            }
        }

        String fenCodeString = fenCode.toString().replace("--------", "8");
        fenCodeString = fenCodeString.replace("-------", "7");
        fenCodeString = fenCodeString.replace("------", "6");
        fenCodeString = fenCodeString.replace("-----", "5");
        fenCodeString = fenCodeString.replace("----", "4");
        fenCodeString = fenCodeString.replace("---", "3");
        fenCodeString = fenCodeString.replace("--", "2");
        fenCodeString = fenCodeString.replace("-", "1");

        fenCode = new StringBuffer(fenCodeString);
        fenCode.append(isTurnoBrancas() ? " w " : " b ");
        fenCode.append(isRoqueAlaReiBrancoPossivel() ? "K" : "$");
        fenCode.append(isRoqueAlaDamaBrancaPossivel() ? "Q" : "$");
        fenCode.append(isRoqueAlaReiPretoPossivel() ? "k" : "$");
        fenCode.append(isRoqueAlaDamaBrancaPossivel() ? "q" : "$");

        fenCodeString = fenCode.toString().replace("$$$$", "-");
        fenCodeString = fenCodeString.replace("$", "");

        fenCode = new StringBuffer(fenCodeString);
        fenCode.append(" " + (getIdCasaPeaoEnPassant() != null ? getIdCasaPeaoEnPassant().toLowerCase() : "-"));
        fenCode.append(" " + getContadorMovimentosSemCapturaOuMovimentoPeao());
        fenCode.append(" " + getContadorJogadasCompletas());

        setFenCode(fenCode.toString());

        return getFenCode();
    }

    public Map<String, Integer> getHistoricoPosicoes() {
        return historicoPosicoes;
    }

    public boolean estaNaFaseFinalDoJogo() {
        if (damaBrancaCapturada && damaPretaCapturada) {
            return true;
        }

        return false;
    }

    public boolean isDamaPretaCapturada() {
        return damaPretaCapturada;
    }

    public void setDamaPretaCapturada(boolean damaPretaCapturada) {
        this.damaPretaCapturada = damaPretaCapturada;
    }

    public boolean isDamaBrancaCapturada() {
        return damaBrancaCapturada;
    }

    public void setDamaBrancaCapturada(boolean damaBrancaCapturada) {
        this.damaBrancaCapturada = damaBrancaCapturada;
    }

    public String getIdCasaReiBranco() {
        return idCasaReiBranco;
    }

    public void setIdCasaReiBranco(String idCasaReiBranco) {
        this.idCasaReiBranco = idCasaReiBranco;
    }

    public String getIdCasaReiPreto() {
        return idCasaReiPreto;
    }

    public void setIdCasaReiPreto(String idCasaReiPreto) {
        this.idCasaReiPreto = idCasaReiPreto;
    }

    public Set<String> getCasasQueAmeacamRei() {
        return casasQueAmeacamRei;
    }

    public void setCasasQueAmeacamRei(Set<String> casasQueAmeacamRei) {
        this.casasQueAmeacamRei = casasQueAmeacamRei;
    }

    public int getContadorJogadasCompletas() {
        return contadorJogadasCompletas;
    }

    public void setContadorJogadasCompletas(int contadorJogadasCompletas) {
        this.contadorJogadasCompletas = contadorJogadasCompletas;
    }

    public String getFenCode() {
        return fenCode;
    }

    public void setFenCode(String fenCode) {
        this.fenCode = fenCode;
    }

    public String getRepresentacaoString() {
        return representacaoString;
    }

    public void setRepresentacaoString(String representacaoString) {
        this.representacaoString = representacaoString;
    }

    public AlgoritmoXadrez getAlgoritmo1() {
        return algoritmo1;
    }

    public void setAlgoritmo1(AlgoritmoXadrez algoritmo1) {
        this.algoritmo1 = algoritmo1;
    }

    public AlgoritmoXadrez getAlgoritmo2() {
        return algoritmo2;
    }

    public void setAlgoritmo2(AlgoritmoXadrez algoritmo2) {
        this.algoritmo2 = algoritmo2;
    }

    public String getUltimoMovimento() {
        return ultimoMovimento;
    }

    public void setUltimoMovimento(String ultimoMovimento) {
        this.ultimoMovimento = ultimoMovimento;
    }

}

class Estado {
    private int contadorMovimentosSemCapturaOuMovimentoPeao;
    private int contadorJogadasCompletas;
    private boolean damaPretaCapturada = true;
    private boolean damaBrancaCapturada = true;
    private boolean roqueAlaReiBrancoPossivel = true;
    private boolean roqueAlaDamaBrancaPossivel = true;
    private boolean roqueAlaReiPretoPossivel = true;
    private boolean roqueAlaDamaPretaPossivel = true;
    private String idCasaPeaoEnPassant;
    private String idCasaReiBranco = null;
    private String idCasaReiPreto = null;
    private String idCasaOrigem;
    private String idCasaDestino;
    private String posicaoAtual;
    private Cor turno;
    private Situacao situacao;
    private String ultimoMovimento = null;

    private Peca peaoEnPassant;
    private Peca pecaOrigem;
    private Peca pecaDestino;
    private RoqueDto roque;
    private Set<String> casasQueAmeacamRei;

    public int getContadorMovimentosSemCapturaOuMovimentoPeao() {
        return contadorMovimentosSemCapturaOuMovimentoPeao;
    }

    public void setContadorMovimentosSemCapturaOuMovimentoPeao(int contadorMovimentosSemCapturaOuMovimentoPeao) {
        this.contadorMovimentosSemCapturaOuMovimentoPeao = contadorMovimentosSemCapturaOuMovimentoPeao;
    }

    public boolean isDamaPretaCapturada() {
        return damaPretaCapturada;
    }

    public void setDamaPretaCapturada(boolean damaPretaCapturada) {
        this.damaPretaCapturada = damaPretaCapturada;
    }

    public boolean isDamaBrancaCapturada() {
        return damaBrancaCapturada;
    }

    public void setDamaBrancaCapturada(boolean damaBrancaCapturada) {
        this.damaBrancaCapturada = damaBrancaCapturada;
    }

    public boolean isRoqueAlaReiBrancoPossivel() {
        return roqueAlaReiBrancoPossivel;
    }

    public void setRoqueAlaReiBrancoPossivel(boolean roqueAlaReiBrancoPossivel) {
        this.roqueAlaReiBrancoPossivel = roqueAlaReiBrancoPossivel;
    }

    public boolean isRoqueAlaDamaBrancaPossivel() {
        return roqueAlaDamaBrancaPossivel;
    }

    public void setRoqueAlaDamaBrancaPossivel(boolean roqueAlaDamaBrancaPossivel) {
        this.roqueAlaDamaBrancaPossivel = roqueAlaDamaBrancaPossivel;
    }

    public boolean isRoqueAlaReiPretoPossivel() {
        return roqueAlaReiPretoPossivel;
    }

    public void setRoqueAlaReiPretoPossivel(boolean roqueAlaReiPretoPossivel) {
        this.roqueAlaReiPretoPossivel = roqueAlaReiPretoPossivel;
    }

    public boolean isRoqueAlaDamaPretaPossivel() {
        return roqueAlaDamaPretaPossivel;
    }

    public void setRoqueAlaDamaPretaPossivel(boolean roqueAlaDamaPretaPossivel) {
        this.roqueAlaDamaPretaPossivel = roqueAlaDamaPretaPossivel;
    }

    public String getIdCasaPeaoEnPassant() {
        return idCasaPeaoEnPassant;
    }

    public void setIdCasaPeaoEnPassant(String idCasaPeaoEnPassant) {
        this.idCasaPeaoEnPassant = idCasaPeaoEnPassant;
    }

    public String getIdCasaReiBranco() {
        return idCasaReiBranco;
    }

    public void setIdCasaReiBranco(String idCasaReiBranco) {
        this.idCasaReiBranco = idCasaReiBranco;
    }

    public String getIdCasaReiPreto() {
        return idCasaReiPreto;
    }

    public void setIdCasaReiPreto(String idCasaReiPreto) {
        this.idCasaReiPreto = idCasaReiPreto;
    }

    public String getIdCasaOrigem() {
        return idCasaOrigem;
    }

    public void setIdCasaOrigem(String idCasaOrigem) {
        this.idCasaOrigem = idCasaOrigem;
    }

    public String getIdCasaDestino() {
        return idCasaDestino;
    }

    public void setIdCasaDestino(String idCasaDestino) {
        this.idCasaDestino = idCasaDestino;
    }

    public String getPosicaoAtual() {
        return posicaoAtual;
    }

    public void setPosicaoAtual(String posicaoAtual) {
        this.posicaoAtual = posicaoAtual;
    }

    public Cor getTurno() {
        return turno;
    }

    public void setTurno(Cor turno) {
        this.turno = turno;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Peca getPeaoEnPassant() {
        return peaoEnPassant;
    }

    public void setPeaoEnPassant(Peca peaoEnPassant) {
        this.peaoEnPassant = peaoEnPassant;
    }

    public Peca getPecaOrigem() {
        return pecaOrigem;
    }

    public void setPecaOrigem(Peca pecaOrigem) {
        this.pecaOrigem = pecaOrigem;
    }

    public Peca getPecaDestino() {
        return pecaDestino;
    }

    public void setPecaDestino(Peca pecaDestino) {
        this.pecaDestino = pecaDestino;
    }

    public RoqueDto getRoque() {
        return roque;
    }

    public void setRoque(RoqueDto roque) {
        this.roque = roque;
    }

    public Set<String> getCasasQueAmeacamRei() {
        return casasQueAmeacamRei;
    }

    public void setCasasQueAmeacamRei(Set<String> casasQueAmeacamRei) {
        this.casasQueAmeacamRei = casasQueAmeacamRei;
    }

    public int getContadorJogadasCompletas() {
        return contadorJogadasCompletas;
    }

    public void setContadorJogadasCompletas(int contadorJogadasCompletas) {
        this.contadorJogadasCompletas = contadorJogadasCompletas;
    }

    public String getUltimoMovimento() {
        return ultimoMovimento;
    }

    public void setUltimoMovimento(String ultimoMovimento) {
        this.ultimoMovimento = ultimoMovimento;
    }
}
