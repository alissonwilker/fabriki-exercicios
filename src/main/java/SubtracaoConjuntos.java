import java.math.BigInteger;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		int n = 1;
		BigInteger valor= new BigInteger ("1");
		BigInteger acumulador= new BigInteger("1");
		BigInteger num = new BigInteger("2");
		
		for (n = 2; n <= 64; n++) {
			
			valor = valor.multiply(num);
			acumulador = acumulador.add(valor);
		}
                 
              System.out.println("Total = " + acumulador);
		
	}  
}
