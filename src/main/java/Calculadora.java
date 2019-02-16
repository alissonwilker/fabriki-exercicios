
public class Calculadora {
    
    public int soma(int x, int y) {
        return x + y;
    }
    
    public int subtracao(int x, int y) {
        return x - y;
    }
    
    public int multiplicacao(int x, int y) {
        return x * y;
    }
    
    public double divisao(int x, int y) {
//        if (y == 0)
//            throw new IllegalArgumentException("Um número não pode ser dividido por ZERO.");
        
        return x / y;
    }
    
}
