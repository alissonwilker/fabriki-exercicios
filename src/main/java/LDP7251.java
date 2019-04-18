import java.util.Scanner;
public class LDP7251{
	public static void main(String[]args) {
		int num = 0;
		int maior = 0;
		Scanner entry = new Scanner(System.in);
		while (num != 0) {
			num = entry.nextInt();
			
			if(num > maior) {
				maior = num;
			}
		}
		System.out.println("maior = " + maior);
	}
}
