import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out; 
	
	public static void main(String[] args) {
		int e =4;
		int m;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso.");
		int p = teclado.nextInt();
		System.out.println();
		
		if (p > 50) {
			p = p; 
			p = p; 
			e = p - 50; 
			m = e * 4;
	 
			} else {
				p = p;
				e = 0;
				m = 0;
			}
	 
			System.out.println("excedente = " + e + "" + "\n" + "multa = "
					+ m);
		}
	 
	}
