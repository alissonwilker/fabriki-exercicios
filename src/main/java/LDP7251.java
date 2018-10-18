import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		
		int num = -1;
		int m = 0;
		while(num!=0){
			num = entrada.nextInt();
			if(num > m & num!=0){
				m=num;
				}	
			else if(num<0 && num<m){
				m=num;			
			}
			}
		System.out.print("maior = "+ m);
		

}
}