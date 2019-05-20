import java.util.Scanner;

public class LDP7142 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo = entrada.nextInt();
        int horas = entrada.nextInt();
        int salario, salarioexcedente = 0;
        int horasextras;

        if (horas > 50) {
            horasextras = horas - 50;
            salarioexcedente = horasextras * 20;
            salario = salarioexcedente + 500;
        } else {
            salario = horas * 10;
        }
        System.out.println("codigo = " + codigo);
        System.out.println("salarioExcedente = " + salarioexcedente);
        System.out.println("salarioTotal = " + salario);
    }

}
