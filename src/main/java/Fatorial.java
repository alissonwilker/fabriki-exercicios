import java.math.BigInteger;

class Fatorial {
    public static void main(String[] args){
        BigInteger numero = new BigInteger("1", 10); // 
        for (int i = 1; i<=24; i++) {
            numero = numero.multiply( BigInteger.valueOf( i ) );
        }
        System.out.println("O fatorial  é igual a " + numero );
    }
}
