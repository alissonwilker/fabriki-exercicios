import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> c1 = new ArrayList<Integer>();
    ArrayList<Integer> c2 = new ArrayList<Integer>();
    int aux = 1;

    while (aux!=0){
      aux = scan.nextInt();
      if (aux!=0) c1.add(aux);
    }

    aux = 1;

    while (aux!=0){
      aux = scan.nextInt();
      if (aux!=0) c2.add(aux);
    }

    c1.removeAll(c2);

    System.out.println(c1);
  }
}
