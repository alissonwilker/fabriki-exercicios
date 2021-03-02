import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PrintStream saida = System.out;
    private final static int PAGAMENTO_POR_EXCEDENTE = 20;
    private final static int PAGAMENTO_POR_HORA = 10;
    private final static int HORAS_BASE = 50;

    public static void main(String[] args) {
         int codigo = lerEntrada();
         int horasTrabalhadas = lerEntrada();
         int salario = calcularSalario(horasTrabalhadas);
         int salarioExcedente = calcularSalarioExcedente(salario, horasTrabalhadas);

         printarSaida(codigo, salarioExcedente, salario);
    }

    public static int lerEntrada() {
        return scanner.nextInt();
    }

    public static int calcularSalario (int horasTrabalhadas) {
        if(temHorasExtras(horasTrabalhadas)) {
            int horasExcedente = horasTrabalhadas - HORAS_BASE;
            int salario = (horasExcedente * PAGAMENTO_POR_EXCEDENTE) + (HORAS_BASE * PAGAMENTO_POR_HORA);
            return salario;
        }
        int salario = horasTrabalhadas * PAGAMENTO_POR_HORA;
        return salario;
    }

    public static boolean temHorasExtras(int horasTrabalhadas) {
        if(horasTrabalhadas > HORAS_BASE) {
            return true;
        }
        return false;
    }

    public static int calcularSalarioExcedente (int salarioTotal, int horasTrabalhadas) {
        if (temHorasExtras(horasTrabalhadas)) {
            return salarioTotal - (HORAS_BASE * PAGAMENTO_POR_HORA);
        }
        return 0;
    }

    public static void printarSaida(int codigo, int salarioExcedente, int salarioTotal) {
        saida.println("codigo = " + codigo);
        saida.println("salarioExcedente = " + salarioExcedente);
        saida.println("salarioTotal = " + salarioTotal);
    }

}
