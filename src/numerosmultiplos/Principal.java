import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

        
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        String resultado = NumerosMultiplos.calculararMultiplos(num1, num2);
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
                                