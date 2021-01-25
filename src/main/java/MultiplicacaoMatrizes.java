import java.util.Scanner;
import java.io.PrintStream;
public class MultiplicacaoMatrizes
{
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;
public static void main(String args[])
{
int l1, c1,c2,i,j,k,sum;
Scanner in = new Scanner(System.in);
l1 = in.nextInt();
c1 = in.nextInt();
c2 = in.nextInt();
if(c1>0 & c2>0 & l1>0)
{
int mat1[][] = new int[l1][c1]; 
int mat2[][] = new int[c1][c2]; 
int res[][] = new int[l1][c2];
for (i= 0; i < l1; i++)
{ 
for (j= 0; j < c1; j++)
mat1[i][j] = in.nextInt();
}
for (i= 0; i < c1; i++)
{ 
for (j= 0; j < c2; j++)
mat2[i][j] = in.nextInt();
}
for (i= 0; i < l1; i++)
for (j= 0; j < c2; j++)
{
sum=0;
for (k= 0; k < c1; k++)
{
sum +=mat1[i][k]*mat2[k][j];
}
res[i][j]=sum;
}
for (i= 0; i < l1; i++)
{
for (j= 0; j < c2; j++)
System.out.println(res[i][j]);
}
}
}
}
