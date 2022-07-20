import java.util.Scanner;
	import java.util.Set;
	import java.util.HashSet;
	
	
	public class SubtracaoConjuntos {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	Set<Integer> numerosA = new HashSet<Integer>();
	 
	int num;
	do {  num = entrada.nextInt();
	      numerosA.add(num);
	   
	      } while (num != 0);
	
	       
	Set<Integer> numerosB = new HashSet<Integer>();
	do {  num = entrada.nextInt();
	      numerosB.add(num);
	   
	      } while (num != 0);
	
	Set<Integer> subtracao = new HashSet<Integer>(numerosA);
	subtracao.removeAll(numerosB);
	
	for (Integer elementos : subtracao)
	System.out.println(elementos);
	
	
	}
	
	}
