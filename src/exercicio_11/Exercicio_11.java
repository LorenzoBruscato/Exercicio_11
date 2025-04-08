package exercicio_11;

import javax.swing.JOptionPane;

public class Exercicio_11 {

    public static void main(String[] args) {
        int numero1;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        if (((numero1 > 0 || numero1 < 0) && (numero1 % 2 == 0))) {
            JOptionPane.showMessageDialog(null, "O resultado é: " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado não encontrado");
        }
    }
}