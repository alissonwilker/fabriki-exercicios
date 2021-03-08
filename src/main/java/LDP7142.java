import java.util.Scanner;
public class LDP7142{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = System.out;
		int C,H,E;
			E=0;
			C = entrada.nextInt();
			H = entrada.nextInt();
			if(H>50){
				E = H-50;
			}
			System.out.println("codigo = " + C);
			System.out.println("salarioExcedente = " +(E*20));
			System.out.println("salarioTotal = " +(E*20+(H-E)*10));
	}
}
