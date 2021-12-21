import java.io.IOException;
import java.util.Scanner;

public class LDP7251 {
    public static void main(String[] args) throws IOException {
            Scanner entrada = new Scanner(System.in);
            int inputNumber = entrada.nextInt();
            int biggerThan = 0;
            do {
                if(biggerThan == 0 && inputNumber == 0) {
                    System.out.println("maior = " + biggerThan);
                    break;
                }
                if(inputNumber > biggerThan){
                    biggerThan = inputNumber;
                }
                inputNumber = entrada.nextInt();
            }
            while (inputNumber != 0);
            System.out.println("maior = " + biggerThan);
    }
}
