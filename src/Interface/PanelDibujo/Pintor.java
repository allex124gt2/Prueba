package Interface.PanelDibujo;
// Prueba de PanelDibujo.

import javax.swing.*;
import java.awt.*;

public class Pintor {
    public static void main(String[] args) {

        // crea objeto JFrame
        JFrame aplicacion = new JFrame("A simple drawing program");

        PanelDibujo panelDibujo = new PanelDibujo();
        aplicacion.add(panelDibujo, BorderLayout.CENTER);

        // crea una etiqueta y la coloca en la región SOUTH de BorderLayout
        aplicacion.add(new JLabel("Drag the mouse to draw"),
                BorderLayout.SOUTH);

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(400, 200);
        aplicacion.setVisible(true);
    }
} // fin de la clase Pintor

