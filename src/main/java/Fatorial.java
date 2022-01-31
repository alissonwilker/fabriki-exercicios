import java.util.Scanner;

public class Fatorial{

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int num, fat = 1;
        int cont = 1;

        do{
            num = sc.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            
            System.out.println(fat);
            cont++;
            
       }while(cont < 2);
    }
}
