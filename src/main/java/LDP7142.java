import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int codigo=0, horas=0,salarioExcedente=0;
	
	Scanner sc1 = new Scanner(System.in);
	codigo = sc1.nextInt();
	
	Scanner sc2 = new Scanner(System.in);
	horas = sc2.nextInt();
	
	if(horas > 50){
	salarioExcedente=((horas-50)*20);
	
	System.out.println("codigo = "+codigo);
	System.out.println("salarioExcedente = "+salarioExcedente);
	System.out.println("salarioTotal = "+((50*10)+salarioExcedente));
	
	}else{
	saida.println("codigo = "+codigo);
	saida.println("salarioExcedente = "+salarioExcedente);
	saida.println("salarioTotal = "+(horas*10));	
	}
	
	}
}