package Interface.Entrada_Salida_Simple;

import javax.swing.*;

public class interfaz {
    public static void main(String[] args) {
        // Obtains user input from JQoptionpane input dialogs
        String primerNumero =
                JOptionPane.showInputDialog("Add firts number");
        String segundoNumero =
                JOptionPane.showInputDialog("Add second numbre");

        // Converts string inputs to int values for use in the calculation
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;

        // Displays the results in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is: " + suma,
                "Sum of 2 integers", JOptionPane.PLAIN_MESSAGE);
    }
} // End of class sum


