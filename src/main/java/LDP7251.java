import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();
		int X = 0;
		
		while(N!=0) {
			if(N>X) {
				X=N;
			}
			N = leitor.nextInt();
		}
		System.out.println("maior = "+X);
		
		leitor.close();
	}

}
