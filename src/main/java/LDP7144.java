import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada =new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		String valor, tipo;
		
		x = entrada.nextInt();
		
		if(x%2==0) {
			tipo = "PAR";
			
		}else {
			tipo = "ÍMPAR";
		}
		
		if(x>0){
			
			valor = "POSITIVO";
		
		}else{
			
			valor ="NEGATIVO";			
		}
	
		saida.println(tipo+" E "+valor);
	
x = entrada.nextInt();
		
		if(x%2==0) {
			tipo = "PAR";
			
		}else {
			tipo = "ÍMPAR";
		}
		
		if(x>0){
			
			valor = "POSITIVO";
		
		}else{
			
			valor ="NEGATIVO";			
		}
	
		saida.println(tipo+" E "+valor);
		
		x = entrada.nextInt();
		
		if(x%2==0) {
			tipo = "PAR";
			
		}else {
			tipo = "ÍMPAR";
		}
		
		if(x>0){
			
			valor = "POSITIVO";
		
		}else{
			
			valor ="NEGATIVO";			
		}
	
		saida.println(tipo+" E "+valor);
		
		x = entrada.nextInt();
		
		if(x%2==0) {
			tipo = "PAR";
			
		}else {
			tipo = "ÍMPAR";
		}
		
		if(x>0){
			
			valor = "POSITIVO";
		
		}else{
			
			valor ="NEGATIVO";			
		}
	
		saida.println(tipo+" E "+valor);
	}

}