import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class SubtracaoConjuntos {

  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
        
    Set<Integer> Set1 = new HashSet<>();
          int n = scanner1.nextInt();
          if (n != 0)  {
            for (int i = 0; i < Set1.size(); i++); {
            Set1.add(n);                      
          }          
    }
            else {
              scanner1.close();       
      }          
          Set<Integer> Set2 = new HashSet<>();
            int t = scanner2.nextInt();
            if (t != 0)  {
               for (int i = 0; i < Set2.size(); i++); {
               Set2.add(t);                      
         }              
    }            
            else {
              scanner2.close(); 
      }          
          Set<Integer> igualdade = new HashSet<Integer>();
          igualdade.addAll(Set1);
          igualdade.retainAll(Set2);
          
          Set<Integer> diferenca = new HashSet<Integer>();
          igualdade.addAll(Set1);
          diferenca.removeAll(Set2);
          System.out.println(diferenca);   
          
  }  
}
