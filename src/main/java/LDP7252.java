public class LDP7252 {
	public static void main(String[] args) {
		
		double totalGraos = 1;
		int somaGraos = 1;
		
		for(int i = 1; i < 64; i++) {
			totalGraos = totalGraos * 2;
			somaGraos += totalGraos;
	}
		System.out.println("totalGraos = " + totalGraos);
}
}
