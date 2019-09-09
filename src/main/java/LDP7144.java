import javax.swing.JOptionPane;

public class LDP7144 {

     public static void main(String[] args) {
        int n;
        String var;
        
        if (n==0) {
            JOptionPane.showMessageDialog(null, "ZERO e PAR");
        } else {
            if (n>0) {
                //positivo
                if(n%2==0){
                    JOptionPane.showMessageDialog(null, "positivo e par");
                }
                else{
                    JOptionPane.showMessageDialog(null, "positivo e impar");
                }
            } else {
                // negativo
                if(n%2==0){
                    JOptionPane.showMessageDialog(null, "negativo e par");
                }
                else{
                    JOptionPane.showMessageDialog(null, "negativo e impar");
                }
            }
        }
        
    }
}
