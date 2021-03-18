public class LDP7253 {
    public static void main(String[] args) {
        int i = 1;
        contador(i);
    }

    public static void contador(int cont) {
        while (!(cont == 101)) {
            if(cont % 10 == 0) {
                System.out.println("Multiplo de 10");
            }
            cont++;
        }
    }
}
