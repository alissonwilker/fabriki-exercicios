import java.util.Scanner;
public class LDP7251 {
	public static void main(String[]args) {
		int r=1,maior=Integer.MIN_VALUE;
		Scanner input= new Scanner(System.in);
		
		while(r!=0) {
			r= input.nextInt();
			
			if(r>maior && r!=0) {
				maior=r;
			
			}else if(r==0) {
				maior=0;
			}
		}
		System.out.println("maior = "+maior);
	}
}
