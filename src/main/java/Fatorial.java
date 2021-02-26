import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt(), fatorial = 1;

        while(entrada > 0){
            fatorial *= entrada;
            entrada --;
        }

        System.out.println(fatorial);

    }
}
