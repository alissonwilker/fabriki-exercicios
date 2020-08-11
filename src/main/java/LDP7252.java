
public class LDP7252 {

	public static void main(String[] args) {
		int tabuleiro = 64;
		double quantidadeGraos;
		double total=0;
		double anterior=1;
		for (int i = 1; i <= tabuleiro; i++) {
			quantidadeGraos = anterior*2;
			if(i==1) {
				quantidadeGraos=1;
			}
			total+=quantidadeGraos;
			anterior=quantidadeGraos;
		}
		System.out.println("totalGraos = "+total);
	}

}
