import java.util.Scanner;

public class LDP7251 {

/* Faça um algoritmo que determine o maior entre N números. A condição de parada é a entrada de um valor 0, ou seja,
   o algoritmo deve ficar calculando o maior até que a entrada seja igual a 0 (ZERO). */
    
    public static void main(String[] args) {
        
        int loop = 1;
        
              while(loop == 1){
        
        int maior = 0;
                  
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
           
        if(num == 0){
        
        System.out.println("maior = 0");   
        break;
        
        } 
         
        if(maior < num){
              
              maior = num;
              System.out.println("maior = " + maior);  
              
              } 
        
        }
        
      
        
        }
       
    }