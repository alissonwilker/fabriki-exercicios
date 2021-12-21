import java.io.IOException;
import java.util.Scanner;

public class LDP7251 {
    public static void main(String[] args) throws IOException {
            Scanner entrada = new Scanner(System.in);
            int inputNumber;
            int biggerThan = 0;
            do {
                inputNumber = entrada.nextInt();
                if(biggerThan == 0 && inputNumber == 0) {
                    break;
                }
                if(inputNumber > biggerThan){
                    biggerThan = inputNumber;
                }
            }
            while (inputNumber != 0);
            System.out.println("maior = " + biggerThan);
    }
}
