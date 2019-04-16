import java.util.Scanner;

public class MultiplicacaoMatrizes{
	private static Scanner t;

	public static void main (String args[]){
		t = new Scanner (System.in);
		
		int w, x, y;
		
		
		w = t.nextInt();
		
		
		x = t.nextInt();
		
		
		y = t.nextInt();
		
		
		int a[][] = new int[w][x];
		int b[][] = new int[x][y];	
		int cs [][] = new int [w][x];
		
		for (int i= 0; i <a.length; i++){
				
			for (int j= 0; j <a[i].length; j++){
				
					a[i][j] = t.nextInt();
			}
		}
		for (int i= 0; i <b.length; i++){
			
			for (int j= 0; j <b[i].length; j++){
				
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
