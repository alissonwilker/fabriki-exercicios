import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SubtracaoConjuntos {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    List<Integer> conjuntoA = new ArrayList<Integer>();
    List<Integer> conjuntoB = new ArrayList<Integer>();
    List<Integer> conjuntoC = new ArrayList<Integer>();


    while (s.hasNextInt()) {
      int a = s.nextInt();
      if (a == 0) {
        break;
      } else {
        conjuntoA.add(a);
      }
    }
    
    while(s.hasNextInt()){
      int b = s.nextInt();
      if (b == 0) {
        break;
      } else {
        conjuntoB.add(b);
      }
    }

    conjuntoA.removeAll(conjuntoB);
    
    System.out.println(conjuntoA);

  }

}
