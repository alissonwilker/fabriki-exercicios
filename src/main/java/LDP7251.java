import java.util.*;
public class LDP7251 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v = input.nextInt();
		int maior = v;
		while (v != 0) {
			v = input.nextInt();
			if (v !=0 ) {
				if(v > maior) {
					maior = v;
				}
			}
		}
		System.out.println("maior = " + maior);
	}
}
