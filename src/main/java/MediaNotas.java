import java.util.Scanner;

public class MediaNotas {

	 
	public static void main(String[] args) {
		
		       
			Scanner input = new Scanner(System.in);  
		double nota;     
		double somaNotas = 0;     
		double media;     
		int qtdnotas =0;
		
		System.out.print("Digite a quantidade de notas que deseja calcularª: ");
		qtdnotas =  input.nextInt();
		         
		for ( int i = 1; i <= qtdnotas; i++)     {    
			System.out.print("Digite a "+i+"ª nota: ");     
			nota = input.nextDouble();    
			somaNotas = somaNotas + nota;    
			}   
			media = somaNotas / qtdnotas;     
		
		    
				System.out.printf("Aluno aprovado. Media %s. ", media);    
			
		}

	}
