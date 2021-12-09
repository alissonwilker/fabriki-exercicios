import java.util.Scanner;

public class LDP7141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner teclado = new Scanner(System.in);
	   	final int MAX = 50;
	   	final int MULTA =4;
	   	
	   	int peso = 0;
	   	int excedente = 0;
	   	int multa_valor = 0;
	   	
	   	peso = teclado.nextInt();
	   	
	   	if(peso > MAX) {
	   		excedente = peso - MAX;
	   	} else {
	   		excedente = 0;
	   	}
	   	teclado.close();
	   	
	   	multa_valor = excedente * MULTA;
	   	
	   	System.out.println("excedente = " + excedente);
	   	System.out.println("multa = " + multa_valor);		
	}

}
