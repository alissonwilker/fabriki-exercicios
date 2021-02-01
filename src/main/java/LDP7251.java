import java.util.Scanner;
import java.io.PrintStream;
public class LDP7251
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 1; 
		int maior = 0;
		while (num != 0) {
		   num = in.nextInt();
		    if (num > maior){
		        maior = num;
		    }
		}
		System.out.println("maior = " + maior);
	    }
