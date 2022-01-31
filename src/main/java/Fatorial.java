import java.util.Scanner; 

public class Fatorial {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		
		
		int fat = 1;
		
		if(num <= 25){
			
        for(int i = 2; i <= num; i++)
        {
         
            fat *= i;
        }
	        System.out.println(+fat);
		}
	}

}
