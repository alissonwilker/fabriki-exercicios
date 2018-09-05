
import java.io.PrintStream;
import java.util.Scanner;


public class LDP7142 {
    
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
       int cod = entrada.nextInt();
       int numHoras = entrada.nextInt();
       long salario = 0;
       long horaEx = 0;
       long salhoraex = 0;
       
       if (numHoras > 50){
          horaEx = (numHoras - 50); 
          salhoraex = (horaEx * 20);
          salario = (50 * 10) + salhoraex; 
       }else{
           salario = (numHoras * 10);  
       }
       saida.println("O Código do Funcinário é: " + cod);
       saida.println("Salário Excedente: " + salhoraex);
       saida.println("O Salário do Funcionário é de: " + salario);
    }
    
}
