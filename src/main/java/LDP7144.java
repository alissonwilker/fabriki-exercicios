import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
			//System.out.println();
			num = in.nextInt();

                        if(num % 2 == 0){
                                 System.out.print("PAR ");
                                 }
			else{
				System.out.print("ÍMPAR");
			}
			if(num<0){
				System.out.print(" E NEGATIVO");
				
			}else{ 
				System.out.print(" E POSITIVO"); 
}
}
}
