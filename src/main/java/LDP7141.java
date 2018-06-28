import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sam
 */
public class LDP7141 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Peso"));
        float excesso = peso - 50;
        if (excesso > 0) {
            float multa = excesso * 4;
            JOptionPane.showMessageDialog(null, "Valor do Excedente é " + excesso + "KG"+ " Valor da multa é " + multa+ "R$");
        } else {
            JOptionPane.showMessageDialog(null, "Não houve excedente");
        }
    }
}
