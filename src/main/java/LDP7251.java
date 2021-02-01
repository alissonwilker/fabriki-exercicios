import java.util.Scanner;
public class LDP7251{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(); 
		int maior = num;
		while (num != 0) {
		   num = in.nextInt();
		    if ((num > maior)&&(num != 0)){
		        maior = num;
		    } 
		}
		System.out.println("maior = " + maior);
	    }
}
