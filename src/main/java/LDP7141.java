import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
    private static Scanner entrada =new Scanner(System.in);
    private static PrintStream saida = System.out;
	public static void main(String[] args) {
		  int pesoEntrada = entrada.nextInt();
		  int excedente = 0  ;
		  int multa = 0;
		 
		if(pesoEntrada >= 50){
			excedente = pesoEntrada - 50;
			   multa = excedente * 4 ;
			  
		  }else{
			  excedente = 0;
		  }
		  saida.println("excedente = "+ excedente);
		  saida.println("multa = "+ multa);

	}

}
