package Interface.MarcoAreaTexto;

// Copia el texto seleccionado de un área JText a otra.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoAreaTexto extends JFrame {

    private final JTextArea areaTexto1; // muestra cadena de demostración
    private final JTextArea areaTexto2; // el texto resaltado se copia aquí
    private final JButton botonCopiar; // inicia el copiado de texto

    // constructor sin argumentos
    public MarcoAreaTexto() {
        super("Demo JTextArea");
        Box cuadro = Box.createHorizontalBox(); // crea un cuadro
        String demo = "This is a chain of\ndemonstration for\n" +
                "illustrate how to copy text\nfrom a text area to \n" +
                "other, using a\nexternal event\n";

        areaTexto1 = new JTextArea(demo, 10, 15);
        cuadro.add(new JScrollPane(areaTexto1)); // agrega panel de desplazamiento

        botonCopiar = new JButton("Copy >>>"); // crea botón para copiar
        cuadro.add(botonCopiar); // agrega botón de copia al cuadro
        botonCopiar.addActionListener(
                new ActionListener() // clase interna anónima
                {
                    // establece el texto en areaTexto2 con el texto seleccionado de areaTexto1
                    @Override

                    public void actionPerformed(ActionEvent evento) {
                        areaTexto2.setText(areaTexto1.getSelectedText());
                    }
                }
        );

        areaTexto2 = new JTextArea(10, 15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2)); // agrega panel de desplazamiento

        add(cuadro); // agrega cuadro al marco
    }
} // fin de la clase MarcoAreaTexto
