public class LDP7252 {
    public static void main(String[] args) {

        int soma = 0;
        int mult = 1 ;
        for (int i = 1 ; i<=64; i++) {
            mult *= 2;
            soma += mult;
        }
        System.out.println("totalGraos = "+ soma);
    }
}
