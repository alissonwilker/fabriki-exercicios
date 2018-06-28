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
