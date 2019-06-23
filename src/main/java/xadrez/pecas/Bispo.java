package xadrez.pecas;

import xadrez.movimentos.MovimentoDiagonalLivre;

public class Bispo extends Peca {
    public Bispo(Cor cor, String idCasa) {
        super(Tipo.Bispo, cor, idCasa);

        adicionar(new MovimentoDiagonalLivre());
    }

}
