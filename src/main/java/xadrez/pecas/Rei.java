package xadrez.pecas;

import xadrez.movimentos.MovimentoRestrito;
import xadrez.movimentos.MovimentoRoque;

public class Rei extends Peca {
    public Rei(Cor cor, String idCasa) {
        super(Tipo.Rei, cor, idCasa);

        adicionar(new MovimentoRestrito());
        adicionar(new MovimentoRoque());
    }

    @Override
    public String getFenCode() {
        if (cor == Cor.BRANCA) {
            return "K";
        } else {
            return "k";
        }
    }

}
