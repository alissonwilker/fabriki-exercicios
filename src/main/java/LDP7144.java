import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num = entrada.nextInt();
		if((num %2 == 0)&&(num >=0))
		System.out.println("PAR E POSITIVO"); 
		else if((num %2 == 0)&&(num <0))
		System.out.println("PAR E NEGATIVO");
		else if((num %2 == 1)&&(num >=0))
		System.out.println("ÍMPAR E POSITIVO");
		else
		System.out.println("ÍMPAR E NEGATIVO");
	}

}
