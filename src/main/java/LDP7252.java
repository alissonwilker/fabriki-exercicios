import java.util.Scanner;

public class LDP7252 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double graosCasa = 1;
		double tabuleiro = 64;
		int graos = 1;
		
		for (int i = 1; i < tabuleiro; i++) {
			graosCasa = graosCasa * 2;
			graos += graosCasa;
		}
		
		System.out.println("totalGraos = "+graos);
	
	}
	
}
