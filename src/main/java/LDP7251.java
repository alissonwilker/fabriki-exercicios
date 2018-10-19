import java.util.Scanner;

public class LDP7251{
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main (String arg[]){
       int num = 0;
       int i = -2147483648;
        float c = 0;
       
    while(true){
     num = entrada.nextInt(); 
     c = c + 1;
       if(num == 0){
         break;   
     }
    
     if( num > i ){
         i = num;
     }   
    }
  
    if(c == 1){
    i = 0;
    }
    
    System.out.println("maior = "+i);