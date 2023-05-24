package Interface.MarcoRastreadorRaton;
// Manejo de eventos de ratón.

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MarcoRastreadorRaton extends JFrame {
    private final JPanel panelRaton; // panel en el que ocurrirán los eventos de ratón
    private final JLabel barraEstado; // muestra información de los eventos

    // El constructor de MarcoRastreadorRaton establece la GUI y
    // registra los manejadores de eventos de ratón
    public MarcoRastreadorRaton() {
        super("Demonstration of mouse events");

        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER); // agrega el panel a JFrame

        barraEstado = new JLabel("Mouse out of JPanel");
        add(barraEstado, BorderLayout.SOUTH); // agrega etiqueta a JFrame

        // crea y registra un componente de escucha para los eventos de ratón y de su movimiento
        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }


    private class ManejadorRaton implements MouseListener,
            MouseMotionListener {
        // Los manejadores de eventos de MouseListener
        // manejan el evento cuando se suelta el ratón justo después de oprimir el botón
        @Override
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Clicked on[ % d, % d]",
                    evento.getX(), evento.getY()));
        }

        // maneja evento cuando se oprime el ratón
        @Override
        public void mousePressed(MouseEvent evento) {
            barraEstado.setText(String.format("Pressed on[ % d, % d]",
                    evento.getX(), evento.getY()));
        }

        // maneja evento cuando se suelta el botón del ratón
        @Override
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("Released in[ % d, % d]",
                    evento.getX(), evento.getY()));
        }

        // maneja evento cuando el ratón entra al área
        @Override
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("Raton entered[ % d, % d]",
                    evento.getX(), evento.getY()));
            panelRaton.setBackground(Color.GREEN);
        }

        // maneja evento cuando el ratón sale del área
        @Override
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText("Mouse out of JPanel");
            panelRaton.setBackground(Color.WHITE);
        }

        // Los manejadores de eventos de MouseMotionListener manejan
        // el evento cuando el usuario arrastra el ratón con el botón oprimido
        @Override
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Crawled in[ % d, % d]",
                    evento.getX(), evento.getY()));
        }

        // maneja evento cuando el usuario mueve el ratón
        @Override
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Moved in[ % d, % d]",
                    evento.getX(), evento.getY()));
        }
    } // fin de la clase interna ManejadorRaton
} // fin de la clase MarcoRastreadorRaton

