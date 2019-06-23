package xadrez.pecas;

import xadrez.movimentos.MovimentoL;

public class Cavalo extends Peca {
    public Cavalo(Cor cor, String idCasa) {
        super(Tipo.Cavalo, cor, idCasa);

        adicionar(new MovimentoL());
    }

    @Override
    public String getFenCode() {
        if (cor == Cor.BRANCA) {
            return "N";
        } else {
            return "n";
        }
    }

}
