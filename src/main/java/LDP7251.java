import java.util.Scanner;

public class LDP7251 {
    public static void main(String[] args) throws Exception {
        Scanner numero = new Scanner(System.in);
        int N = numero.nextInt();
        int maior = 0;

        while (N != 0){
            if (maior == 0){
                maior = N;
            }
            if (N > maior){
                maior = N;
            }
            N = numero.nextInt();
        }
        numero.close();
        System.out.println("maior= " +maior);
    }
}
