package Interface.MarcoDetallesRaton;
// Demostración de los clics del ratón y cómo diferenciar los botones del mismo.

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MarcoDetallesRaton extends JFrame {
    private String detalles; // String que se muestra en barraEstado
    private final JLabel barraEstado; // JLabel que aparece en la parte inferior de la ventana

    // constructor establece String de la barra de título y registra componentede escucha del ratón
    public MarcoDetallesRaton() {
        super("Mouse clicks and buttons");

        barraEstado = new JLabel("Click on the mouse");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton()); // agrega el manejador
    }

    // clase interna para manejar los eventos del ratón
    private class ManejadorClicRaton extends MouseAdapter {
        // maneja evento de clic del ratón y determina cuál botón se oprimió
        @Override
        public void mouseClicked(MouseEvent evento) {

            int xPos = evento.getX(); // obtiene posición x del ratón
            int yPos = evento.getY(); // obtiene posición y del ratón

            detalles = String.format("Clicked % d time(times)",
                    evento.getClickCount());

            if (evento.isMetaDown()) // botón derecho del ratón
                detalles += "with the right mouse button";
            else if (evento.isAltDown()) // botón central del ratón
                detalles += "with the central mouse button";
            else // botón izquierdo del ratón
                detalles += "with the left mouse button";

            barraEstado.setText(detalles); // muestra mensaje en barraEstado
        }
    }
} // fin de la clase MarcoDetallesRaton

