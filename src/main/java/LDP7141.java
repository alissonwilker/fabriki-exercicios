import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String args[]) {
      int pesoMaximo = 50;
      int peso;
      int excedente = 0;
      int acrescimo = 0;
      
      peso = entrada.nextInt();
      
      if (peso > pesoMaximo) {
          excedente = peso - pesoMaximo;
          acrescimo = excedente * 4;
      } 

      System.out.println("excedente = " + excedente);
      System.out.println("multa = " + acrescimo);
    }
}
