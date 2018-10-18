import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		
		int num = -1;
		int m = 0;
		do{
			num = entrada.nextInt();
			if(num!=0 & num> m){
				m=num;
				}
			else if(num!=0 && num<m){
				m=num;
				
			}
		}
		while(num!=0);
		System.out.print("maior = "+ m);
		
}
}