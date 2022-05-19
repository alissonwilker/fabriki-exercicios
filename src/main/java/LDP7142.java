import java.util.Scanner;

public class LDP7142 {
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
	int x, y ,z , a, r;
	 
	x = entrada.nextInt();
	y = entrada.nextInt();
	
  
	if (y<=50) {
		z = y*10;
		a = 0;
		System.out.println( "codigo = "+ x );
		System.out.println( "salarioExcedente = "+ a );
		System.out.println( "salarioTotal = "+ z);
	} else {
		
		int b = y-50;	
	    int c = b*20;
	    z = 500;
	    int f = z + c;
		System.out.println( "codigo = "+ x );
		System.out.println( "salarioExcedente = "+ c );
		System.out.println( "salarioTotal = "+f );
	}
	
}
}
