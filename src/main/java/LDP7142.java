import java.io.PrintStream;
import java.util.Scanner;


public class LDP7142 {
    
    private static final Scanner entrada = new Scanner(System.in);
    private static final PrintStream saida = System.out;

    public static void main(String[] args) {
       int cod = entrada.nextInt();
       int numhoras = entrada.nextInt();
       int salario, horaex, salhoraex = 0;
       
       if (numhoras > 50){
          horaex = (numhoras - 50); 
          salhoraex = (horaex * 20);
          salario = (50 * 10) + salhoraex; 
       }else{
           salario = (numhoras * 10);  
       }
       saida.println("o código do funcinário é: " + cod);
       saida.println("salário excedente: " + salhoraex);
       saida.println("o salário do funcionário é de: " + salario);
    }
    
}
