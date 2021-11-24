import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
			String t;
			String p;
			int n1 = entrada.nextInt();
			if (n1 > 0){
				t = "POSITIVO";
			}
			else if (n1 == 0) {
				t = "nem positivo nem negativo";
			}
			else{
				t = "NEGATIVO";
			}
			if (n1 % 2 == 0 && n1 != 0) {
				p = "PAR";
			}
			else if (n1 == 0){
				p = "não é par e nem ímpar";
			}
			else {
				p = "ÍMPAR";
			}
			

			System.out.print(p);
			System.out.print(" E ");
			System.out.println(t);
		}
}
