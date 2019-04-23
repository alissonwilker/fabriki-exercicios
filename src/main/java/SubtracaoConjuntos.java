import java.math.BigInteger;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		int n = 1;
		BigInteger valor= new BigInteger ("1");
		BigInteger acumular= new BigInteger("1");
		BigInteger numero = new BigInteger("2");
		
		for (n = 2; n <= 64; n++) {
			
			valor = valor.multiply(numero);
			acumular = acumular.add(valor);
								
		}
System.out.println("totalGraos = " + acumular);
		
	}  
}
