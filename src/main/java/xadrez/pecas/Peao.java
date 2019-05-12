package xadrez.pecas;

import xadrez.movimentos.MovimentoAvancaDuas;
import xadrez.movimentos.MovimentoAvancaUma;
import xadrez.movimentos.MovimentoCapturaDiagonal;
import xadrez.movimentos.MovimentoEnPassant;

public class Peao extends Peca {
    public Peao(Cor cor, String idCasa) {
        super(Tipo.Peao, cor, idCasa);
        
        adicionar(new MovimentoAvancaUma());
        adicionar(new MovimentoAvancaDuas());
        adicionar(new MovimentoCapturaDiagonal()); 
        adicionar(new MovimentoEnPassant());
    }
    
}
