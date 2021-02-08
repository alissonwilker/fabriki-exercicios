import java.util.Scanner;
class SubtracaoConjuntos{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] var1 = new int[6];
        for ( int i=0; i<6; i++ ) {
            var1[i]= scan.nextInt();
        }
        int[] var2 = new int[6];
        for ( int i=0; i<6; i++ ) {
            var2[i]= scan.nextInt();
        }
        int [] subtracao = new int[6];
        for ( int i=0; i<6; i++ ) {
            for ( int j=0; j<6; j++ ) {
                    subtracao[i] = var1[i] - var2[i];
            }
        }
        for ( int i=0; i<6; i++ )
            System.out.print(subtracao[i] + ", ");
        System.out.println("\n");
    }
}
