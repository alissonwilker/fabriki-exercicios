package aula10;

import java.util.*;
public class SubtracaoConjuntos {

public static void main(String[] args){


	

	
				Set<Integer> conjuntoA = new HashSet<Integer>();


				conjuntoA.add(1);
				conjuntoA.add(2);
				conjuntoA.add(3);

				Set<Integer> conjuntoB = new HashSet<Integer>();
				conjuntoB.add(2);


				conjuntoA.removeAll(conjuntoB);

				// print conjuntoA
				System.out.println("resultado : "+ conjuntoA);


		}
	



		
	}
	
	
