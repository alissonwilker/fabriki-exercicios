import java.util.Scanner;



public class LDP7251 {

    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        int N = Sc.nextInt();
        int maior = 0, menor = 0;
        maior = N;
        
        while(N != 0){
            N  = Sc.nextInt();
            menor =  N;
            
            if(menor>maior & menor !=0){
                maior=menor;
            }
            
        }System.out.println("maior = "+maior);
    }
    
