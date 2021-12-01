import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
			String t;
			String p;
			int n1 = entrada.nextInt();
			if (n1 >= 0){
				t = " E POSITIVO";
			}
			else{
				t = " E NEGATIVO";
			}
			if (n1 % 2 == 0 && n1 != 0 || n1 == 0) {
				p = "PAR";
			}
			else {
				p = "ÍMPAR";
			}
			

			System.out.print(p);
			System.out.println(t);
		}
}
