
public class LDP7252 {
	public static void main(String[] args) {
		long quadrado=1,acumulador=0;
		for(int i=1;i<=64;i++) {
			quadrado = quadrado*2;
			acumulador += quadrado;
			System.out.println("totalGraos = "+acumulador);
		}
	}
}
