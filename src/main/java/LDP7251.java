import java.util.Arrays;
import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i = 10; 
		int maior;
		int[] N = new int[i+1];
		
		while(i != 0) 
		{
			//System.out.println("i = " + i);
			N[i] = entrada.nextInt();
			if (N[i] == 0)
			{
				break;
			}
			i--;
		}
		entrada.close();
		
		Arrays.sort(N);
		maior = N[10];
		System.out.println("maior = " + maior);
	}
}
