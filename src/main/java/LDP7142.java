import java.util.Scanner;
public class LDP7142 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codido = scanner.nextInt();
	int salario;
        int horasTrabalhadas = scanner.nextInt();

        if (horasTrabalhadas <= 50) {
            salario = horasTrabalhadas * 10;
            System.out.println("codigo = " + codido);
            System.out.println("salarioExcedente = " + 0);
            System.out.println("salarioTotal = " + salario);
        } else {
            int horaExtra = horasTrabalhadas - 50;
            int horasNormais = horasTrabalhadas - horaExtra;
            int salarioExcedente = (horaExtra * 20);

            salario = (horasNormais * 10) + salarioExcedente;
            System.out.println("codigo = " + codido);
            System.out.println("salarioExcedente = " + salarioExcedente);
            System.out.println("salarioTotal = " + salario);
        }
    }
}
