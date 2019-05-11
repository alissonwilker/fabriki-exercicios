package xadrez.movimentos;

import xadrez.Xadrez;
import xadrez.Xadrez.OpcaoPecas;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public class RoqueDto {
    private Peca torreRoque;
    private String idCasaTorreRoque;
    private String idCasaAdjacenteAoRei;
    private Peca pecaAdjacenteATorreRoque;
    private boolean torreMovimentada;

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
            this.torreMovimentada = corPecaOrigemEhBranca ? xadrez.isTorreBrancaAlaReiMovida() : xadrez.isTorrePretaAlaReiMovida();
        } else {
            this.idCasaTorreRoque = corPecaOrigemEhBranca ? "A1" : "A8";
            this.idCasaAdjacenteAoRei = corPecaOrigemEhBranca ? "D1" : "D8";
            this.pecaAdjacenteATorreRoque = xadrez.get(corPecaOrigemEhBranca ? "B1" : "B8");
            this.torreMovimentada = corPecaOrigemEhBranca ? xadrez.isTorreBrancaAlaDamaMovida() : xadrez.isTorrePretaAlaDamaMovida();
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
