import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		List<String> conjunto1 = new ArrayList<String>();
		List<String> conjunto2 = new ArrayList<String>();

		String s = entrada.next();
		while (!s.equals("0")) {
			conjunto1.add(s);
			s = entrada.next();
		}
		
		String x = entrada.next();
		while (!x.equals("0")) {
			conjunto2.add(x);
			x = entrada.next();
		}	
		
		
	    conjunto1.removeAll(conjunto2);
	    
	    for(int i = 0; i< conjunto1.size(); i++){
	      saida.println(conjunto1.get(i));
	    }
	    
					
		}
	}
