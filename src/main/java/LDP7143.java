import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores = new int[4];
		int cont=0, condicional;
		char x = 'a', y='a';
		
		while(cont<4) {
			valores[cont] = sc.nextInt();
			cont++;}
		
		condicional = valores[2]*valores[2];
		
		if (condicional>=1000) {
			System.out.println("c2 = "+condicional);}
		
		else {
			for(int a = 0; a<4; a++) {
				System.out.println(x+" = "+valores[a]);
				x++;}
			
			for(int b=0; b<4; b++) {
				System.out.println(y+"2"+" = "+(valores[b]*valores[b]));
				y++;}}
		
		}

}
