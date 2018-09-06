import java.io.PrintStream;
import java.util.Scanner;


public class LDP7142 {
    
    private static final Scanner entrada = new Scanner(System.in);
    private static final PrintStream saida = System.out;

    public static void main(String[] args) {
       int codigo = entrada.nextInt();
       int numhoras = entrada.nextInt();
       int salarioTotal, horaex, salarioExcedente = 0;
       
       if (numhoras > 50){
          horaex = (numhoras - 50); 
          salarioExcedente = (horaex * 20);
          salarioTotal = ((numhoras - horaex) * 10) + salarioExcedente; 
       }else{
           salarioTotal = (numhoras * 10);  
       }
       saida.println("codigo: " + codigo);
       saida.println("salarioExcedente: " + salarioExcedente);
       saida.println("salarioTotal: " + salarioTotal);
    }
    
}
