import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

import xadrez.Xadrez;
import xadrez.Xadrez.Situacao;
import xadrez.alg.AlgoritmoXadrez;
import xadrez.pecas.Peca;

public class AlgoritmoDesafiante implements AlgoritmoXadrez {

	public String procurarMelhorMovimento(Xadrez xadrez) {

		List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();
        List<String> VerificarXequemate = procurarMovimentosXequeMateEmUmLance(xadrez);
		
		String movimentoValido = null;
		while (movimentoValido == null) {
			
			if(VerificarXequemate != null && !VerificarXequemate.isEmpty()) {
				movimentoValido = VerificarXequemate.get(0);
			} else {
			
			int numeroAleatorio = (int) (Math.random() * pecasDoTurno.size());
			Peca peca = pecasDoTurno.get(numeroAleatorio);
			List<String> movimentosValidos = peca.getMovimentosValidos(xadrez);
			if (movimentosValidos.size() > 0) {
				numeroAleatorio = (int) (Math.random() * movimentosValidos.size());
				movimentoValido = movimentosValidos.get(numeroAleatorio);
			}}
		}
		return movimentoValido;
	}
	
	public static List<String> procurarMovimentosXequeMateEmUmLance(Xadrez xadrez) {
   
    List<String> movimentoXeque =new ArrayList();	
    List<Peca> ListDePecas = xadrez.recuperarPecasDoTurno();
    	for(int i=0; i < ListDePecas.size(); i++) {
    		List<String> movimentos = ListDePecas.get(i).getMovimentosValidos(xadrez);
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

	public static void main(String[] args) {
		
	}

}
