package Interface.MarcoCuadroCombinado;
// Objeto JComboBox que muestra una lista de nombres de imágenes.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MarcoCuadroCombinado extends JFrame {

    private final JComboBox<String> imagenesJComboBox; // contiene los nombres de los iconos
    private final JLabel etiqueta; // muestra el icono seleccionado

    private static final String nombres[] =
            {"numero1.gif", "numero2.gif", "numero3.gif", "numero4.gif"
            };
    private final Icon[] iconos = {

            new ImageIcon(getClass().getResource(nombres[0])),
            new ImageIcon(getClass().getResource(nombres[1])),
            new ImageIcon(getClass().getResource(nombres[2])),
            new ImageIcon(getClass().getResource(nombres[3]))};

    // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
    public MarcoCuadroCombinado() {
        super("JComboBox Test");
        setLayout(new FlowLayout()); // establece el esquema del marco

        imagenesJComboBox = new JComboBox<String>(nombres); // establece JComboBox
        imagenesJComboBox.setMaximumRowCount(3); // muestra tres filas
        imagenesJComboBox.addItemListener(
                new ItemListener() // clase interna anónima
                {
                    // maneja evento de JComboBox
                    @Override
                    public void itemStateChanged(ItemEvent evento) {
                        // determina si está seleccionado el elemento
                        if (evento.getStateChange() == ItemEvent.SELECTED)
                            etiqueta.setIcon(iconos[
                                    imagenesJComboBox.getSelectedIndex()]);
                    }
                } // fin de la clase interna anónima
        ); // fin de la llamada a addItemListener


        add(imagenesJComboBox); // agrega cuadro combinado a JFrame
        etiqueta = new JLabel(iconos[0]); // muestra el primer icono
        add(etiqueta); // agrega etiqueta a JFrame
    }
} // fin de la clase MarcoCuadroCombinado
