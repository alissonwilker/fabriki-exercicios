import java.util.Scanner;

public class Fatorial{

    public static void main (String args[]){
        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int fat = n;

        while (n > 1){
            fat = fat *(n-1);
            n--;
        }
        System.out.println(fat);
    }
}
