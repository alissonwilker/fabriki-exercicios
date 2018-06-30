public class LDP7141{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o valor do Peso?");
        int excedente = 0;
        int multa = 0;
        int peso = Integer.parseInt(input.nextLine());

        if (peso > 50) {
            excedente = peso - 50;
            multa = excedente * 4;

        }
        System.out.printf("Valor do Excedente é " + excedente + "KG" + " Valor da multa é " + multa + "R$");
    }
}
