import java.util.Scanner;
public class LDP7251{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 1; 
        int menor = 0; 	
		int maior = 0;
		while (num != 0) {
		   num = in.nextInt();
		    if (num > maior){
		        maior = num;
		    }else {
		        num = menor;
		    }
		}
		System.out.println("maior = " + maior);
	    }
}
