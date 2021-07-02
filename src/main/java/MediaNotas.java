import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1,n2,n3, media = 0;
		
		System.out.println("Digite as tres notas");
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		
		media = (n1 + n2 + n3)/3;
		System.out.println("media = " +media);
		 
	}
}
