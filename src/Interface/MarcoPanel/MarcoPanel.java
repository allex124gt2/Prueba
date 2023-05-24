package Interface.MarcoPanel;
// Uso de un objeto JPanel para ayudar a distribuir los componentes.

import javax.swing.*;
import java.awt.*;

public class MarcoPanel extends JFrame {
    private final JPanel panelBotones; // panel que contiene los botones
    private final JButton[] botones;


    // constructor sin argumentos
    public MarcoPanel() {
        super("Demo Panel");

        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length));


        // crea y agrega los botones
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Button " + (cuenta + 1));
            panelBotones.add(botones[cuenta]); // agrega el botón al panel
        }

        add(panelBotones, BorderLayout.SOUTH); // agrega el panel a JFrame
    }
} // fin de la clase MarcoPanel

