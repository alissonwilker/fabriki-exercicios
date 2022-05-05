import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		if(num3*num3>=1000) {System.out.println("c2 = "+num3*num3);
		}else {
			System.out.println("a = "+num1);
			System.out.println("b = "+num2);
			System.out.println("c = "+num3);
			System.out.println("d = "+num4);
			System.out.println("a2 = "+num1*num1);
			System.out.println("b2 = "+num2*num2);
			System.out.println("c2 = "+num3*num3);
			System.out.println("d2 = "+num4*num4);
			
		}
	}
}
