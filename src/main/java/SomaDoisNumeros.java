import java.util.Scanner;
public class SomaDoisNumeros {
	public static void main(String[] args) {
			      int x, y, t = 0;
			      Scanner s = new Scanner( System.in );
			      System.out.println( "Digite um número: ");
			      x = s.nextInt();
			      System.out.println( "Digite outro número: ");
			      y = s.nextInt();
			      t = x + y;
			      System.out.println( "A soma dos números é: " + t );
	   }
}
