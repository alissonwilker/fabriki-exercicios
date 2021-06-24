
import java.util.Scanner;

public class LDP7141 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quilosPeixes = entrada.nextInt();
		
		int excedente = (quilosPeixes - 50 < 0 ? 0 : quilosPeixes - 50);
		
		int multa = excedente * 4;
		
		System.out.println("excedente = " + excedente);
		System.out.println("multa = " + multa);
		
		entrada.close();
	}
}
