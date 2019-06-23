package xadrez.pecas;

import xadrez.movimentos.MovimentoHorizontalLivre;
import xadrez.movimentos.MovimentoVerticalLivre;

public class Torre extends Peca {
    public Torre(Cor cor, String idCasa) {
        super(Tipo.Torre, cor, idCasa);

        adicionar(new MovimentoHorizontalLivre());
        adicionar(new MovimentoVerticalLivre());
    }

    @Override
    public String getFenCode() {
        if (cor == Cor.BRANCA) {
            return "R";
        } else {
            return "r";
        }
    }

}
