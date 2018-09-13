import java.io.PrintStream;
import java.util.Scaner;

public class LDP7143 {
  public static void main(String[] args) {
  private static Scanner entrada = new Scanner (System.in);
  private static PrintStream saida = System.out;

  int n1 = entrada.next(); 

  int n2 = entrada.next(); 

  int n3 = entrada.next(); 

  int n4 = entrada.next(); 

  int quadrado1 = n1 * n1;

  int quadrado2 = n2 * n2;

  int quadrado3 = n3 * n3;

  int quadrado4 = n4 * n4;

  if (quadrado3 >= 1000) {


  } else {
 saida.printIn("a = " + n1);
     saida.printIn("b = " + n2);
     saida.printIn("c = " + n3);
     saida.printIn("d = " + n4);
    saida.printIn("a = " + quadrado1);
     saida.printIn("b = " + quadrado2);
     saida.printIn("c = " + quadrado3);
     saida.printIn("d = " + quadrado4);
  }
  }
}