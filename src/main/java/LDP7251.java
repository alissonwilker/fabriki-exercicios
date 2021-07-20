
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LDP7251 {
public static void main(String[] args) {
	Scanner lernumeros= new Scanner(System.in);
	int numeros=lernumeros.nextInt();	
	List<Integer> lista = new ArrayList<Integer>();
	
		if (numeros != 0 ) {
			lista.add(numeros);
		}
		System.out.println(lista);
}}
