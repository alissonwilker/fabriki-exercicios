import java.util.Scanner;


public class LDP7141{
    
    public static void main(String[] args) {
        
       Scanner tec = new Scanner(System.in);
       
       int n1 = tec.nextInt();
      
       if(n1>50){
 
           n1 = n1-50;
           System.out.println("excedente = "+n1);
           n1 = n1*4;
           System.out.println("multa = "+n1);
       }else{
           System.out.println("excedente = 0");
           System.out.println("multa = 0");
       }
    }
    
}
