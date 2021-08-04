
public class LDP7252 {
	public static void main(String[] args) {
		Double graosDeTrigo = 1.0;
		Double somatorio = 0.0;
		somatorio += graosDeTrigo;
		for (int i=1; i<64;i++) {
			graosDeTrigo = 2 * graosDeTrigo;
			somatorio += graosDeTrigo;
		}
		System.out.println("totalGraos = " + somatorio);
	}
}
