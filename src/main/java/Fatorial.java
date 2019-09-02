class Fatorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
    int fat=1;
    String mult="";
    for (int i=25; i>1; i--){
        fat *=i;
        mult +=i+" x ";
    }
    System.out.print(mult+"1 = "+fat);
	}
}
Success	#stdin
