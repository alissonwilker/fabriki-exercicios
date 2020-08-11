import java.util.Scanner;

public class MediaNotas {
public static void main(String[] args) {
		
		       
			Scanner input = new Scanner(System.in);  
		double nota=0;     
		double somaNotas = 0;     
		double media;     
		int qtdnotas =0;
		
		System.out.print(": ");
		qtdnotas =  input.nextInt();
		         
		for ( int i = 1; i <= qtdnotas; i++)     {    
			System.out.print("Digite a "+i+"ª nota: ");     
			nota = input.nextDouble();
			
			somaNotas = somaNotas + nota;    
			}   
			media = somaNotas / qtdnotas;     
		
			    
			
			System.out.println(" " +nota);
				System.out.println(". " +media); 
				
			
		}

	}
