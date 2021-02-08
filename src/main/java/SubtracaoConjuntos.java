public class SubtracaoConjuntos {

	public static void main(String[] args) {
		
		int conjA[][] = new int[][] { { 1, 2, 3, 4 } };
		int conjB[][] = { { 2, 3 } };
		int[][] conjC = new int[conjA.length][conjB[0].length];
		
		for (int i = 0; i < conjA.length; i++) {
			
		  for (int j = 0; j < conjB[0].length; j++) {
			  
		    for (int k = 0; k < conjB.length; k++) {
		    	
		      conjC[i][j] = conjA[i][k] - conjB[k][j]; }}}
		
		System.out.print(" ");
		for (int i = 0; i < conjC.length; i++) {
		  System.out.print("");
		  for (int j = 0; j < conjC[0].length; j++) {
		    System.out.print(" " + conjC[i][j] + ""); }
		  System.out.print(" "); }
		System.out.println("");
	}

}
