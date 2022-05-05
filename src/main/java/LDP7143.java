import java.util.Scanner;


public class LDP7143 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
			int numa = entrada.nextInt();
			int numb = entrada.nextInt();
			int numc = entrada.nextInt();
			int numd = entrada.nextInt();
			int quadradoa = (numa * numa);
			int quadradob = (numb * numb);
			int quadradoc = (numc * numc);
			int quadradod = (numd * numd);
			
	
		
		if(quadradoc >= 1000) {
			System.out.println( "c2 = " + quadradoc);
		}
			
		
		else {
			System.out.println( "a = " + numa);
			System.out.println("b = " + numb);
			System.out.println("c = " + numc);
			System.out.println("d = " + numd);
			
			System.out.println( "a2 = " + quadradoa);
			System.out.println("b2 = " + quadradob);
			System.out.println("c2 = " + quadradoc);
			System.out.println("d2 = " + quadradod);
			
			
			
}
		
}
}
