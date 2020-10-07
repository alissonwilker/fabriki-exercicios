import java.util.Scanner;

public class LDP7143{  
      
    public static void main(String[] args) {  
      int a, b, c, d, a2, b2, c2, d2;
     //ler as entradas a, b, c, d
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
            System.out.print("c2 = "+c2 );
      }
           else{
        System.out.print("a = "+a);
         System.out.print("b = "+b);
          System.out.print("c = "+c);
           System.out.print("d = "+d);
            System.out.print("a2 = "+a2);
             System.out.print("b2 = "+b2);
              System.out.print("c2 = "+c2);
               System.out.print("d2 = "+d2);
            
      } 
     
    }  
      
}
