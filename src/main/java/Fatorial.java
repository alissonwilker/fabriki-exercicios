import java.util.Scanner;

public class Fatorial.java {

    public static void main(String[] args){
    
        Scanner ent = new Scanner(System.in);
        int num, fat = 1;
        int cont = 1;

        do{
            System.out.println("");
            num = ent.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            
            System.out.println("!" + num + " = " + fat);
            cont++;
            
       }while(cont < 2);
    }
}
