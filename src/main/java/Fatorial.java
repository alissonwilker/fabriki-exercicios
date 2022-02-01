package aula11;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	System.out.println("número que deseja calcular o fatorial?" );
	 System.out.println("0! = "+basicIterativeFactorial(0));
     System.out.println("25! = "+basicRecursiveFactorial(25));


 }

 private static BigInteger basicIterativeFactorial(int n){

  
     if(n == 0) return BigInteger.ONE; 

     BigInteger factorial = BigInteger.ONE;
    
     for (int i = 1; i <= n; i++) {
       
         BigInteger indice = BigInteger.valueOf(i);
   
         factorial = factorial.multiply(indice);
   
     }
     return factorial;
 }
 
     
 private static BigInteger basicRecursiveFactorial(int n){

     if(n == 0) return BigInteger.ONE;

     BigInteger m = BigInteger.valueOf(n);

     return m.multiply(basicRecursiveFactorial(n - 1));
 }    
}

