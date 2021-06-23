import java.util.Scanner;


public class LDP7141{
    
    public static void main(String[] args) {
        
       Scanner tec = new Scanner(System.in);
       
       int n1 = tec.nextInt();
      
       if(n1>50){
 
           int n2 = n1-50;
           System.out.println("excedente = "+n2);
           n2 = n2*4;
           System.out.println("multa = "+n2);
       }else{
           System.out.println("excedente = 0");
           System.out.println("multa = 0");
       }
    }
    
}
