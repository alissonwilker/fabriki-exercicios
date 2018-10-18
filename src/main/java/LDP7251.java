import java.util.Scanner;

public class LDP7251 {
private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = 0, maior = 0;
		
		n = entrada.nextInt();
		
		while(n != 0)
		{
			if (n > maior){
				maior = n;
			}
			else if(n < 0 && n < maior){
				maior = n;
			}
			n = entrada.nextInt();
		}
		
		System.out.println("maior = "+ maior);
		
		entrada.close();

	}

}
