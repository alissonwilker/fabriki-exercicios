package xadrez.pecas;

import xadrez.movimentos.MovimentoDiagonalLivre;
import xadrez.movimentos.MovimentoHorizontalLivre;
import xadrez.movimentos.MovimentoVerticalLivre;

public class Dama extends Peca {
    public Dama(Cor cor, String idCasa) {
        super(Tipo.Dama, cor, idCasa);

        adicionar(new MovimentoVerticalLivre());
        adicionar(new MovimentoHorizontalLivre());
        adicionar(new MovimentoDiagonalLivre());
    }
    
    @Override
    public String getFenCode() {
        if (cor == Cor.BRANCA) {
            return "Q";
        } else {
            return "q";
        }
    }

}
