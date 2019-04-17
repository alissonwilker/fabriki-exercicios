import java.util.Scanner;
public class LDP7251 {
	public static void main(String[]args) {
		int r=1,c=0,maior=0,d=0;
		Scanner input= new Scanner(System.in);
	
		while(r!=0) {
			r= input.nextInt();
			if(r>c && r!=0) {
				c=r;
				maior=r;
			}
		}
		System.out.println("maior = "+maior);
	}
}
