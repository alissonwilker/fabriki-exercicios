import java.util.Scanner;

public class LDP7251 { 
	public static void main(String[] args) {
 try (Scanner leitor = new Scanner(System.in)) {
	int n = leitor.nextInt();
    int maior = 0;
    
	  for(int i=0; i<n; i=i++) { 
		  n=leitor.nextInt(); 
		  if(n>maior){
			 maior = n;
		}
	  }
	  System.out.println("Maior = "+ maior);
	   }		  
	  }	  
  }
