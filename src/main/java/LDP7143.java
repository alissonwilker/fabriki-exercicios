import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = System.out;
		// TODO Auto-generated method stub
 int a=0,a2=0,b=0,b2=0,c=0,c2=0,d=0,d2=0;
 a = entrada.nextInt();
 a2 = (a*a);
 
 b = entrada.nextInt();
 b2 = (b*b);

 c = entrada.nextInt();
 c2 = (c*c);
 
 d = entrada.nextInt();
 d2 = (d*d);
 
 if(c2 >= 1000){
	 saida.println("c2 = "+c2);

	}else{
		saida.println("a = "+a);
		saida.println("b = "+b);
		saida.println("c = "+c);
		saida.println("d = "+d);
		saida.println("a2 = "+a2);
		saida.println("b2 = "+b2);
		saida.println("c2 = "+c2);
		saida.println("d2 = "+d2);
	}

}
}