import java.util.Scanner;
public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);


	public static void main(String[] args) {
			int num = 1;
			int maior = -2147483648;
							
			while(num != 0) {
								
				num = entrada.nextInt();
				
				if(num != 0 & num > maior) {
					
					maior = num;
				
				}
				
			}
			
			
		if (num == 0 && maior == -2147483648){
		
		System.out.println("maior = " + 0);
		
		} else {
			
			System.out.println("maior = " + maior);
				}
		
}
	
}

