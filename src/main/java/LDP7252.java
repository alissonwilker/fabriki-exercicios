import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {
		double tabuleiro = 64, graos = 1;
		int qtdgraos = 1;
		
		
		for (int i = 1; i < tabuleiro; i++) {
		 graos  = graos*2;
		  qtdgraos += graos;
			
	}
		 BigInteger qtdgraos1 = BigInteger.valueOf (qtdgraos);
		System.out.println("totalGraos = "+ qtdgraos1);
}
}
