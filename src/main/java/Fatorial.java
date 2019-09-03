import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial 
{ 
	private static Scanner entrada = new Scanner(System.in);
    
    static BigInteger fatorial(int N) 
    { 
       
        BigInteger f = new BigInteger("1"); 
  
       
        for (int i = 2; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
    } 
  
     
    public static void main(String args[]) 
    { 
    	int N = entrada.nextInt();
        System.out.println(fatorial(N)); 
    } 
