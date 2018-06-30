public class LDP7141 {

    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
        int peso = entrada.nextInt();
        int excedente = 0;
        for (int i = 50; i < peso; i++) {
            excedente += 1;
        }
        if (excedente > 0) {
            saida.println("excedente = " + excedente + "\nmulta = " + excedente * 4);
        } else {
            saida.println("excedente = " + excedente + " \nmulta = 0");
        }
    }
}