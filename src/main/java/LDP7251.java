public class LDP7251 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        int maior;
        maior = entrada;
        while (entrada != 0) {
            entrada = input.nextInt();
            if (entrada != 0) {
                if (entrada > maior) {
                    maior = entrada;
                }
            }  
        }
        System.out.println("maior = " + maior);
    }
}
