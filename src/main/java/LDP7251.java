import java.util.Scanner;
public class LDP7251 {
	public static void main(String[]args) {
		int recebida=0,melhordobaile=Integer.MIN_VALUE;
		Scanner entry= new Scanner(System.in);
		while(recebida!=0) {
			recebida= entry.nextInt();
			
			if(recebida>melhordobaile && recebida!=0) {
				melhordobaile=recebida;
			}
		}
		System.out.println("maior = "+melhordobaile);
	}
}
