import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    /**
     * @param args the command line arguments
     */
       saida.print(" ");
       int KG = entrada.nextInt();
       
       int excedente = 0;
       for(int i = 50; i < KG ; i++){
           excedente += 1;
        }
        int multa = excedente*4;
        if(excedente > 0) {
            saida.println("excedente=" + excedente +"\nmulta="+multa);
        }else{
            saida.println("excedente="+ excedente +" \nmulta="+multa);
        }
    }

