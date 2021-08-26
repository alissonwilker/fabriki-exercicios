import java.util.Arrays;

public class LDP7253 {

	public static void main(String[] args) {
		int[] multiplos = { 10, 20, 30, 40, 50,
							60, 70, 80, 90, 100};
		int[] check = new int[1];
		
		for(int i = 0; i <= 100; i++) {
			check[0] = i;
			if (Arrays.stream(multiplos).anyMatch(j -> j == check[0])) {
				System.out.println("Multiplo de 10");
			}
		}
	}
}
