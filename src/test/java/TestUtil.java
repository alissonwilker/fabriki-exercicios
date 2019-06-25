import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.pecas.Peca;

public class TestUtil {
	
    public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
    	
    	List<Peca> listaDePecas = xadrez.recuperarPecasDoTurno();
    	
    	List<String> MovimentosXeque = new ArrayList<>();
    	
       
    	for(int i = 0; i < listaDePecas.size(); i++) {
    		
    		Peca peca = listaDePecas.get(i);
    		
    		List<String> xablauMovimentos = peca.getMovimentosValidos(xadrez);
    		
    		for(int j = 0; j < xablauMovimentos.size(); j++) {
    			
    			Situacao SituacaoXablau2 = xadrez.simularJogada(xablauMovimentos.get(j));
    			
    			if(xadrez.isTurnoBrancas()) {
    				if(SituacaoXablau2 == Situacao.Pretas_em_xeque_mate){
    					MovimentosXeque.add(xablauMovimentos.get(j));
    				}
    			}
    			
    			else {
    				if(SituacaoXablau2 == Situacao.Brancas_em_xeque_mate){
    					MovimentosXeque.add(xablauMovimentos.get(j));
    				}
    			}
    			
    			
    			
    		}
    		
    		
    	}
    	return MovimentosXeque;
    }
    

}
