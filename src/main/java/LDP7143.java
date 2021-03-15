import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int array[] = new int[4];

		for (int i = 0; i < array.length; i++) {

			array[i] = entrada.nextInt();
		}

		int c2 = (int) Math.pow(array[2], 2);
		if (c2 >= 1000) {
			System.out.println("c2 = " + c2);
		}

		else {
			System.out.println("a = " + array[0]);
			System.out.println("b = " + array[1]);
			System.out.println("c = " + array[2]);
			System.out.println("d = " + array[3]);
			System.out.println("a2 = " + (int) Math.pow(array[0], 2));
			System.out.println("b2 = " + (int) Math.pow(array[1], 2));
			System.out.println("c2 = " + (int) Math.pow(array[2], 2));
			System.out.println("d2 = " + (int) Math.pow(array[3], 2));
		}
	}

}
