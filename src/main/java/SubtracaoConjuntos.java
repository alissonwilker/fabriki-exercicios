import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {

  public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    ArrayList<Integer> c1 = new ArrayList<Integer>();
    ArrayList<Integer> c2 = new ArrayList<Integer>();
    int i = 1;
    
    while (i!=0){
      i = scan1.nextInt();
      if (i!=0) {
    	  c1.add(i);
      }
      else {
    scan1.close();
    
      }
    
    i = 1;

    while (i!=0){
      i = scan2.nextInt();
      if (i!=0) {
    	  c2.add(i);
      }
    else {
    scan2.close();
    }
  }
    c1.removeAll(c2);
    System.out.println(c1);
  }
}
}
