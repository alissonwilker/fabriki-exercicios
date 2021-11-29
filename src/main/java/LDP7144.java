package lDP7144;

public class LDP7144 {
	public static void main(String[] args){
		int modulo;
		int numero=10;
//professor, nao achei um comando de entrada e registro de dados em variáveis
		modulo = numero%2;
		
		if(modulo==0) {
			if(numero>=0){
				System.out.println("PAR E POSITIVO");
			}else {System.out.println("PAR E NEGATIVO");}
		}else {
			if(numero<0){
				System.out.println(numero+" ÍMPAR E POSITIVO");
			}else {System.out.println("ÍMPAR E NEGATIVO");}
		}
		
	}
}
	
