import java.lang.Math;
import java.util.Scanner;

public class Calculadora {

	
        public int som(int x, int y) {
		return x + y;
	}
	public int sub(int x, int y){
		return x - y;
	}
	public double div(int x,int y){
		return x / y;
	}
	public int mult(int x, int y){
		return x - y;
	}
	public double raizQuadrada(double x) {
            System.out.println("Digite o valor para encontrar a raiz quadrada:"); 
            Scanner scan = new Scanner(System.in); 

            int y = scan.nextInt(); 
            double raizQuadrada = Math.pow(y, 0.5); 

        System.out.println("A raizQuadrada eh = " + raizQuadrada); 
            return raizQuadrada;
        } 
      }
	
       public static int potencia(double x, double z) {

        double resultado = 1;

        for (int i = 1; i <= z; i++) {

        resultado = resultado * x;

        }

        return resultado;

    }



