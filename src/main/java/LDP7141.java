import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num2 = 0;

		int num1 = entrada.nextInt();

		if (num1 > 50) {
			num1-=50;
			num2=num1*4;
			
			saida.println("excedente = " + num1 + "\nmulta = " + num2);

		} else {
			saida.println("excedente = 0" + "\nmulta = "+num2);
		}

	}

}


