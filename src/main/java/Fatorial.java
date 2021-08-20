import java.util.Scanner;

public class Fatorial
{
	public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
	    int fat = 1;
	    int i = 2;
	    while (i <= n) {
	        fat = fat * i;
	        i++;
	    }
	    System.out.println(fat);

	}
}
