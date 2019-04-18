import java.util.Iterator;
import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int maior;
		Scanner S = new Scanner(System.in);
		num = S.nextInt();
		maior = num;
		while (num != 0) {

			if (num > maior) {
				maior = num;

			}			
			num = S.nextInt();		
		}
		System.out.println("maior = " + maior);
	}

}
