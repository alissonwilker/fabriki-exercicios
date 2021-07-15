import java.util.Arrays;
import java.util.Scanner;

public class LDP7251 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int i = 10;
		int maior = 0;
		int[] N = new int[i+1];
		
		for(i = 0; i <= N.length; i++)
		{
			//System.out.println("i = " + i);
			N[i] = entrada.nextInt();
			if (N[i] == 0)
			{
				break;
			}
		}entrada.close();		
		Arrays.sort(N);

		if(N[10] == 0) 
		{
			while(i != 0)
			{
				//System.out.println("index"+i);
				if (N[i] == 0)
				{
					maior = N[i-1];
					//System.out.println("@"+N[i]);
				} 
				i--;
			}
		}else {
			maior = N[10];
		}
		//Essa solução consegue apenas o último valor da lista
		//Precisamos do maior número excluindo o zero
		//System.out.println(Arrays.toString(N));
		System.out.println("maior = " + maior);
	}
}
