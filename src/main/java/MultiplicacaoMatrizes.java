import java.util.Scanner;
class MultiplicacaoMatrizes
{
public static void main(String args[])
{
int r1, r2,c1,c2,i,j,k,sum;
Scanner in = new Scanner(System.in);
r1 = in.nextInt();
c1 = in.nextInt();
r2 = c1;
c2 = in.nextInt();
if(c1==r2)
{
int mat1[][] = new int[r1][c1]; 
int mat2[][] = new int[r2][c2]; 
int res[][] = new int[r1][c2];
for ( i= 0 ; i < r1 ; i++ )
{ 
for ( j= 0 ; j < c1 ;j++ )
mat1[i][j] = in.nextInt();
}
for ( i= 0 ; i < r2 ; i++ )
{ 
for ( j= 0 ; j < c2 ;j++ )
mat2[i][j] = in.nextInt();
}
for ( i= 0 ; i < r1 ; i++ )
for ( j= 0 ; j <c2;j++)
{
sum=0;
for ( k= 0 ; k <r2;k++ )
{
sum +=mat1[i][k]*mat2[k][j] ;
}
res[i][j]=sum;
}
for ( i= 0 ; i < r1; i++ )
{
for ( j=0 ; j < c2;j++ )
System.out.print(res[i][j]+" " +"\n");
System.out.println();
}
}
}
}
