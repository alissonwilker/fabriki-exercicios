import java.util.Scanner;

public class LDP7251    {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n, max;

		n = entrada.nextInt();
		max = n;

		
		while (n != 0) {
			n = entrada.nextInt();
			
			if  (n > max && n!=0) {
				max = n;
			}
		}
		System.out.println("maior = " + max);

}

}
