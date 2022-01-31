import java.util.Scanner;

public class Fatorial {
	public static void main (String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Informe o número desejado para realizar o fatorial:");
		num = sc.nextInt();
		sc.close();
		fatorial(num);		

	}
	
	public static int fatorial (int a) {
		int resultado=0, cont, anterior=a;
		for(cont = a - 1; cont > 0; cont--) {
			anterior = anterior * cont;
		}
		System.out.println(anterior);
		
		return resultado;
	}
}

