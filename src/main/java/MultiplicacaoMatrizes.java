import java.util.Scanner;
public class MultiplicacaoMatrizes

{
   public static void main(String args[])
   {
      int r1, r2,c1,c2,i,j,k,sum;
      Scanner in = new Scanner(System.in);
      r1 = in.nextInt();
      c1  = in.nextInt();
      c2 = in.nextInt();
     {
        int mat1[][] = new int[r1][c1]; 
        int mat2[][] = new int[c1][c2]; 
        int res[][] = new int[r1][c2];
       i= 0 ;
       do
        {   
             j= 0 ;
             do
	{
                  mat1[i][j] = in.nextInt();
	  j++ ;             
	}   while( j < c1);
                   i++; 
       }while( i < r1 );
             i= 0 ;
          do
          {   
             j= 0 ;
                do
	{
                  mat2[i][j] = in.nextInt();
	  j++ ;             
	}while( j < c2);
                   i++; 
         }while( i < c1 );
          i= 0 ;
	do
              {
                 j= 0 ;
	  do
          	   {
 		sum=0;
                              k= 0 ; 
		do
  		{
                                       sum +=mat1[i][k]*mat2[k][j]   ;
		  k++ ;
                             }while(k <c1);
                                res[i][j]=sum;
                           j++;
                     }while( j <c2);
                   i++;
            }while( i < r1 );
        i= 0 ;
	do
             {
                 j=0 ;
	 do
                {
                    System.out.print(res[i][j]+" " +"\n" );
 	     j++;
	 }while( j < c2 );	
               System.out.println();
                i++ ; 
             }while( i < r1 );
     }
   }
}
