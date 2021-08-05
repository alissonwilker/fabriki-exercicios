
public class LDP7252 {
	public static void main(String[] args) {
		long graosDeTrigo = 1L;
		long somatorio = 0L;
		somatorio += graosDeTrigo;
		for (int i=1; i<63;i++) {
			graosDeTrigo = 2 * graosDeTrigo;
//			System.out.println(somatorio);
			somatorio += graosDeTrigo;
		}
		System.out.println("totalGraos = "+ somatorio );
	}
}
