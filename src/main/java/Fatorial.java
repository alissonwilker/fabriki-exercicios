import java.util.Scanner;

public class Fatorial {
	public static void main (String[] args) {
		int num, res;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Informe o número desejado para realizar o fatorial:");
		num = sc.nextInt();
		sc.close();
		res = fatorial(num);
		System.out.println(res);
		
	}
	
	public static int fatorial (int a) {
		int anterior=a;
		
		if (a == 0) {
			anterior = 1;
		}
		
		else {
			for(int cont = a - 1; cont > 0; cont--) {
				anterior = anterior * cont;
			}	
			
		}
		return anterior;
		
	}
}
