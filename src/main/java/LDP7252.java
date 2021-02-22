public class LDP7252 {

	public static void main(String[] args) {
		
		int i, soma = 1, valorInicial = 1 ;
		
		for (i = 2; i <= 64; i++) {
			valorInicial = valorInicial * 2;
			soma += valorInicial;
		}
		System.out.println("totalGraos = " + soma);
	}

}
