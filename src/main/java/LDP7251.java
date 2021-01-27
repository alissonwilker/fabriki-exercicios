import java.util.Scanner;

public class LDP7251 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        int maior;

        N = scanner.nextInt();
        maior = N;

        while(true){
            if(N == 0){
                break;
            }

            else if (N > maior){
                maior = N;
            }
            N = scanner.nextInt();

        }
        System.out.println("maior = " + maior);
    }
}
