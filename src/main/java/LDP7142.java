import java.util.Scanner;

public class LDP7142 {

    public static void main(String[] args) {

        int normal = 0;
        int extra = 0;
        int total = 0;

        int codigo = 0;

        int horas = 0;

        Scanner sc = new Scanner(System.in);

        codigo = sc.nextInt();

        if (codigo != 0) {
            horas = sc.nextInt();

            if (horas > 50) {
                extra = (horas - 50) * 20;
                normal = 50 * 10;
                total = extra + normal;
            } else {
                extra = 0;
                normal = horas * 10;
                total = extra + normal;
            }

            System.out.println("codigo = " + codigo);
            System.out.println("salarioExcedente = " + extra);
            System.out.println("salarioTotal = " + total);

        }

    }

}
