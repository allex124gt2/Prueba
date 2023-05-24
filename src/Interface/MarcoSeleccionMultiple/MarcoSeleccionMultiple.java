package Interface.MarcoSeleccionMultiple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoSeleccionMultiple extends JFrame {

    private final JList<String> listaJListColores; // lista para guardar los nombres de los colores
    private final JList<String> listaJListCopia; // lista en la que se van a copiar los nombres de los colores
    private JButton botonJButtonCopiar; // botón para copiar los nombres seleccionados
    private static final String[] nombresColores = {"Black", "Blue", "Cyan", "Dark gray", "Gray", "Green", "Light gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"
    };

    // Constructor de MarcoSeleccionMultiple
    public MarcoSeleccionMultiple() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        listaJListColores = new JList<String>(nombresColores); // lista de nombres de colores

        listaJListColores.setVisibleRowCount(5); // muestra cinco filas
        listaJListColores.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListColores)); // agrega lista con panel de desplazamiento

        botonJButtonCopiar = new JButton("Copy>>>");
        botonJButtonCopiar.addActionListener(
                new ActionListener() // clase interna anónima
                {
                    // maneja evento de botón
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        // coloca los valores seleccionados en listaJListCopia
                        listaJListCopia.setListData(
                                listaJListColores.getSelectedValuesList().toArray(
                                        new String[0]));
                    }
                }
        );

        add(botonJButtonCopiar); // agrega el botón copiar a JFrame

        listaJListCopia = new JList<String>(); // lista para guardar nombres de colores copiados
        listaJListCopia.setVisibleRowCount(5); // muestra 5 filas
        listaJListCopia.setFixedCellWidth(100); // establece la anchura
        listaJListCopia.setFixedCellHeight(15); // establece la altura
        listaJListCopia.setSelectionMode(
                ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListCopia)); // agrega lista con panel de desplazamiento
    }
} // fin de la clase MarcoSeleccionMultiple

