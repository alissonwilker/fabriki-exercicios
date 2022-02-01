import java.util.Scanner;
public class Fatorial {

	public static void main(String args[]) {
		final Scanner entrada = new Scanner(System.in);
		double x;
		x=entrada.nextDouble();
		double f=x;
		if (x==0 || x==1) {
			System.out.println(1);
		}
		else {
			while (x>1 && x<=25) {
				f=f*(x-1);
				x--;
			}
			System.out.println(String.format("%.0f", f));
			
		}
		
	}
}
