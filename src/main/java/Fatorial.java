package controller;

import util.Teclado;

public class Fatorial {

            public static void main(String[] args) {
    
                       int n, fat = 1;
                       n = Teclado.lerInt("");
                       for ( int cont = 1 ; cont <= n ; cont ++ ) {
                       fat = fat * cont;
}
                       System.out.println("O fatorial de " + n + " é " + fat);

}
}
