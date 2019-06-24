package xadrez.movimentos;

import xadrez.Xadrez;
import xadrez.Xadrez.OpcaoPecas;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public class MovimentoRoque extends Movimento {
    public MovimentoRoque() {
        super(Tipo.Roque);
        deslocaLinhas = false;
        deslocaColunas = true;
    }
    
    @Override
    public boolean validar(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        Peca rei = xadrez.get(idCasaOrigem);
        boolean corReiBranca = rei.getCor() == Cor.BRANCA;

        Situacao situacaoJogo = xadrez.getSituacao();
        boolean jogoEmXeque = corReiBranca ? situacaoJogo == Situacao.Brancas_em_xeque
            : situacaoJogo == Situacao.Pretas_em_xeque;

        if (jogoEmXeque || corReiBranca
            ? (!xadrez.isRoqueAlaDamaBrancaPossivel() && !xadrez.isRoqueAlaReiBrancoPossivel())
            : (!xadrez.isRoqueAlaDamaPretaPossivel() && !xadrez.isRoqueAlaReiPretoPossivel())) {
            return false;
        }

        RoqueDto roque = new RoqueDto(idCasaOrigem, idCasaDestino, xadrez);
        if (!roque.validarTorreRoque() || roque.getPecaAdjacenteATorreRoque() != null
            || xadrez.estaAmeacada(rei.getCor(), roque.getIdCasaAdjacenteAoRei()).size() > 0) {
            return false;
        }

        return super.validar(idCasaOrigem, idCasaDestino, xadrez);
    }

    @Override
    public boolean verificarObstrucaoDeslocamento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        return xadrez.get(idCasaDestino) != null || super.verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
    }

    @Override
    public boolean validarCasaDestinoMovimento(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
        Peca pecaDestino = xadrez.get(idCasaDestino);
        return pecaDestino == null;
    }

    @Override
    protected boolean validarDistanciasColunasLinhas(int distanciaColunas, int distanciaLinhas) {
        return distanciaColunas == 2 && distanciaLinhas == 0;
    }

    @Override
    protected int[] getLinhasMovimentos(Cor corPecaOrigem) {
        return new int[] { 0, 0 };
    }

    @Override
    protected int[] getColunasMovimentos(Cor corPecaOrigem) {
        return new int[] { -2, 2 };
    }
    
    public class RoqueDto {
        private Peca torreRoque;
        private String idCasaTorreRoque;
        private String idCasaAdjacenteAoRei;
        private Peca pecaAdjacenteATorreRoque;
        private boolean torreMovimentada;
        
        public RoqueDto() {
            
        }

        public RoqueDto(String idCasaOrigem, String idCasaDestino, Xadrez xadrez) {
            boolean opcaoPecasBrancas = xadrez.getOpcaoPecas() == OpcaoPecas.BRANCA;
            boolean corPecaOrigemEhBranca = xadrez.get(idCasaOrigem).getCor() == Cor.BRANCA;

            int colunaOrigem = xadrez.getOrdemColuna(idCasaOrigem);
            int colunaDestino = xadrez.getOrdemColuna(idCasaDestino);
            boolean deslocamentoColunasPositivo = colunaDestino - colunaOrigem > 0;

            boolean roqueAlaRei = (opcaoPecasBrancas && deslocamentoColunasPositivo)
                || (!opcaoPecasBrancas && deslocamentoColunasPositivo);

            if (roqueAlaRei) {
                this.idCasaTorreRoque = corPecaOrigemEhBranca ? "H1" : "H8";
                this.idCasaAdjacenteAoRei = corPecaOrigemEhBranca ? "F1" : "F8";
                this.torreMovimentada = corPecaOrigemEhBranca ? !xadrez.isRoqueAlaReiBrancoPossivel() : !xadrez.isRoqueAlaReiPretoPossivel();
            } else {
                this.idCasaTorreRoque = corPecaOrigemEhBranca ? "A1" : "A8";
                this.idCasaAdjacenteAoRei = corPecaOrigemEhBranca ? "D1" : "D8";
                this.pecaAdjacenteATorreRoque = xadrez.get(corPecaOrigemEhBranca ? "B1" : "B8");
                this.torreMovimentada = corPecaOrigemEhBranca ? !xadrez.isRoqueAlaDamaBrancaPossivel() : !xadrez.isRoqueAlaDamaPretaPossivel();
            }

            this.torreRoque = xadrez.get(idCasaTorreRoque);

        }

        public boolean validarTorreRoque() {
            return torreRoque != null && torreRoque.getTipo() == Peca.Tipo.Torre && !torreMovimentada;
        }

        public Peca getTorreRoque() {
            return torreRoque;
        }

        public String getIdCasaTorreRoque() {
            return idCasaTorreRoque;
        }

        public String getIdCasaAdjacenteAoRei() {
            return idCasaAdjacenteAoRei;
        }

        public Peca getPecaAdjacenteATorreRoque() {
            return pecaAdjacenteATorreRoque;
        }

    }

}


