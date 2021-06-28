
import java.util.Scanner;
import java.io.PrintStream;
public class LDP7141 {

    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            int peso = entrada.nextInt();
            entrada.close();
            int excedente  = (peso - 50);
            int multa = excedente * 4;

            if (peso > 50){
               System.out.println("excedente = "+excedente);
                System.out.println("multa = "+multa);
            }else{
                System.out.println("excedente = 0");
                System.out.println("multa = 0");
            }}
    }
    

