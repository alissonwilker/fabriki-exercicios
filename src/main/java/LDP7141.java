import java.util.Scanner;

public class LDP7141 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		entrada.close();
		
		if (num > 50) {
			int excedente = num-50;
			System.out.println("excedente = "+excedente);
			System.out.println("multa = "+(excedente*4));
		}else {
			
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
		}

	}

}
