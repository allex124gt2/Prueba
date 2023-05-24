package Interface.MarcoDemoTeclas;
// Manejo de eventos de teclas.

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MarcoDemoTeclas extends JFrame implements KeyListener {
    private String linea1 = ""; // primera línea del área de texto
    private String linea2 = ""; // segunda línea del área de texto
    private String linea3 = ""; // tercera línea del área de texto
    private JTextArea areaTexto; // área de texto para mostrar la salida

    // constructor de MarcoDemoTeclas
    public MarcoDemoTeclas() {
        super("Demonstration of the keystroke events");

        areaTexto = new JTextArea(10, 15); // establece el objeto JTextArea
        areaTexto.setText("Press any key on the keyboard...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.BLACK);
        add(areaTexto); // agrega el área de texto a JFrame

        addKeyListener(this); // permite al marco procesar los eventos de teclas
    }

    // maneja el evento de oprimir cualquier tecla
    @Override
    public void keyPressed(KeyEvent evento) {
        linea1 = String.format("Key pressed: %s",
                KeyEvent.getKeyText(evento.getKeyCode())); // muestra la tecla oprimida
        establecerLineas2y3(evento); // establece las líneas de salida dos y tres
    }

    // maneja el evento de liberar cualquier tecla
    @Override
    public void keyReleased(KeyEvent evento) {
        linea1 = String.format("Key released: %s",
                KeyEvent.getKeyText(evento.getKeyCode())); // muestra la tecla liberada
        establecerLineas2y3(evento); // establece las líneas de salida dos y tres
    }

    // maneja el evento de oprimir una tecla de acción
    @Override
    public void keyTyped(KeyEvent evento) {
        linea1 = String.format("Key pressed: %s", evento.getKeyChar());
        establecerLineas2y3(evento); // establece las líneas de salida dos y tres
    }


    // establece las líneas de salida dos y tres
    private void establecerLineas2y3(KeyEvent evento) {
        linea2 = String.format("This key %s is an action key",
                (evento.isActionKey() ? "" : "no "));

        String temp = KeyEvent.getKeyModifiersText(evento.getModifiers());

        linea3 = String.format("Modifier keys pressed: %s",
                (temp.equals("") ? "none" : temp)); // imprime modificadoras

        areaTexto.setText(String.format("%s\n %s\n %s\n",
                linea1, linea2, linea3)); // imprime tres líneas de texto
    }
} // fin de la clase MarcoDemoTeclas
