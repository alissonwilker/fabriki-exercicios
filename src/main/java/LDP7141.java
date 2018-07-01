import java.util.Scanner;

public class LDP7141 {
public static void main(String[]args) {
	int peso;
	int excesso;
	int multa= 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Peso dos peixes: ");
	peso  = sc.nextInt();
	sc.close();
	
	if(peso>50) {
		excesso = peso - 50;
		multa = excesso * 4;
		
	}
	else{
		excesso = 0;
		multa = 0;
	}
	System.out.println("excedente = "+excesso);
	System.out.println("multa = "+multa);
}
}