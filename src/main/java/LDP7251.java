
import java.io.IOException;
import java.util.Scanner;

public class LDP7251 {
    public static void main(String[] args) throws IOException {
            Scanner entrada = new Scanner(System.in);
            int inputNumber = entrada.nextInt();
            int biggerThan = 0;
            do {
                if(inputNumber <= biggerThan) {
                    inputNumber = entrada.nextInt();
                    continue;
                }
                else{
                    biggerThan = inputNumber;
                    System.out.println("maior = " + biggerThan);
                    inputNumber = entrada.nextInt();
                }
            }
            while (inputNumber != 0);
    }
}
