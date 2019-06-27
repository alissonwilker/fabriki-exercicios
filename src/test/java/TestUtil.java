import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;

public class TestUtil {
    public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
       
    List<String> movimentoXeque =new ArrayList();	
    List<Peca> ListDePecas = xadrez.recuperarPecasDoTurno();
    	for(int i=0; i < ListDePecas.size(); i++) {
    		List<String> movimentos =ListDePecas.get(i).getMovimentosValidos(xadrez);
    		for(int j=0; j < movimentos.size(); j++) {
    			Situacao situacao = xadrez.simularJogada(movimentos.get(j));
    		 boolean TurnoBrancas = xadrez.isTurnoBrancas();
    		 if(TurnoBrancas) {
    			 if(situacao ==Situacao.Pretas_em_xeque_mate ) {
    				 movimentoXeque.add(movimentos.get(j));
    			 }
    		 }else {
    			 if(situacao==Situacao.Brancas_em_xeque_mate) {
    				movimentoXeque.add(movimentos.get(j)); 
    			 }
    		 }
    	}
    	
    }
        return movimentoXeque;
    }

}
