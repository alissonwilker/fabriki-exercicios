import java.util.Scanner;

public class Fatorial {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int f = x; 
        if(x == 0){
            System.out.println(1);
            return;
        }else{
            while (x > 1){
                f = f *(x-1); x--;
            }
        }
        System.out.println(f); 
    }
}
