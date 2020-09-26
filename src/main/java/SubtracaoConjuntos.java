import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> c1 = new ArrayList<Integer>();
    ArrayList<Integer> c2 = new ArrayList<Integer>();
    int i = 1;

    while (i!=0){
      i = scan.nextInt();
      if (i!=0) c1.add(i);
    }

    i = 1;

    while (i!=0){
      i = scan.nextInt();
      if (i!=0) c2.add(i);
    }

    c1.removeAll(c2);
    System.out.println(c1);
  }
}
