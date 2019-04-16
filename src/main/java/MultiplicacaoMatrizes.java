public class MultiplicacaoMatrizes{
	private static Scanner t;

	public static void main (String args[]){
		t = new Scanner (System.in);
		
		int w, x, y;
		
		System.out.println("Digite o numero de linhas da Matriz A :");
		w = t.nextInt();
		
		System.out.println("Digite o numero de colunas da Matriz A :");
		x = t.nextInt();
		
		System.out.println("Digite o numero de linhas da Matriz B :");
		y = t.nextInt();
		
		
		int a[][] = new int[w][x];
		int b[][] = new int[x][y];	
		int cs [][] = new int [w][x];
		
		for (int i= 0; i <a.length; i++){
				
			for (int j= 0; j <a[i].length; j++){
				System.out.print ("Digite o elemento "+i+ " " +j+" da matriz a: ");
					a[i][j] = t.nextInt();
			}
		}
		for (int i= 0; i <b.length; i++){
			
			for (int j= 0; j <b[i].length; j++){
				System.out.print ("Digite o elemento "+i+ " " +j+ " da matriz b: ");
					b[i][j] = t.nextInt();		
			}
		}
		for (int i= 0; i < cs.length; i++){
			for (int j= 0; j < cs[i].length; j++){
				for (int k= 0; k < a[i].length;k++){
					cs[i][j] += a[i][k] * b[k][j];
						System.out.println(cs[i][j]);
		
}
			}
		}	
	}
}
