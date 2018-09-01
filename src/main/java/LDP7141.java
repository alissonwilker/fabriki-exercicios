public class LDP7141 {
    static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Digite o peso de sua pescaria: ");
            int peso = Integer.parseInt( leia.nextLine());
            int excedente = (peso - 50) > 0 ? (peso - 50) : 0;
            int multa = excedente > 0 ?  excedente* 4 : 0;
        
            System.out.println("excedente = "+excedente+
                               "\nmulta = "+multa);
        }catch (NumberFormatException n) {
            System.out.println("Número inválido.");
        }
    }
}
