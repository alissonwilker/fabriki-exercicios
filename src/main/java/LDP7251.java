import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {

private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;
	
public static void main(String[] args) {
int n=-1,n2=0,m=0;
n = entrada.nextInt();

while (n!=0){
	m=n;
	n2 = entrada.nextInt();
	
	if(n2>m){
		m=n2;
	
	}else if(n>m){
		m=n;
	}
	n = entrada.nextInt();

}
saida.println("maior = " + m);
}
}