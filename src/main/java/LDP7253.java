public class LDP7253 {
    public static void main(String[] args) throws Exception {
        int QtdMultiplos = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 10 == 0) {
                System.out.println("Multiplo de 10");
                QtdMultiplos = QtdMultiplos + 1;
            }
        }
        System.out.println(QtdMultiplos);
    }
}
