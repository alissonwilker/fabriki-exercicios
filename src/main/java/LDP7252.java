public class LDP7252 {
    public static void main(String[] args){
        long graos = 1;
        long sum = 0;

        for (int i = 0; i < 64 ; i++){
            sum += graos;
            graos *= 2;
        }
        System.out.println("totalGraos = " + sum);
    }
}
