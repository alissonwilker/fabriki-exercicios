public class LDP7141 {

    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {

        System.out.println("Digite o kilo: ");
        float peso = entrada.nextInt();
        float excesso = peso - 50;
        if (excesso > 0) {
            float multa = excesso * 4;
            System.out.println("Valor do Excedente é " + excesso + "KG" + " Valor da multa é " + multa + "R$");
        } else {
            System.out.println("Não houve excedente");
        }
    }
}
