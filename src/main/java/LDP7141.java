package aula2;

import java.util.Scanner;

public class LDP7141 {
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);

       int peso = entrada.nextInt(); 
       int excesso = peso-50;
       int multa = excesso*4;
  
       if (peso > 50) {
       System.out.println( "excedente = "+ excesso );
       System.out.println( "multa = "+ multa );
       }
       else {
    	   System.out.println( "excedente = 0" );
           System.out.println( "multa = 0" );
       }

      
}
}
