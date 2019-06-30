package xadrez.movimentos;

import xadrez.Xadrez;
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

        if (jogoEmXeque || (corReiBranca
            ? (!xadrez.isRoqueAlaDamaBrancaPossivel() && !xadrez.isRoqueAlaReiBrancoPossivel())
            : (!xadrez.isRoqueAlaDamaPretaPossivel() && !xadrez.isRoqueAlaReiPretoPossivel()))) {
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
        return xadrez.get(idCasaDestino) != null
            || super.verificarObstrucaoDeslocamento(idCasaOrigem, idCasaDestino, xadrez);
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

}
