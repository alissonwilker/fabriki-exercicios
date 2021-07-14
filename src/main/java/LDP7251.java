
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;


public class LDP7251 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Integer> conjuntoNumerico = new ArrayList<Integer>();
		
		int elementoDoConjunto;
		do {
			elementoDoConjunto = entrada.nextInt();
			conjuntoNumerico.add(elementoDoConjunto);
			
		} while (elementoDoConjunto  != 0);
		entrada.close();
		conjuntoNumerico.remove(new Integer(0));
		BinaryOperator<Integer> ehMaior = (n1, n2) -> n1 > n2 ? n1 : n2;
		
		Integer maiorNumero = conjuntoNumerico.stream().reduce((maior, elemento) -> ehMaior.apply(maior, elemento)).get();
		
		System.out.println(maiorNumero);
	}
}
