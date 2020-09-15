import java.util.Scanner;

public class Fatorial {

public static void main(String[]args) {
try (Scanner ent = new Scanner(System.in)) {
		int num = ent.nextInt();
	 System.out.println(+ fatorial(num));
	}
	}
public static int fatorial(int n) { 
	int aux = 1;
		for (int i = 2;i <= n; i++){	
			aux*=i;		  
		  }
	   return (int) aux;
}
}
