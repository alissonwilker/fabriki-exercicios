import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int C;
		int N, E = 0, PrecoHora, PrecoExcedente;
		boolean continuar = true;
		char texto;

		
			E = 0;
			PrecoHora = 10;
			PrecoExcedente = 20;

			
			C = entrada.nextInt();
			
			N = entrada.nextInt();

			if (N > 50) {
				E = N - 50;
			}

			System.out.println("\ncodigo = " + C + "\nsalarioExcedente = "
					+ (E * PrecoExcedente) + "\nsalarioTotal = " + (E * PrecoExcedente + (N - E) * PrecoHora)
					);
			 {
				
			}

		} 

	}


