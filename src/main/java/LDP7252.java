import java.math.BigDecimal;

public class LDP7252 {

	public static void main(String[] args) {
					
		BigDecimal dois = new BigDecimal(2);
		
	
		BigDecimal soma = BigDecimal.ZERO;
		
		for (int i = 0; i <=64; i++) { //VERIFICAR TROCA POR 64
			
			
			soma = soma.add(dois.pow(i));
			
		}
			
		System.out.println("totalGraos= " +soma);
		/*BigInteger  graosCasa  = new BigInteger ("1");
				BigInteger  casasTabuleiro  = new BigInteger ("64");
				BigInteger graos = new BigInteger ("1");
				
				
				for(int x=1;x<casasTabuleiro;x++){
					graosCasa = graosCasa*2;
					graos +=graosCasa;
				}

				System.out.println("totalGraos=: "+graos);
*/
			}
		}
