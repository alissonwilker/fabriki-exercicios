public class LDP7252 {

	public static void main(String[] args) {
		
		int graos = 1;
		int tabuleiro = 1;
		
		while(tabuleiro <= 63) {
			graos += graos * 2;
			tabuleiro ++;
		}
		
		System.out.println("totalGraos = "+ graos);

	}

}
