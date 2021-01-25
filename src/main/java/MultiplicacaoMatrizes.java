import java.util.Scanner;
import java.io.PrintStream;
public class MultiplicacaoMatrizes
{
   public static void main(String args[])
   {
      int l1,c1,c2,i,j,k,sum;
      Scanner in = new Scanner(System.in);
      l1 = in.nextInt();
      c1  = in.nextInt();
      c2 = in.nextInt();
     {
        int mat1[][] = new int[l1][c1]; 
        int mat2[][] = new int[c1][c2]; 
 	 int res[][] = new int[l1][c2];
       i= 0 ;
    while( i < l1 )
        {   
             j= 0 ;
                while( j < c1)
	{
                  mat1[i][j] = in.nextInt();
	  j++ ;             
	}
                   i++; 
       }
             i= 0 ;
    while( i < c1 )
        {
             j= 0 ;
                while( j < c2)
	{
                  mat2[i][j] = in.nextInt();
	  j++ ;             
	}
                   i++; 
       }
          i= 0 ;
	while( i < l1 )
         {
                 j= 0 ;
	while( j <c2)
          	   {
 		sum=0;
                       k= 0 ; 
		while(k <c1)
  		{
                                       sum +=mat1[i][k]*mat2[k][j]   ;
		  k++ ;
                             }
                         res[i][j]=sum;
                       j++;
                }
i++;
      }
        i= 0 ;
	while( i < l1 )
       {
              j=0 ;
	while( j < c2 )
                {
                System.out.print(res[i][j] + " " + "\n");
 	j++;
	}	
          System.out.println();
        i++ ; 
       }
     }
   }
}
