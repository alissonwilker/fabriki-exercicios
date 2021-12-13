import java.io.PrintStream;
import java.util.Scanner;
 
public class LDP7141 {
    
	public static void main(String[] args) {
		int e = 4;
		int m;
 
		Scanner teclado = new Scanner(System.in);
		int p = teclado.nextInt();
		if (p > 50) {
		e = p - 50; 
		m = e * 4;
 
		} else {
			e = 0;
			m = 0;
		}
 
		System.out.println("excedente = " + e + "" + "\n" + "multa = "
				+ m);
	}
}
