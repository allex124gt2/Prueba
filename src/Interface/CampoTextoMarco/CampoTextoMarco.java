package Interface.CampoTextoMarco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContrasenia;


    public CampoTextoMarco() {
        super("Test JTextField and JPasswordField");
        setLayout(new FlowLayout());


        campoTexto1 = new JTextField(10);
        add(campoTexto1); // agrega campoTexto1 a JFrame


        campoTexto2 = new JTextField("Type the text here");
        add(campoTexto2); // agrega campoTexto2 a JFrame


        campoTexto3 = new JTextField("Non-editable text field", 21);
        campoTexto3.setEditable(false);
        add(campoTexto3);


        campoContrasenia = new JPasswordField("Hidden text");
        add(campoContrasenia);


        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
    }


    private class ManejadorCampoTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";


            if (evento.getSource() == campoTexto1)
                cadena = String.format("FieldText1: %s",
            evento.getActionCommand());


             else if (evento.getSource() == campoTexto2)
                cadena = String.format("FieldText2: %s",
            evento.getActionCommand() );


             else if (evento.getSource() == campoTexto3)
                cadena = String.format("FieldText3: %s",
            evento.getActionCommand());


             else if (evento.getSource() == campoContrasenia)
                cadena = String.format("fieldPassword: %s",
            evento.getActionCommand());


            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}



