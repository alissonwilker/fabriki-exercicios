import java.io.PrintStream;
import java.util.Scanner;
public class LDP7142{
private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int C,H,E;
			E=0;
			C = entrada.nextInt();
			H = entrada.nextInt();
			if(H>50){
				E = H-50;
			}
			System.out.println("código = " + C);
			System.out.println("salarioExcedente = " +(E*20));
			System.out.println("salarioTotal = " +(E*20+(H-E)*10));
	}
}
