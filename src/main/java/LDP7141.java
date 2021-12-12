import java.util.Scanner;
 
public class LDP7141 {
 
	public static void main(String[] args) {
		int e = 4;
		int m;
 
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		int p = teclado.nextInt();
		System.out.println();
		if (p > 50) {
		p = p - 50; 
		p = p; 
		e = p; 
		m = p * 4;
 
		} else {
			p = p;
			e = 0;
			m = 0;
		}
 
		System.out.println("excedente:" + e + "" + "\n" + "multa:"
				+ m);
	}
 
}
