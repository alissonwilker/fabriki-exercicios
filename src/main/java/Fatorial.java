import java.math.BigInteger;

class Fatorial {
    public static void main(String[] args){
        // mais sobre BigInteger: https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
        BigInteger numero = new BigInteger("1", 10); // 
        for (int i = 1; i<=25; i++) {
            numero = numero.multiply( BigInteger.valueOf( i ) );
        }
        System.out.println("O fatorial  é igual a " + numero );
    }
}
