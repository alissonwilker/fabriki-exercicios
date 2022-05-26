
import java.util.Scanner;
import java.math.BigInteger;
public class LDP7251{
	public static void main(String[] args) {
		int maior,
        num;
  int count=2;
  Scanner entrada = new Scanner(System.in);
  

	
  
    
  num = entrada.nextInt();
  maior = num;
  int n = num;
  
  if(n>0) {
	  
	  while(count <= 10){
		   
		   num = entrada.nextInt();

		   if(num > maior){
		    maior = num;
		   }

		   count++;
		  }

		  System.out.println("maior =  "+maior);

		 }
  
  else if (n<0) {
	  while(count <= 10){
		  
		   num = entrada.nextInt();

		   if(num > maior){
		    maior = num;
		   }

		   count++;
		  }

		  System.out.println("maior =  "+maior);

		 }
  else if(n==0) {
	  System.out.println("maior =  "+0);
	  
  }
  
  
}
	  
  }



