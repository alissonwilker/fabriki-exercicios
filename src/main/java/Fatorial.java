import java.util.Scanner;

public class Fatorial {
	public static void main (String[] args) {
		int num, res;
		Scanner sc = new Scanner(System.in);
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
			for(int cont = 1; cont < a; cont++) {
				anterior = anterior * cont;
			}	
		}
		return anterior;
	}
}
