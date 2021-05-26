import java.util.Scanner;

/**
 *
 * @author user
 */
public class LDP7251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tec= new Scanner(System.in);
      
        int n1=1;
        int n2=0;
        
        while(n1!=0){
            while(n1>0){
                n1=tec.nextInt(); 
                if(n1>n2){
                n2=n1;
                }
            }
           while(n1<0){
               if(n2>0){
                    n2=0;
               }
               n1=tec.nextInt();
               if(n1>n2){
                   n2=n1;
               }
           }
            
        }
        System.out.println("maior = "+n2);
        
    }
   }
    

