import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int codigo;
		int N,E=0,salarioTotal,salarioExcedente;
		
		
			E=0;
			salarioTotal=10;
			salarioExcedente= salarioTotal*2;

			System.out.print("Digite o código do operário: ");
			codigo = entrada.nextInt();

			System.out.print("Digite o número de horas trabalhadas: ");
			N = entrada.nextInt();

			if(N>50){
				E = N-50;
				salarioExcedente = E*salarioExcedente;
				salarioTotal = N*salarioTotal;
			}

			System.out.println("codigo" + " " + "=" + " " + codigo);
			System.out.println("salarioExcedente" + " " + "=" + " " + salarioExcedente);
			System.out.println("salarioTotal" + " " + "=" + " " + salarioTotal);

		


	}

}
