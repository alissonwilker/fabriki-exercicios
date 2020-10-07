import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LDP7143{  
      
    public static void main(String[] args) {  
      int a, b, c, d;
      int a2=0, b2=0, c2=0, d2 = 0;
     //ler as entradas a, b, c, d
     Set<Integer> conjunto = new HashSet<>();
     Scanner ent = new Scanner(System.in);
     a = ent.nextInt();
     b = ent.nextInt();
     c = ent.nextInt();
     d = ent.nextInt();
     
          a2 = a*a;
          b2 = b*b;
          c2 = c*c;
          d2 = d*d;
          
          
      if(c2>=1000){
            System.out.print("c2 = " +c2);
      }
           else{
        System.out.print("a = "+a+"\n"+
                         "b = "+b+"\n"+
                         "c = "+c+"\n"+
                         "d = "+d+"\n"+
                         "a2 = "+a2+"\n"+
                         "b2 = "+b2+"\n"+
                         "c2 = "+c2+"\n"+
                         "d2 = "+d2+"\n");
            
      } 
     
    }  
      
}
